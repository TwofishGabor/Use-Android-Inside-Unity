package com.example.xyz.uihelper;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

/**
 * Created by David on 08/08/16.
 */
public class Utils {

    private static ImageView AddImageView(Activity activity, int imgResId, int x, int y) {
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(imgResId);


        FrameLayout frameLayout = new FrameLayout(activity);

        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT));

        //adding view to layout
        frameLayout.addView(imageView);

        activity.addContentView(frameLayout, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));

        frameLayout.setX(x);
        frameLayout.setY(y);

        return imageView;
    }

    public static void AddImageView(final Activity activity, final int x, final int y) {
        final int resImageId = R.drawable.android;
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AddImageView(activity, resImageId, x, y);
            }
        });

    }

}
