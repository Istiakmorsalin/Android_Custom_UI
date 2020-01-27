package com.istiak.canvastest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class FirstCanvas extends View {

    Paint paint;
    Rect rect;

    public FirstCanvas(Context context) {
        super(context);
        paint = new Paint();
        rect = new Rect();
    }

    public FirstCanvas(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public FirstCanvas(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public FirstCanvas(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(3);

        canvas.drawRect(0, 0, canvas.getWidth() / 2, canvas.getHeight() / 2, paint);
    }
}
