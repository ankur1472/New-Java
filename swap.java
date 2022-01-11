package com.company;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        swapping(10,20);

    }

    static void swapping(int a, int b) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter no. to be swaped ");
        int temp = 0;
//        a = in.nextInt();
//        b = in.nextInt();
        temp = a;
        a = b;
        b = temp;
        System.out.println(a + "  " + b);




    }

}
