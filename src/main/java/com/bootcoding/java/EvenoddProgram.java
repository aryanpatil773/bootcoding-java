package com.bootcoding.java;

import java.util.Scanner;

public class EvenoddProgram {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter no.");
  int n = sc.nextInt();
  int a=10;
  n=a+2+ ++a;
  if (n % 2 == 0) {
   //>,<,!=
   //n%2==0
   //if(condition)
    System.out.println(n + "is even no.");
   } else {
    System.out.println(n + "is odd no.");
   }
  }
 }
// write a problam 3 integer no. and print max n0. alnog them