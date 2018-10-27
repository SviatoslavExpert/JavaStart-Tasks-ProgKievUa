/*
Дан треугольник, координаты вершин А(0,0), В(4,4), С(6,1). Пользователь
вводит с клавиатуры координаты точки x и y. Написать программу, которая
определит: лежит ли эта точка внутри треугольника или нет.
*/

package com.gmail.granovskiy.s;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double ax = 0;
		double ay = 0;
		double bx = 4;
		double by = 4;
		double cx = 6;
		double cy = 1;
		double x;
		double y;
		double k1;
		double k2;
		double k3;

		System.out.print("Enter x coordinate of the point: ");
		x = sc.nextDouble();
		System.out.print("Enter y coordinate of the point: ");
		y = sc.nextDouble();

		k1 = (ax - x) * (by - ay) - (bx - ax) * (ay - y);
		k2 = (bx - x) * (cy - by) - (cx - bx) * (by - y);
		k3 = (cx - x) * (ay - cy) - (ax - cx) * (cy - y);

		if (k1 > 0 && k2 > 0 && k3 > 0 || k1 < 0 && k2 < 0 && k3 < 0) {
			System.out.println("The point is inside the triangle.");
		} else if (k1 == 0 && k2 == 0 && k3 == 0) {
			System.out.println("The point is on the of side (line) of the triangle.");
		} else {
			System.out.println("The point is outside of the triangle.");
		}
		sc.close();
	}

}
