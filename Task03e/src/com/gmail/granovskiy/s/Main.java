/*
Есть круг с центром в начале координат и радиусом 4. Пользователь
вводит с клавиатуры координаты точки x и y. Написать программу, которая
определит: лежит ли эта точка внутри круга или нет.
 */

package com.gmail.granovskiy.s;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double radius = 4.0;
		double x;
		double y;

		System.out.println("Enter x coordinate of the point:");
		x = sc.nextDouble();
		System.out.println("Enter y coordinate of the point:");
		y = sc.nextDouble();

		if (x * x + y * y < radius * radius) {
			System.out.println("The point is inside the circle.");
		} else if (x * x + y * y == radius * radius) {
			System.out.println("The point is on the circle line.");
		} else {
			System.out.println("The point is outside the circle.");
		}
		sc.close();
	}

}
