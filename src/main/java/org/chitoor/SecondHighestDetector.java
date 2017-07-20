package org.chitoor;

import java.util.Arrays;

/**
 * Created by asrini on 7/20/2017.
 */
public class SecondHighestDetector {
    private static final int[] DATA = {52,31,88,37,56,52,84,50,66,96,7,85,44,17,6,51,79,76,25,65,9,3,38,25,19,68,47,79,44,42,10,30,90,71,74,47,24,81,4,8,85,83,68,98,85,81,18,1,71,69,89,33,7,88,40,42,53,43,28,86,90,99,22,20,36,36,65,21,54,43,88,74,89,76,54,76,30,67,83,8,4,24,88,95,14,40,26,19,88,95,80,93,90,96,15,9,50,55,28,52};

    private static int getValue(int[] data){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i: data){
            if(i > max){
                secondMax = max;
                max = i;
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        System.out.println(getValue(DATA));
        if(getValue(DATA) == 98){
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
}
