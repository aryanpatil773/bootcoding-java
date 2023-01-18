package com.bootcoding.java;

import java.util.Scanner;

public class Armstrong_no{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        int num = sc.nextInt();
        Armstrong_no(num);
//        Armstrong_no(153);
//        Armstrong_no(273);

    }

//    public static void Armstrong_no(){
//        int n =153;
//        int temp=n;
//        int rem =0;
//        int sum =0;
//        while (temp !=0){
//            rem = temp%10;
//            sum = sum+(rem*rem*rem);
//            temp = temp/10;
//        }
//        if(n==sum){
//            System.out.println(n + "is a armstrong no.");
//
//        }else {
//            System.out.println(n + "is not an armstong no.");
//        }
//    }
public static void Armstrong_no(int num){
      //  int n =153;
        int temp=num;
        int rem =0;
        int sum =0;
        while (temp !=0){
            rem = temp%10;
            sum = sum+(rem*rem*rem);
            temp = temp/10;
        }
        if(num==sum){
            System.out.println(num +" is a armstrong no.");

        }else {
            System.out.println(num +" is not an armstong no.");
        }
    }
        }

// 1.write a method to get boolean value on whether input no. is even or not
// ex:bolean is even(int number)
//2.odd
// ex:bolean is even(int number)
// 3.write a method return max number among three no.
//ex:three paarameter tp a method method_name:maxnumber
//4.wam to return min number among three no.
//5.wam to print natural no.upto givrn no. (no return)
//ex: n=10,print:1,2,3,4,5,6,7,8,9,10
//6.wam to print all even no.till given no.(no return)
//7.wam to print cube of all even no. till given no.(no return)
//8.wam to print cube of all odd no.till given no.
//9.odd number

