/*
С клавиатуры вводиться шестизначное число. Проверить, является ли
оно палиндромом. Примечание: палиндромом называется число, слово
или текст, которые одинакового читаются слева направо и справа налево.
Например, это числа 143341, 5555, 7117 и т. д.
 */

package com.gmail.granovskiy.s;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numA;
		int numB;
		int numC;
		int numD;
		int numE;
		int numF;
		int num;

		System.out.println("Enter a 6-digit number:");
		num = sc.nextInt();

		numA = num / 100000;
		numB = num % 100000 / 10000;
		numC = num % 10000 / 1000;
		numD = num % 1000 / 100;
		numE = num % 100 / 10;
		numF = num % 10;

		if (numA == numF && numB == numE && numC == numD) {
			System.out.println("This number is a palindrome.");
		} else {
			System.out.println("This number is not a palindrome.");
		}
		sc.close();
	}

}
