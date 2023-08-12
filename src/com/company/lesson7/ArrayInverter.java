package com.company.lesson7;

import java.util.Arrays;

public class ArrayInverter {
    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i<(array.length/2); i++){
            int tmp = array[i];
            array[i]=array[array.length-i-1];
            array[array.length-i-1]=tmp;
            System.out.println(Arrays.toString(array));
        }
        System.out.println(Arrays.toString(array));
    }
}
