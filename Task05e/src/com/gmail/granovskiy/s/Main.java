/*
Написать код для зеркального переворота массива (7,2,9,4) -> (4,9,2,7). -
массив может быть произвольной длинны. (При выполнении задания
использовать дополнительный массив нельзя)
 */

package com.gmail.granovskiy.s;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("Original array: " + Arrays.toString(arr));

		rotateArray(arr);
	}

	private static void rotateArray(int[] arr) {
		int b = 0;
		for (int i = 0; i < arr.length / 2; i++) {
			b = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = b;
		}
		System.out.println("Array after rotation: " + Arrays.toString(arr));
	}

}
