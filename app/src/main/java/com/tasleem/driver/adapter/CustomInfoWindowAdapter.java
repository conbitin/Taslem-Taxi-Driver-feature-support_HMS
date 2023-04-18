package com.tasleem.driver.adapter;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;

import org.xms.g.maps.ExtensionMap;
import org.xms.g.maps.model.Marker;
import com.tasleem.driver.R;

public class CustomInfoWindowAdapter implements ExtensionMap.InfoWindowAdapter {

    private final Activity context;

    public CustomInfoWindowAdapter(Activity context){
        this.context = context;
    }

    @Override
    public View getInfoWindow(Marker marker) {
        return null;
    }

    @Override
    public View getInfoContents(Marker marker) {
        View view = context.getLayoutInflater().inflate(R.layout.info_window_layout, null);

        TextView tvTitle = (TextView) view.findViewById(R.id.tv_title);
        TextView tvSubTitle = (TextView) view.findViewById(R.id.tv_subtitle);

        tvTitle.setText(marker.getTitle());
        tvSubTitle.setText(marker.getSnippet());

        return view;
    }
}
