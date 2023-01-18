package com.bootcoding.java;

import java.util.Scanner;

public class boolean_even {
    public static void main(String[] args) {
//write a method to get boolean value on whether input no. is even or not

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        int num = sc.nextInt();
        even_no(num);
    }
        public static void even_no(int num){
        int n;
        if (num % 2 == 0) {
            System.out.println(num +" is even no.");
        }else{
            System.out.println(num + " is not a even no.");
        }

    }
}
