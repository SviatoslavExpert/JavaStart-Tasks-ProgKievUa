/*
Написать код для возможности создания массива целых чисел (размер
вводиться с клавиатуры) и возможности заполнения каждого его элемента
вручную. Выведите этот массив на экран.
 */

package com.gmail.granovskiy.s;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the amount of elements (size) of a new array: ");
		size = sc.nextInt();

		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter the element with index " + i + ":" + " ");
			array[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("The array is full: " + Arrays.toString(array));
		sc.close();
	}

}
