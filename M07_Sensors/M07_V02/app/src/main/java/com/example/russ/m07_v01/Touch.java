package com.example.russ.m07_v01;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

public class Touch extends Ball{

    double radius = 10;      // Ball's radius
    double x;                // Ball's center (x,y)
    double y;
    double speedX;           // Ball's speed
    double speedY;
    double speed_resistance = 0.1f; //amount of slow-down
    double acc_resistance = 0.1f; //amount of slow-down
    private RectF bounds;   // Needed for Canvas.drawOval
    private Paint paint;    // The paint style, color used for drawing

    public Touch(int color, float x, float y, float speedX, float speedY) {
        super(color, x, y, speedX, speedY);

        bounds = new RectF();
        paint = new Paint();
        paint.setColor(color);

        // use parameter position and speed
        this.x = x;
        this.y = y;
        this.speedX = 1;
        this.speedY = 1;
    }

    public void draw(Canvas canvas) {
        // convert to float for bounds
        bounds.set((float) (x - radius),
                (float) (y - radius),
                (float) (x + radius),
                (float) (y + radius));
        canvas.drawOval(bounds, paint);
    }
}
