package com.example.corejava.basic;

import java.util.Scanner;

public class Variable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nguyễn Văn Duy");
        int a = 1;
        int b = 2;

        int cong = Calculator.add(a, b);
        int tru = Calculator.subtraction(a, b);
        int nhan = Calculator.multiply(a, b);
        int chia = Calculator.division(a, b);

        System.out.println("Kết quả phép cộng là: " + cong);
        System.out.println("Kết quả phép trừ là: " + tru);
        System.out.println("Kết quả phép nhân là: " + nhan);
        System.out.println("Kết quả phép chia là: " + chia);

    }
}
