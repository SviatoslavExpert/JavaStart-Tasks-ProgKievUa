/*
Реализуйте метод рисующий на экране прямоугольник из звездочек «*»
— его параметрами будут целые числа которые описывают длину и
ширину такого прямоугольника.
 */

package com.gmail.granovskiy.s;

public class Main {

	public static void main(String[] args) {
		drawRectangle(5, 7);
	}

	private static void drawRectangle(int height, int width) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
