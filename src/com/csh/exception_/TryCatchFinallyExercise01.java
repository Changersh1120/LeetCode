package com.csh.exception_;

import java.util.Scanner;

/**
 * @author Changersh
 * 用 try-catch-finally
 * 判断用户输入的是否是一个整数
 */
public class TryCatchFinallyExercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        String str = "";
        while (true) {
            System.out.println("请输入一个整数");
            str = scanner.next();
            try {
                num = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
//                e.printStackTrace();
                System.out.println("你输入的不是一个整数");
            }
        }
        System.out.println("num = " + num);
    }
}
