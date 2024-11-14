package com.perscholas.java_basics;

public class Question5 {
    public static void main(String[] args) {
//    	Write a program that declares two double variables, assigns a number to each, and divides the larger by the smaller number.
//      Assign the result to a variable. Print out the result. Now, cast the result to an integer.
//      Print out the result again.
        double doubleFirst = 5.9;
        double doubleSecond = 20.5;
        int myInt = (int) doubleSecond;
        double result = myInt / doubleFirst;
        System.out.println(result);

    }
}
