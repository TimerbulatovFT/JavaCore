package com.company.lesson9;

public class BoxOne {
    double width, height, depth;
    double getVolume() {
        return width * height * depth;
    }
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
