package com.bootcoding.java;

import java.util.Scanner;

public class natural_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        int num = sc.nextInt();
        natural_no(num);
    }

        public static void natural_no(int num) {
            int i = 1;
            while (i <= num) {
                System.out.println(i);
                i++;
            }

        }
    }

