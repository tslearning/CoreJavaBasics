package com.perscholas.java_basics;

public class Question8 {
    public static void main(String[] args) {

        double coffee = 2.00;
        double cappuccino = 3.25;
        double espresso = 4.50;

        double subtotal = coffee * 3 + cappuccino * 4 + espresso * 2;

        final double SALES_TAX = .079 * subtotal;

        double totalSale = subtotal + SALES_TAX;

        System.out.println(totalSale);



    }
}
