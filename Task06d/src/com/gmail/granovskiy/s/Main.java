/*
Напишите метод который реализует линейный поиск элемента в массиве
целых чисел. Если такой элемент в массиве есть, то верните его индекс,
если нет, то метод должен возвращать число - «-1»
 */

package com.gmail.granovskiy.s;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 145, 557, 345, 654, 999 };

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element of the array to get its index: ");
		int element = sc.nextInt();

		System.out.println(searchElemIndex(element, arr));
		sc.close();
	}

	private static int searchElemIndex(int element, int[] arr) {
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				index = i;
				break;
			}
		}
		return index;
	}

}
