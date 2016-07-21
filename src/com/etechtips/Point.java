package com.etechtips;

public class Point {

  private int x;
  private int y;
  int offset = 15;

  public Point(int x,int y) {
    this.x = x;
    this.y = y;
  }

  public String to_string() {
    return  "{ " + this.x + ", " + this.y + "}";
  }
  public String to_js(int offset) {
    return "ctx.fillRect(" + (this.x + this.offset) + "," + (this.y  + this.offset) + ",1,1);";
  }
  public int getX() {
    return this.x;
  }
  public int getY() {
    return this.y;
  }
}
