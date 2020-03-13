package com.istiak.canvastest;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.graphics.Canvas;
import android.graphics.Bitmap;

import androidx.appcompat.app.AppCompatActivity;


public class CanvasActivity extends AppCompatActivity {
    private Context mContext;
    private Resources mResources;
    private RelativeLayout mRelativeLayout;
    private Button mButton;
    private ImageView mImageView;
    Canvas canvas;
    Bitmap bitmap;
    Bitmap dstBitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        // Get the application context
        mContext = getApplicationContext();

        // Get the Resources
        mResources = getResources();

        // Get the widgets reference from XML layout
        mRelativeLayout = (RelativeLayout) findViewById(R.id.rl);
        mButton = (Button) findViewById(R.id.btn);
        mImageView = (ImageView) findViewById(R.id.iv);

        bitmap = BitmapFactory.decodeResource(
                mResources,
                R.drawable.klop
        );

        // Define an offset value between canvas and bitmap
        final int offset = 50;

        // Initialize a new Bitmap to hold the source bitmap
        dstBitmap = Bitmap.createBitmap(
                bitmap.getWidth() + offset * 2, // Width
                bitmap.getHeight() + offset * 2, // Height
                Bitmap.Config.ARGB_8888 // Config
        );

        canvas = new Canvas(dstBitmap);

        // Set a click listener for Button widget
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Bitmap to draw on the canvas


                // Initialize a new Canvas instance


                // Draw a solid color on the canvas as background
                canvas.drawColor(Color.LTGRAY);

                /*
                    public void drawBitmap (Bitmap bitmap, float left, float top, Paint paint)
                        Draw the specified bitmap, with its top/left corner at (x,y), using the
                        specified paint, transformed by the current matrix.

                        Note: if the paint contains a maskfilter that generates a mask which extends
                        beyond the bitmap's original width/height (e.g. BlurMaskFilter), then the
                        bitmap will be drawn as if it were in a Shader with CLAMP mode. Thus the
                        color outside of the original width/height will be the edge color replicated.

                        If the bitmap and canvas have different densities, this function will take
                        care of automatically scaling the bitmap to draw at the same density
                        as the canvas.

                    Parameters
                        bitmap : The bitmap to be drawn
                        left : The position of the left side of the bitmap being drawn
                        top : The position of the top side of the bitmap being drawn
                        paint : The paint used to draw the bitmap (may be null)
                */

                //Finally, Draw the source bitmap on the canvas
                canvas.drawBitmap(
                        bitmap, // Bitmap
                        offset, // Left
                        offset, // Top
                        null // Paint
                );

                // Display the newly created bitmap on app interface
                mImageView.setImageBitmap(dstBitmap);
            }
        });
    }
}
