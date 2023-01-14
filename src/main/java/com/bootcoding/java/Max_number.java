package com.bootcoding.java;

import java.util.Scanner;

public class Max_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. one");
        int first =sc.nextInt();
        System.out.println("enter no.two");
        int second = sc.nextInt();
        System.out.println("enter no.three");
        int third = sc.nextInt();
        System.out.println("max no.is:");
        if (first >= second && first >= third)
            System.out.println( first + " is the maximum number.");
        else if (second >= first && second >= third)
            System.out.println( second + " is the maximum number.");
        else
            System.out.println( third + " is the maximum number.");
    }
    }

