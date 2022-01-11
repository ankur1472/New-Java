package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
// Take the input of 2 no. and print the sum
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 no. ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of " +num1 + " " +num2 + " is " + sum);

    }
}
