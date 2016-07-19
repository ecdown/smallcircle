package com.etechtips.test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.etechtips.Point;

public class PointTest {
  Point point = new Point(2,3);
  String newPoint = point.to_string();
  String testPoint = "{ 2, 3}";

  @Test
  public void testPoint() {
    System.out.println("@Test Point(): " + newPoint + " = " + testPoint);
    assertEquals(testPoint,newPoint);
  }

}

