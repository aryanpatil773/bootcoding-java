package com.bootcoding.java;

public class EVENARRAY {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        evenArray(a);
    }
    public static void evenArray(int b[]){
        for(int i=0;i<b.length;i++){
            if(b[i] %2==0){
                System.out.println(b[i]);
            }
        }

    }
}
