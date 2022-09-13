package com.bridgelabz;

import java.util.Scanner;

public class AlphabetVowelOrConstant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Letter");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("This Is A Vowels");
                break;
            default:
                System.out.println("This is A Constant");
        }
    }
}
