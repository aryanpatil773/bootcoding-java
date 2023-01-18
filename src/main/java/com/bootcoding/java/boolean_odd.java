package com.bootcoding.java;

import java.util.Scanner;

public class boolean_odd {
    public static void main(String[] args) {
//write a method to get boolean value on whether input no. is odd or not
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        int num = sc.nextInt();
        odd_no(num);
    }
    public static void odd_no(int num){
        int n;
        if (num % 2 == 1) {
            System.out.println(num +" is odd no.");
        }else{
            System.out.println(num + " is not a odd no.");
        }

    }
}
