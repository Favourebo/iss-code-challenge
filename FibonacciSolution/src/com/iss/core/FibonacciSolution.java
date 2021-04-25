package com.iss.core;

import java.util.Scanner;

public class FibonacciSolution {

    public static void main (String[] args){
        int fibonacciSize,firstVal,secondVal,sum=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter fibonacci size:");
        fibonacciSize = sc.nextInt();

        System.out.println("Enter First Value Of series:");
        firstVal = sc.nextInt();

        System.out.println("Enter Second Value Of series:");
        secondVal = sc.nextInt();

        sum = firstVal+secondVal; //Getting the initial sum of both values

        System.out.println("Fibonacci Series:");
        for(int i = 1; i <= fibonacciSize; i++){
            System.out.print(firstVal + " ");

            firstVal = secondVal;
            secondVal = sum;
            sum = firstVal + secondVal;
        }
    }
}
