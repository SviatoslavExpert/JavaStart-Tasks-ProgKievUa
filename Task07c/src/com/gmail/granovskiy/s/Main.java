/*
Ввести с консоли число в бинарном формате. Перевести его в
десятичный и вывести на экран (“10” -> 2).
 */

package com.gmail.granovskiy.s;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number in binary format:");
        int x = sc.nextInt(2);

        System.out.println(x);
        sc.close();
    }

}
