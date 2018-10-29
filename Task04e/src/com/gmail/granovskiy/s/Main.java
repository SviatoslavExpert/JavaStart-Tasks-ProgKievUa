/*
С помощью цикла (только одного) нарисовать такую фигуру. Причем
максимальная высота этой фигуры вводиться с клавиатуры (в примере
максимальная высота - 4)
*
**
***
****
***
**
*
 */

package com.gmail.granovskiy.s;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int j;

		System.out.println("Enter maximum width: ");
		num = sc.nextInt() * 2;

		j = 0;
		for (int i = 0; i < (num - 1);) {
			if (j >= (num / 2) - Math.abs(num / 2 - i)) {
				System.out.println();
				i++;
				j = 0;
			}
			System.out.print("*");
			j++;
		}
		sc.close();
	}

}
