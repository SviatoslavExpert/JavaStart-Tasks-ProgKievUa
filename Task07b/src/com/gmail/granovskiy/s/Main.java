/*
Написать свой вариант метода Arrays.toString() для int[].
 */

package com.gmail.granovskiy.s;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] arr = { 5, 2, 7, 9, 25, 57 };
		System.out.println("Standard version: " + Arrays.toString(arr));
		System.out.print("Created version:  " + convertArraysToString(arr));
	}

	private static String convertArraysToString(int[] array) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < array.length - 1; i++) {
			sb.append(array[i] + ", ");
		}
		sb.append(array[array.length - 1]);
		sb.append("]");
		return sb.toString();
		
	}

}
