package com.iss.core;

import java.util.Arrays;

public class PositiveIntegerSolution {


    //Question 1
    private int getSmallestPositiveInteger(int[] A) {
        //First sort array

        int arrLength = A.length;//Get length here, so you dont re-calculate each time the loop happens
        int minValue = 1;

        //Check if the array has any value. if it doesn't then just return 1 which is my minimum value;
        if(A.length == 0) return minValue;

        Arrays.sort(A);

        if(A[0] > 1) return minValue;

        if(A[arrLength-1] <= 0) return minValue;

        for (int i = 0; i < arrLength; i++) {
            if(A[i] == minValue) //Check if current value equals the lowest value you are expecting
                minValue++;
        }
        return minValue; //Return lowest value expected
    }






    public static void main(String args[]){
        PositiveIntegerSolution p = new PositiveIntegerSolution();
        System.out.println(p.getSmallestPositiveInteger(new int[] {1,5,7,4,1,2}));
        System.out.println(p.getSmallestPositiveInteger(new int[] {1,2,3})); //This returns 4
        System.out.println(p.getSmallestPositiveInteger(new int[] {-1,-3})); //This returns 41
    }
}
