/*
 * Copyright 2020 Supasin Tatiyanupanwong
 * Copyright 2013 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tasleem.driver.lib.places.utils.clustering.algo;

import androidx.collection.LruCache;

import com.tasleem.driver.lib.places.utils.clustering.Cluster;
import com.tasleem.driver.lib.places.utils.clustering.ClusterItem;

import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Optimistically fetch clusters for adjacent zoom levels, caching them as necessary.
 */
public class PreCachingAlgorithmDecorator<T extends ClusterItem> extends AbstractAlgorithm<T> {
    private final Algorithm<T> mAlgorithm;

    private final LruCache<Integer, Set<? extends Cluster<T>>> mCache = new LruCache<Integer, Set<? extends Cluster<T>>>(5);
    private final ReadWriteLock mCacheLock = new ReentrantReadWriteLock();
    private final Executor mExecutor = Executors.newCachedThreadPool();

    public PreCachingAlgorithmDecorator(Algorithm<T> algorithm) {
        mAlgorithm = algorithm;
    }

    @Override
    public boolean addItem(T item) {
        boolean result = mAlgorithm.addItem(item);
        if (result) {
            clearCache();
        }
        return result;
    }

    @Override
    public boolean addItems(Collection<T> items) {
        boolean result = mAlgorithm.addItems(items);
        if (result) {
            clearCache();
        }
        return result;
    }

    @Override
    public void clearItems() {
        mAlgorithm.clearItems();
        clearCache();
    }

    @Override
    public boolean removeItem(T item) {
        boolean result = mAlgorithm.removeItem(item);
        if (result) {
            clearCache();
        }
        return result;
    }

    @Override
    public boolean removeItems(Collection<T> items) {
        boolean result = mAlgorithm.removeItems(items);
        if (result) {
            clearCache();
        }
        return result;
    }

    @Override
    public boolean updateItem(T item) {
        boolean result = mAlgorithm.updateItem(item);
        if (result) {
            clearCache();
        }
        return result;
    }

    private void clearCache() {
        mCache.evictAll();
    }

    @Override
    public Set<? extends Cluster<T>> getClusters(float zoom) {
        int discreteZoom = (int) zoom;
        Set<? extends Cluster<T>> results = getClustersInternal(discreteZoom);
        if (mCache.get(discreteZoom + 1) == null) {
            mExecutor.execute(new PrecacheRunnable(discreteZoom + 1));
        }
        if (mCache.get(discreteZoom - 1) == null) {
            mExecutor.execute(new PrecacheRunnable(discreteZoom - 1));
        }
        return results;
    }

    @Override
    public Collection<T> getItems() {
        return mAlgorithm.getItems();
    }

    @Override
    public void setMaxDistanceBetweenClusteredItems(int maxDistance) {
        mAlgorithm.setMaxDistanceBetweenClusteredItems(maxDistance);
        clearCache();
    }

    @Override
    public int getMaxDistanceBetweenClusteredItems() {
        return mAlgorithm.getMaxDistanceBetweenClusteredItems();
    }

    private Set<? extends Cluster<T>> getClustersInternal(int discreteZoom) {
        Set<? extends Cluster<T>> results;
        mCacheLock.readLock().lock();
        results = mCache.get(discreteZoom);
        mCacheLock.readLock().unlock();

        if (results == null) {
            mCacheLock.writeLock().lock();
            results = mCache.get(discreteZoom);
            if (results == null) {
                results = mAlgorithm.getClusters(discreteZoom);
                mCache.put(discreteZoom, results);
            }
            mCacheLock.writeLock().unlock();
        }
        return results;
    }

    private class PrecacheRunnable implements Runnable {
        private final int mZoom;

        public PrecacheRunnable(int zoom) {
            mZoom = zoom;
        }

        @Override
        public void run() {
            try {
                // Wait between 500 - 1000 ms.
                Thread.sleep((long) (Math.random() * 500 + 500));
            } catch (InterruptedException e) {
                // ignore. keep going.
            }
            getClustersInternal(mZoom);
        }
    }
}
