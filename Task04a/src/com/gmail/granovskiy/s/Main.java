/*
С помощью циклов нарисовать «обои». Причем количество полос
должно вводиться с клавиатуры. В примере 7 полос.
***+++***+++***+++***
***+++***+++***+++***
***+++***+++***+++***
***+++***+++***+++***
***+++***+++***+++***
 */

package com.gmail.granovskiy.s;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int columns;
		int rows;

		System.out.println("Enter the amount of columns:");
		columns = sc.nextInt();
		System.out.println("Enter the amount of rows:");
		rows = sc.nextInt();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (j % 2 == 0) {
					System.out.print("***");
				} else {
					System.out.print("+++");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
