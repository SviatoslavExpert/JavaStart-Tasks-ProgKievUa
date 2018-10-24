package com.gmail.granovskiy.s;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("¬ведите п€тизначное число:");
        int num = sc.nextInt();

        System.out.println(num / 10000);
        System.out.println(num % 10000 / 1000);
        System.out.println(num % 1000 / 100);
        System.out.println(num % 100 / 10);
        System.out.println(num % 10);
        sc.close();
    }

}
