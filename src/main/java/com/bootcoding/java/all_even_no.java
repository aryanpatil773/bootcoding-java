package com.bootcoding.java;

import java.util.Scanner;

public class all_even_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        int num = sc.nextInt();
        all_even_no(num);
    }
        public static void all_even_no(int num){

        int i=2;
        while (i<=num) {
            System.out.println(i + "");
            i = i + 2;
        }
        }
    }

