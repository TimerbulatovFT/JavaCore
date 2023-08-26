package com.company.lesson6;

public class Array4 {
    public static void main(String[] args) {
        int[] array = {5, 2, 3, 9};
        print(array);
        System.out.println();
        array = new int[]{34, 545, 565};
        print(array);
        print(new int[]{23,4546,6567,3});
    }

    static void print (int[] array){
        for (int el : array) {
            System.out.println("Элемент " + el);
        }
    }


}
