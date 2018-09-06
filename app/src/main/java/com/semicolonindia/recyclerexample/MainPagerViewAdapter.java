package com.semicolonindia.recyclerexample;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by RANJAN SINGH on 8/16/2017.
 */

public class MainPagerViewAdapter extends PagerAdapter {

    Context context;
    ImageView imageView;
    TextView textView;

    public int[] image_resources={
            R.drawable.high_tatra_stream_182788,
            R.drawable.rocks_and_mountain_stream_197632,
            R.drawable.small_cookies_184538,
            R.drawable.small_mouse_macro_515329,
            R.drawable.small_sprouts_201599,
            R.drawable.small_tomatoes_200836
    };

    public MainPagerViewAdapter(Context context){
        this.context = context;
    }
    @Override
    public int getCount() {
        return image_resources.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view=layoutInflater.inflate(R.layout.swip_layout,container, false);
        // Intializing ImageView.
        imageView=item_view.findViewById(R.id.image_view);
        // Intializing TextView.
        textView=item_view.findViewById(R.id.image_count);
        // set ImageView.
        imageView.setImageResource(image_resources[position]);
        textView.setText("Image : " +position);
        container.addView(item_view);
        return item_view;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}
