package com.bootcoding.java;

public class arraycw8 {
    public static void main(String[] args) {
        int no[] = {10, 15, 20, 25, 35, 75, 80, 95};
        int max = 0;
        for (int i = 0; i < no.length; i++) {
            if (no[i] > max) {
                max = no[i];
            }
        }

        System.out.println(max+ " is maximum number.");
    }

}

