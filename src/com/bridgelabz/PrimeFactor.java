package com.bridgelabz;

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        System.out.println("Prime factor number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a;
        for(a = 2; a <= n/2; a++){
            if(n % a ==0) {
                System.out.println(n =n / a);

            }else {
                System.out.println(a=a + 1);

            }
        }
        System.out.println(n);
    }
}
