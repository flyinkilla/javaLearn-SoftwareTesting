package ru.stqa.javaLearn.sandbox;

public class MyFirstProgram {

    static double distance;

    public static void main(String[] args) {
        Point x = new Point(1.0, 2.0);
        Point y = new Point(3.0, 4.0);
        distance(x, y);
        System.out.println(distance);
    }

    public static void distance(Point p1, Point p2) {

        distance = Math.sqrt(Math.pow((p1.p2 - p1.p1), 2) + Math.pow((p2.p2 - p2.p1), 2));
    }

}