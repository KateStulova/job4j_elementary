package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when180to20then16() {
        Point a = new Point(18, 0);
        Point b = new Point(2, 0);
        double expected = 16;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when50to24then5() {
        Point a = new Point(5, 0);
        Point b = new Point(2, 4);
        double expected = 5;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to60then6() {
        Point a = new Point(0, 0);
        Point b = new Point(6, 0);
        double expected = 6;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}