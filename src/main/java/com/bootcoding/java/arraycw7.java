package com.bootcoding.java;

public class arraycw7 {
    public static void main(String[] args) {
        int no[] = {10, 15, 20, 25, 35, 75, 80, 95};
        for (int i=0;i<no.length;i++) {
            if (no[i] > 30 && no[i] <= 100) {
                System.out.println(no[i]);
            }
        }
    }
}
