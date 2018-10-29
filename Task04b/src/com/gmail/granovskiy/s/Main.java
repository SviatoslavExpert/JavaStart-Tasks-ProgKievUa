/*
Вычислить с помощью цикла факториал числа - n введенного с
клавиатуры (4<n<16). Факториал числа это произведение всех чисел от
этого числа до 1. Например 5!=5*4*3*2*1=120
 */

package com.gmail.granovskiy.s;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Enter a number bigger than 4 and less than 16: ");
		number = sc.nextInt();
		long factorial = 1L;

		if (number > 4 && number < 16) {
			for (int i = 1; i <= number; i++) {
				factorial *= i;
			}
			System.out.println("The factorial of " + number + ": " + factorial);
		} else {
			System.out.println("Wrong number.");
		}
		sc.close();
	}

}
