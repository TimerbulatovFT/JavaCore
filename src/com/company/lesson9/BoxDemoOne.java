package com.company.lesson9;
import com.company.lesson9.BoxOne;
public class BoxDemoOne {
    public static void main(String[] args) {
        BoxOne newBox = new BoxOne();
        newBox.setDim(10,20,30);
        System.out.println(newBox.getVolume());
        BoxOne newBoxTwo = new BoxOne();
        newBoxTwo.setDim(50,2,17);
        System.out.println(newBoxTwo.getVolume());
    }
}
