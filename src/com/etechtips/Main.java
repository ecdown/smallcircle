package com.etechtips;

import java.util.Random;

public class Main {
 
  Circle circle;

  public Main() {
      this.circle = new Circle();
  } 
  public static void main(String[] args) {
      Main m = new Main();
      Point[] p = new Point[2];
      Random random = new Random();
      for (int x = 0;x< 2; x++)
      {
          p[x] = new Point(Main.getRandomInt(random,0,100),Main.getRandomInt(random,0,100));
          System.out.print(p[x].to_string() + "\n");
      } 

      System.out.println(m.circle.encircle(p));
  }

    public static double getRandomDouble(final Random random,
        final int lowerBound,
        final int upperBound,
        final int decimalPlaces){

        if (lowerBound < 0 || upperBound <= lowerBound || decimalPlaces < 0) 
        {
            throw new IllegalArgumentException("All arguments must be larger than 0");
        }

        final double dbl =
            ((random == null ? new Random() : random).nextDouble() * (upperBound - lowerBound)) + lowerBound;
        return dbl;
    }

    public static int getRandomInt(Random random, int min, int max) {

    // nextInt is normally exclusive of the top value,
    // so add 1 to make it inclusive
    int randomNum = random.nextInt((max - min) + 1) + min;

    return randomNum;
}

}
