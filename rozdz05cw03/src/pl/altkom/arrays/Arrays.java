package pl.altkom.arrays;

import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        int[] testArr, testArr2;
        testArr = new int[25_000_000];
        testArr2 = new int[25_000_000];
        int arrLength = testArr.length;
        System.out.println(arrLength);

        Random generator = new Random();

        for (int index = 0; index < arrLength; index++ ) {
            testArr[index] = generator.nextInt(90) + 10;
        }

        long start = System.currentTimeMillis();
        for (int index = 0; index < arrLength; index++) {
            testArr2[index] = testArr[index];
        }

        long stop = System.currentTimeMillis();
        System.out.println("Kopiowanie za pomocą pętli " +(stop-start) + " ms");

        start = System.currentTimeMillis();
        System.arraycopy(testArr, 0, testArr2, 0, arrLength);
        stop = System.currentTimeMillis();
        System.out.println("Kopiowanie za pomocą arraycopy " + (stop-start)+ " ms");
    }
}
