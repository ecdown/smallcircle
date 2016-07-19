package com.etechtips.test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.etechtips.Circle;

public class CircleTest {
  Circle circle = new Circle(3,2,3);
  String newCircle = circle.to_string();
  String testCircle = "{center: { 2, 3}, radius: 3}";

  @Test
  public void testCircle() {
    System.out.println("@Test Circle(): " + newCircle + " = " + testCircle);
    assertEquals(testCircle,newCircle);
  }
}

