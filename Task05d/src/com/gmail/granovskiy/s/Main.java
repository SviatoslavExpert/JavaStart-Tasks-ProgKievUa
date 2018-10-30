/*
Введите строку текста с клавиатуры — реализуйте программу для
возможности подсчета количества символа — 'b' в этой строке, с выводом
результата на экран.
 */

package com.gmail.granovskiy.s;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();

		char[] arrayOfCharacters = s.toCharArray();    // created an array of characters

		int counter = 0;
		for (int i = 0; i < arrayOfCharacters.length; i++) {
			if (arrayOfCharacters[i] == 'b') {
				counter++;
			}
		}

		System.out.println("The amount of symbol b in the string: " + counter);
		sc.close();
	}

}
