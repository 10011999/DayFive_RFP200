package com.bridgelabz;

public class HarmonicNumber {
    public static void main(String[] args) {
        double n = 10, i;
        double num = 0;
        for (i = 1; i <= n; i++) {
            num = num + (1 / i);
        }
        System.out.println("Harmonic Number: " + num);
    }
}
