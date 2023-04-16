package com.tasleem.driver.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.tasleem.driver.R;
import com.tasleem.driver.components.MyAppTitleFontTextView;
import com.tasleem.driver.components.MyFontTextView;
import com.tasleem.driver.models.datamodels.Analytic;

import java.util.ArrayList;

/**
 * Created by elluminati on 28-Jun-17.
 */

public class TripAnalyticAdapter extends RecyclerView.Adapter<TripAnalyticAdapter.OrderAnalyticView> {

    private final ArrayList<Analytic> arrayListProviderAnalytic;

    public TripAnalyticAdapter(ArrayList<Analytic> arrayListProviderAnalytic) {
        this.arrayListProviderAnalytic = arrayListProviderAnalytic;
    }

    @Override
    public OrderAnalyticView onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_analitic_item, parent, false);
        return new OrderAnalyticView(view);
    }

    @Override
    public void onBindViewHolder(OrderAnalyticView holder, int position) {
        holder.tvAnalyticName.setText(arrayListProviderAnalytic.get(position).getTitle());
        holder.tvAnalyticValue.setText(arrayListProviderAnalytic.get(position).getValue());
    }

    @Override
    public int getItemCount() {
        return arrayListProviderAnalytic.size();
    }

    protected class OrderAnalyticView extends RecyclerView.ViewHolder {

        MyFontTextView tvAnalyticValue;
        MyAppTitleFontTextView tvAnalyticName;

        public OrderAnalyticView(View itemView) {
            super(itemView);
            tvAnalyticValue = itemView.findViewById(R.id.tvAnalyticValue);
            tvAnalyticName = itemView.findViewById(R.id.tvAnalyticName);
        }
    }
}
