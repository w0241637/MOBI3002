package com.example.russ.m07_v01;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;

/**
 * Created by Russ on 08/04/2014.
 */
public class Box {

    int xMin, xMax, yMin, yMax;
    private Paint paint;  // paint style and color
    private Rect bounds;

    public Box(int color) {

        paint = new Paint();
        paint.setStrokeWidth(20);
        paint.setColor(color);
        bounds = new Rect();
    }

    public void set(int x, int y, int width, int height) {
        xMin = x;
        xMax = x + width - 1;
        yMin = y;
        yMax = y + height - 1;
        // The box's bounds do not change unless the view's size changes
        bounds.set(xMin, yMin, xMax, yMax);
    }

    public void draw(Canvas canvas) {
        canvas.drawRect(bounds, paint);
    }
}
