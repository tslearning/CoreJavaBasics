package com.perscholas.java_basics;

public class Question6 {
    public static void main(String[] args) {
//  Write a program that declares two integer variables, x and y, and assigns the number 5 to x and the number 6 to y.
//  Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign it to q.
//  Print q again.
        int x = 5;
        int y = 6;
//        int q = y / x;
//        System.out.println(q);

        double q = (double) y;
        System.out.println(q);

    }
}