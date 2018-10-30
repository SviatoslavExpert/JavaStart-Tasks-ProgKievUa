/*
Напишите метод который вернет максимальное число из массива целых чисел.
 */

package com.gmail.granovskiy.s;

public class Main {

	public static void main(String[] args) {
		int[] arr = { -5, -100789, -2147483647, 2, 3, 4, 5, 6, 7, 8, 9, 2147483647 };
		System.out.println("The maximum number of the array is: " + searchMax(arr));
	}

	private static int searchMax(int[] arr) {
		int maxNumber = -2147483648;
		for (int i = 0; i < arr.length; i++) {
			if (maxNumber < arr[i]) {
				maxNumber = arr[i];
			}
		}
		return maxNumber;
	}

}
