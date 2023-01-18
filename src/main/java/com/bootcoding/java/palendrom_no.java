package com.bootcoding.java;

import java.util.Scanner;

public class palendrom_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        int n= sc.nextInt();
        int temp=n;
        int rem=0;
        while (n!=0) {
            System.out.println("n:" + n + "| rem:" + rem);
            rem = rem * 10 + n % 10;
            n = n / 10;
        }
        if(temp == rem){
            System.out.println(temp +" is a palindrom number");
        }else{
            System.out.println(temp +" is not palindrom number");
        }
    }
}
//methods
//array
//string
//oops class and object
//inheritance
//encapsulation
//polymorphisms
//abstraction
//omp object message passing
//java memorey model
//a project using java
//junit