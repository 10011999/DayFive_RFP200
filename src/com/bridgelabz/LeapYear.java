package com.bridgelabz;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2004;
        if (year % 4 == 0) {
            System.out.println("Leap Year");
        } else if (year % 400 == 0 && year != 100) {
            System.out.println("This is a Leap Year ");
        } else {
            System.out.println("Not A Leap Year");
        }
    }
}
