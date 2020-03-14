package com.istiak.canvastest;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.FutureTarget;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;

import java.util.concurrent.ExecutionException;


public class CanvasGlideActivity extends AppCompatActivity {
    private Context mContext;
    private Resources mResources;
    private RelativeLayout mRelativeLayout;
    private Button mButton;
    private ImageView mImageView;
    FutureTarget<Bitmap> futureTarget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        mRelativeLayout = (RelativeLayout) findViewById(R.id.rl);
        mButton = (Button) findViewById(R.id.btn);
        mImageView = (ImageView) findViewById(R.id.iv);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Glide.with(getApplicationContext())
                        .asBitmap()
                        .load(R.drawable.klop)
                        .into(new CustomTarget<Bitmap>(1000, 1330) {
                            @Override
                            public void onResourceReady(@NonNull Bitmap resource, @Nullable Transition<? super Bitmap> transition) {
                                mImageView.setImageBitmap(resource);
                            }

                            @Override
                            public void onLoadCleared(@Nullable Drawable placeholder) {
                            }
                        });
            }
        });
    }
}
