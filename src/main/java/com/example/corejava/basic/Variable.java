package com.example.corejava.basic;

import java.util.Scanner;

public class Variable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nguyễn Văn Duy");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.print("Tổng là: " + c);
    }
}
