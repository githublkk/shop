package com.mmall.util;

public class Digui {

    public static int digui(int n) {
        System.out.println(n);
        if (n == 1 || n == 0) {
            return n;
        } else {
            System.out.println("执行第" + n + "次");
            return n * digui(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.print(digui(5));
    }
}
