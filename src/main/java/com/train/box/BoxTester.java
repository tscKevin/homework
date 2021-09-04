package com.train.box;

import java.util.Scanner;

public class BoxTester {

    public static void main(String[] args) {
        Box3 box3 = new Box3();
        Box5 box5 = new Box5();
        Scanner scanner = new Scanner(System.in);
        float length = 0, width = 0;
        int height = 0;
        while (length != -1 && width != -1 && height != -1) {
            System.out.print("Please enter object's length:\t");
            length = scanner.nextFloat();
            if ( length <= 0 ) continue;
            System.out.print("Please enter object's width:\t");
            width = scanner.nextFloat();
            if ( width <= 0 ) continue;
            System.out.print("Please enter object's height:\t");
            height = scanner.nextInt();
            if ( height <= 0 ) continue;
            if ( box3.validate(length, width, height) ) {
                System.out.println("Box3");
            } else if ( box5.validate(length, width, height) ) {
                System.out.println("Box5");
            } else {
                System.out.println("Too big, sorry no size");
            }
        }
    }
}
