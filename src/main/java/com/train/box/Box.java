package com.train.box;

public class Box {
    float length;
    float width;
    int height;

    public Box() {
    }

    public Box(float length, float width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public boolean validate(float length, float width, int height) {
        return length <= this.length && width <= this.width && height <= this.height;
    }
}
