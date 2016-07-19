package com.etechtips;

public class Point {

  private int x;
  private int y;

  public Point(int x,int y) {
    this.x = x;
    this.y = y;
  }

  public String to_string() {
    return  "{ " + this.x + ", " + this.y + "}";
  }
  public int getX() {
    return this.x;
  }
  public int getY() {
    return this.y;
  }
}
