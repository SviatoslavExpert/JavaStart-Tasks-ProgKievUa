/*
Выведите на экран «песочные часы» максимальная ширина которых
считывается с клавиатуры (число нечетное). В примере ширина равна 5.
*****
 ***
  *
 ***
*****
 */

package com.gmail.granovskiy.s;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter width (odd number):");
		int width = sc.nextInt();

		if (width % 2 != 0) {

			for (int i = 1; i <= width / 2 + 1; i++) {
				for (int j = 1; j <= width; j++) {

					if (j >= i && j <= width - i + 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}

			for (int i = width / 2; i > 0; i--) {
				for (int j = 1; j <= width; j++) {

					if (j >= i && j <= width - i + 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		} else {
			System.out.print("You entered even number.");
		}
		sc.close();
	}

}
