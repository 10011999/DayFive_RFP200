package com.bridgelabz;

public class LargestThreeNumber {
    public static void main(String[] args) {
        int a = 10,b = 40,c = 30;
        if (a > b && a > c){
            System.out.println("A is a greater value");
        } else if (b > c && b > a) {
            System.out.println("B is greater value");
        }else {
            System.out.println("C is a greater value");
        }
    }
}
