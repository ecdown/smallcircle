package com.etechtips;
import com.etechtips.Point;

/* 157 The Smallest Circle */

public class Circle {
    private int radius;
    private Point center;

    public Circle(int radius, int x,int y) {
        this(radius, new Point(x,y));
    }

    public Circle(int radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public Circle() {
        this(0,0,0);
    }
    public String to_string() {
        return "{center: " + this.center.to_string() + ", radius: " + radius + "}";
    }
  
    public String encircle(Point[] points) {
        int numberOfPoints = points.length;
        int minPointX = points[0].getX();
        int minPointY = points[0].getY();
        int maxPointX = points[0].getX();
        int maxPointY = points[0].getY();
        int centerX;
        int centerY;
        int radius;

        // Find maximum X,Y and minimum Y points in circle to create bounding box
        for (int count = 0; count < numberOfPoints; count++) {
            if (points[count].getX() < minPointX ) {
                minPointX = points[count].getX();
            }
            if (points[count].getY() < minPointY) {
                minPointY = points[count].getY();
            }

            if (points[count].getY() > maxPointY) {
                maxPointY = points[count].getY();
            }
            if (points[count].getX() > maxPointX) {
                maxPointX = points[count].getX();
            }
        }
        centerX = ((maxPointX - minPointX) / 2) + minPointX;
        centerY = ((maxPointY - minPointY) / 2) + minPointY;

        this.setCenter( new Point(centerX,centerY));
        
        // use distance formula        
        // sqrt( x2 - x1)^2 + (y2 - y1)+2)
        radius = (int) Math.round(Math.sqrt(Math.pow(maxPointX - centerX,2) + Math.pow(maxPointY - centerY,2) )); 
        
        this.setRadius(radius);
        return this.to_string();
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void setCenter(Point center) {
        this.center = center;
    }
}
