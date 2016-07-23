package com.etechtips;

import java.util.Random;

public class Main {
 
  Circle circle;

  public Main() {
      this.circle = new Circle();
  } 
  public static void main(String[] args) {
      Main m = new Main();
      int pointLength = 0;
      int argSize = args.length;
      String outputType = "string";
      String jsOutput = "";
      String centerOutput = "";
      int offset =10;
      if (args.length >= 1) {
          for (int i = 0; i < argSize;i++) {
            if (args[i].equals("--js")) {
              outputType = "js";
            }
            else if (args[i].equals("-o")) {
              i++;
              offset = Integer.parseInt(args[i]);
            }
            else {
              try {
                pointLength = Integer.parseInt(args[i]);
              } catch(NumberFormatException nfe) {
                System.err.println("Argument must be an integer");
                System.exit(1);
              }
            }
          }
      } else {
        System.err.println("Number of Points argument required");
        System.exit(1);
      }
      Point[] p = new Point[pointLength];
      Random random = new Random();
      if (outputType.equals("js")) {
        System.out.println("ctx.fillStyle = \"red\";");
      }
      for (int x = 0;x< p.length; x++)
      {
          p[x] = new Point(Main.getRandomInt(random,0,100),Main.getRandomInt(random,0,100));
          if (outputType.equals("string")) {
            System.out.print(p[x].to_string() + "\n");
          } else {
            System.out.print(p[x].to_js(offset) + "\n");
          }
      } 

      m.circle.encircle(p);
      if (outputType == "string") {
        System.out.println(m.circle.to_string());
      } else {
        System.out.println(m.circle.to_js(offset));
      }
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
