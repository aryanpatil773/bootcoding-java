package com.bootcoding.java;
//10,20,30,40,50 -> size=6,index=5
//int a[]={10,20,30,40,50}  ,inedx=5(n-1)
//OR
//int a[]=new int[4];
//a[0]=10;
//a[1]=20;
//a[2]=30;
//a[3]=40;
//a[4]=50;
//Array type:-
//1.heap
//2.stack
//3.pernGen/metaspace
public class Array_java {
    public static void main(String[] args) {
        int a[] = {10,11,20, 30, 40, 50};
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) { //even no. ko print krne ka kaam krta hai
                System.out.println(a[i]);
                //length of array =arr.length
                //access element =arr[index].index=0
            }
        }
    }
}