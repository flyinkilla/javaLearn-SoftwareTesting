package ru.stqa.javaLearn.sandbox;

public class MyFirstProgram {


    static double resultDistance;

    public static void main(String[] args) {
        Point p1 = new Point(1.0, 2.0);
        Point p2 = new Point(3.0, 4.0);
        resultDistance = p1.distance(p2);//debug
        System.out.println("Расстояние между точками на плоскости p1 " + p1.x + ", " + p1.y + " и p2 " + p2.x + ", " + p2.y + " = " + p1.distance(p2));
    }




}