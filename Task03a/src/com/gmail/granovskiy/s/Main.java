/*
Java Start Task 03.01
Написать программу которая считывает 4 числа и выводит на экран
самое большое из них.
 */

package com.gmail.granovskiy.s;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		int d;
		int max;

		System.out.println("Input a:");
		a = sc.nextInt();
		System.out.println("Input b:");
		b = sc.nextInt();
		System.out.println("Input c:");
		c = sc.nextInt();
		System.out.println("Input d:");
		d = sc.nextInt();

		max = select(select(a, b), select(c, d));
		System.out.println("The maximum number is: " + max);
		sc.close();

	}

	public static int select(int x, int y) {
		if (x > y) {
			return x;
		}
		else {
			return y;
		}
	}

}
