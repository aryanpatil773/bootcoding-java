package com.bootcoding.java;

public class arraycw9 {
    public static void main(String[] args) {
        int n[] = {10, 15, 20, 25, 35, 75, 80, 95};
        int min =0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] < min) {
                min = n[i];
            }
        }

        System.out.println(n[0]+ " is minimum number.");
    }

}
