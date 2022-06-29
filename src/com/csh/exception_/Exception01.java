package com.csh.exception_;

/**
 * @author Changersh
 */

public class Exception01 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 0;
        try {
            int p = n1 / n2;
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("continue");
    }
}
