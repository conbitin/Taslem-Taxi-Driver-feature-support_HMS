package org.xms.g.gcm;

/**
 * A periodic task is one that will recur at the specified interval, without needing to be rescheduled.<br/>
 * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
 * com.google.android.gms.gcm.PeriodicTask: A periodic task is one that will recur at the specified interval, without needing to be rescheduled.<br/>
 */
public class PeriodicTask extends org.xms.g.gcm.Task {
    /**
     * android.os.Parcelable.Creator.CREATOR a public CREATOR field that generates instances of your Parcelable class from a Parcel.<br/>
     * <p>
     * com.google.android.gms.gcm.PeriodicTask.CREATOR: <a href="https://developers.google.com/android/reference/com/google/android/gms/gcm/PeriodicTask#public-static-final-creatorperiodictask-creator">https://developers.google.com/android/reference/com/google/android/gms/gcm/PeriodicTask#public-static-final-creatorperiodictask-creator</a><br/>
     */
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.gcm.PeriodicTask createFromParcel(android.os.Parcel param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.g.gcm.PeriodicTask[] newArray(int param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    };
    
    /**
     * org.xms.g.gcm.PeriodicTask.PeriodicTask(org.xms.g.utils.XBox) constructor of PeriodicTask with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public PeriodicTask(org.xms.g.utils.XBox param0) {
        super(param0);
    }
    
    /**
     * org.xms.g.gcm.PeriodicTask.getMFlexInSeconds() return the attribute.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.gcm.PeriodicTask.mFlexInSeconds: <a href="https://developers.google.com/android/reference/com/google/android/gms/gcm/PeriodicTask#protected-long-mflexinseconds">https://developers.google.com/android/reference/com/google/android/gms/gcm/PeriodicTask#protected-long-mflexinseconds</a><br/>
     *
     * @return the return object is MFlexInSeconds
     */
    public long getMFlexInSeconds() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * org.xms.g.gcm.PeriodicTask.getMIntervalInSeconds() return the attribute.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.gcm.PeriodicTask.mIntervalInSeconds: <a href="https://developers.google.com/android/reference/com/google/android/gms/gcm/PeriodicTask#protected-long-mintervalinseconds">https://developers.google.com/android/reference/com/google/android/gms/gcm/PeriodicTask#protected-long-mintervalinseconds</a><br/>
     *
     * @return the return object is mIntervalInSeconds
     */
    public long getMIntervalInSeconds() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * XMS does not provide this api.<br/>
     */
    public long getFlex() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * XMS does not provide this api.<br/>
     */
    public long getPeriod() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * XMS does not provide this api.<br/>
     */
    public void toBundle(android.os.Bundle param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * XMS does not provide this api.<br/>
     */
    public java.lang.String toString() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * XMS does not provide this api.<br/>
     */
    public void writeToParcel(android.os.Parcel param0, int param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * org.xms.g.gcm.PeriodicTask.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.gcm.PeriodicTask.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted PeriodicTask object
     */
    public static org.xms.g.gcm.PeriodicTask dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * org.xms.g.gcm.PeriodicTask.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return true if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    /**
     * A periodic task is one that will recur at the specified interval, without needing to be rescheduled.<br/>
     * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
     * com.google.android.gms.gcm.PeriodicTask.Builder: A periodic task is one that will recur at the specified interval, without needing to be rescheduled.<br/>
     */
    public static class Builder extends org.xms.g.gcm.Task.Builder {
        
        /**
         * org.xms.g.gcm.PeriodicTask.Builder.Builder(org.xms.g.utils.XBox) constructor of Builder with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public Builder(org.xms.g.utils.XBox param0) {
            super(param0);
        }
        
        /**
         * org.xms.g.gcm.PeriodicTask.Builder.Builder() constructor of Builder.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.android.gms.gcm.PeriodicTask.Builder.Builder(): <a href="https://developers.google.com/android/reference/com/google/android/gms/gcm/PeriodicTask.Builder#public-periodictask.builder">https://developers.google.com/android/reference/com/google/android/gms/gcm/PeriodicTask.Builder#public-periodictask.builder</a><br/>
         *
         */
        public Builder() {
            super(((org.xms.g.utils.XBox) null));
        }
        
        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.gcm.PeriodicTask build() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.gcm.PeriodicTask.Builder setExtras(android.os.Bundle param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.gcm.PeriodicTask.Builder setFlex(long param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.gcm.PeriodicTask.Builder setPeriod(long param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.gcm.PeriodicTask.Builder setPersisted(boolean param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.gcm.PeriodicTask.Builder setRequiredNetwork(int param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.gcm.PeriodicTask.Builder setRequiresCharging(boolean param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.gcm.PeriodicTask.Builder setService(java.lang.Class<? extends org.xms.g.gcm.GcmTaskService> param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.gcm.PeriodicTask.Builder setTag(java.lang.String param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.gcm.PeriodicTask.Builder setUpdateCurrent(boolean param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        /**
         * XMS does not provide this api.<br/>
         */
        protected void checkConditions() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        /**
         * org.xms.g.gcm.PeriodicTask.Builder.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.gcm.PeriodicTask.Builder.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the input object
         * @return casted PeriodicTask Builder object
         */
        public static org.xms.g.gcm.PeriodicTask.Builder dynamicCast(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        /**
         * org.xms.g.gcm.PeriodicTask.Builder.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the input object
         * @return true if the Object is XMS instance, otherwise false
         */
        public static boolean isInstance(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }
}