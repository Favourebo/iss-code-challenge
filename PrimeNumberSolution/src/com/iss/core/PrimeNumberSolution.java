package com.iss.core;

/**
 * A class that helps print numbers between 1 and 100 in a reverse order
 */
public class PrimeNumberSolution {


    public static boolean isPrimeNumber(int num){
        boolean flag = true;
         for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }


    public static void main(String args[]) {
        int n = 100;

        for (int i = n - 1; i >= 1; i--) {
            boolean isPrimeNumber = isPrimeNumber(i);
            if (isPrimeNumber)
                System.out.print(i+ " ");
         }
     }
}
