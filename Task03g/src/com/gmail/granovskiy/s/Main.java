/*
Проверить, является ли четырехзначное число счастливым билетом.
Дано четырехзначное число. Проверить, является ли оно «счастливым
билетом». Примечание: счастливым билетом называется число, в
котором - при четном количестве цифр в числе сумма цифр его левой
половины равна сумме цифр его правой половины. Например,
рассмотрим число 1322. Его левая половина равна 13, а правая – 22, и
оно является счастливым билетом (т. к. 1 + 3 = 2 + 2)
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
		int num;

		System.out.println("Enter a 4-digit number:");
		num = sc.nextInt();

		a = num / 1000;
		b = num % 1000 / 100;
		c = num % 100 / 10;
		d = num % 10;

		if (a + b == c + d) {
			System.out.print("Your ticket is lucky.");
		} else {
			System.out.print("Try one more time.");
		}
		sc.close();
	}

}
