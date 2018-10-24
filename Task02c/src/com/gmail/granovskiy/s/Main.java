/*
Java Start Task 02.03
Написать программу которая вычислит и выведет на экран
длину окружности, если ее радиус считывается с клавиатуры.
*/

package com.gmail.granovskiy.s;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input radius value:");

		double radius = sc.nextDouble();
		double perimeter = 2.0 * Math.PI * radius;
		System.out.println("Perimeter = " + perimeter);
		sc.close();

	}
}
