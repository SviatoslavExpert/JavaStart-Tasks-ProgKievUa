/*
Напишите метод который вернет количество слов в строке текста.
 */

package com.gmail.granovskiy.s;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a line: ");
		String s = sc.nextLine();

		System.out.println("The amount of words in the line: " + countWords(s));
		sc.close();
	}

	private static int countWords(String s) {

		char[] arrayOfCharacters = s.toCharArray(); // created an array of characters

		int counter = 0;
		for (int i = 0; i < arrayOfCharacters.length; i++) {
			if (arrayOfCharacters[i] == ' ') {
				counter++;
			}
		}
		return ++counter;
	}

}
