package com.bootcoding.java;

import java.util.Scanner;

public class all_even_cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        int num = sc.nextInt();

        int i = 1;
        while (i <= num) {
            System.out.println(i + "");
            i = num * num * num;
        }
    }
}
