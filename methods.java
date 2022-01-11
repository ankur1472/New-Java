package com.company;

import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        String ans = sum();
        System.out.println(ans);

    }
    static String sum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 no. ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of " +num1 + " " +num2 + " is " + sum);
        String greating = "Hey bucket is full";
        return greating;
    }

}
