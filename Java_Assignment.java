package com.company;

import java.util.Scanner;

public class Java_Assignment {
    public static void main(String[] args) {
        cicle(5);
        triangle(4,6);
        rectangle(4,5);
        isoscelestriangle(3,7);
        Parallelogram(2,4);
        Rhombus(1,2);
        EquilateralTriangle(4);
    }

    static void EquilateralTriangle(double i) {
        double area = (int) (Math.sqrt(3)*Math.pow(i,2)/4);
        System.out.println(area);
    }

    static void Rhombus(int i, int i1) {
        int area = (i * i1)/2;
        System.out.println(area);
    }

    static void Parallelogram(int i, int i1) {
        int area = (i * i1)/2;
        System.out.println(area);
    }

    static void isoscelestriangle(int i, int i1) {
        int area = (i * i1)/2;
        System.out.println(area);
    }

    static void rectangle(int i, int i1) {
        int area = (i * i1)/2;
        System.out.println(area);
    }

    static void triangle(int i, int i1) {
        int area = (i * i1)/2;
        System.out.println(area);
    }

    static void cicle(int i) {
        int area = (int) (3.14*Math.pow(i,2));
        System.out.println(area);
    }

}
