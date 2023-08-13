package com.company.lesson9;

public class BoxDemoTwo {
    public static void main(String[] args) {
        BoxOne box1 = new BoxOne();
        //BoxOne box2 = box1;
        box1.depth=10;
        box1.width=20;
        box1.height=50;
        //box2.depth=3;

        System.out.println("Depth box1 = " + box1.depth);
        //System.out.println("Depth box2 = " + box2.depth);
    }
}
