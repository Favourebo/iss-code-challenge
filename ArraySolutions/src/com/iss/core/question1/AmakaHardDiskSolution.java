package com.iss.core.question1;

public class AmakaHardDiskSolution {


    int encodeInteger(int x, int n){
        n = n<<(1<<(1<<(1<<1)));

         x = x | n; //Since OR is irreversible;
         x = Integer.valueOf(Integer.toBinaryString(x)) + Integer.valueOf(Integer.toBinaryString(n)); //We need to store a binary version of x answer
        return x;
    }

    //Created A decode integer method
   int decodeInteger(int ModifiedBinaryA, int A){
      //ModifiedBinaryA is in binary format

        int binaryN = ModifiedBinaryA - Integer.valueOf(Integer.toBinaryString(A));
        Long longN = Long.parseLong(String.valueOf(binaryN), 2);

        int n = longN.intValue();

        int b = n>>(1<<(1<<(1<<1)));

        return b;
    }


    void encodeArray(int[] A, int[] B, int n){
        for(int i=0;i<n;i++) {
            A[i] = encodeInteger(A[i], B[i]);
        }
    }


    //Since A was not discarded we can use that to get B
    void decodeArray(int[] A, int[] modifiedA, int n){
        //Since A was not discarded we keep it
         int[] B = new int[n];
         for(int i=0;i<n;i++) {
            B[i] = decodeInteger(A[i], modifiedA[i]);
        }
    }

}
