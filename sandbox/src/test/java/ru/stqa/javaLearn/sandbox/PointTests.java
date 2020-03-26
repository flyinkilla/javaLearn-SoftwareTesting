package ru.stqa.javaLearn.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
    @Test
    public void testDistance() {
        Point p1 = new Point(1,2);
        Point p2 = new Point (3, 4);
        assert p1.distance(p2) == 2.8284271247461903;
    }
    @Test
    public void testDistanceDataType() {
        Point p1 = new Point(1,2);
        Point p2 = new Point (3, 4);
        Assert.assertEquals(p1.distance(p2), 2.8284271247461903);
    }
}
