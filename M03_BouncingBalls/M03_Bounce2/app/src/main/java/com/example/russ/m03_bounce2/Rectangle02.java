package com.example.russ.m03_bounce2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

public class Rectangle02 extends Shape{

    int points;

    public Rectangle02(int color) {
        super(color);
        RectF bounds = new RectF();
        Paint paint = new Paint();
        paint.setColor(color);


    }
//    // Constructor
//    public Rectangle02(int color, float x, float y, float speedX, float speedY) {
//        super();
//        RectF bounds = new RectF();
//        Paint paint = new Paint();
//        paint.setColor(color);
//
//        // use parameter position and speed
//        this.x = x;
//        this.y = y;
//        this.speedX = speedX;
//        this.speedY = speedY;
//    }


    public void draw(Canvas canvas) {
        bounds.set(x - radius, y - radius, x + radius, y + radius);
//        left top right bottom
        canvas.drawRect(x-50,y-100,x+50,y+100, paint);
//        canvas.drawRect(1,1,x,y,paint); //saved for later

//        canvas.drawOval(bounds, paint);

    }

    public boolean collide(Shape obj){
        if (this == obj)
            return false;
        float x_dist = Math.abs(this.x - obj.x);
        float y_dist = Math.abs(this.y - obj.y);
        if (x_dist < 10 && y_dist < 10) {

        }

        int threshold = 30;

        if ((x_dist <= threshold && y_dist <= threshold)) {
            points++;
            System.out.println("you hit the Rectangle, your points are: "+points);

            return true;
        }
        return false;
    }


}
