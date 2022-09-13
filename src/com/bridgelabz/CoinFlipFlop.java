package com.bridgelabz;

public class CoinFlipFlop {
    public static void main(String[] args) {
        double flipcoin = Math.floor(Math.random() * 8) % 2;
        if (flipcoin == 0) {
            System.out.println("Head");
        } else {
            System.out.println("Tail");
        }
    }
}
