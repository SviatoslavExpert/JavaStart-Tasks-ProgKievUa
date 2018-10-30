/*
Создать массив случайных чисел (размером 15 элементов). Создайте
второй массив в два раза больше, первые 15 элементов должны быть
равны элементам первого массива, а остальные элементы заполнить
удвоенных значением начальных. Например:
Было → {1,4,7,2}
Стало → {1,4,7,2,2,8,14,4}
 */

package com.gmail.granovskiy.s;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int size = 15;
		int[] arrayOne = new int[size];
		int[] arrayTwo = new int[size * 2];

		for (int i = 0; i < arrayOne.length; i++) {
			arrayOne[i] = (int) (Math.random() * 100 + 1);
		}
		for (int i = 0; i < arrayTwo.length; i++) {
			if (i < size) {
				arrayTwo[i] = arrayOne[i];
			} else if (i < size * 2) {
				arrayTwo[i] = arrayOne[i - size] * 2;
			}
		}

		System.out.println("The first array: " + Arrays.toString(arrayOne));
		System.out.println("The second array: " + Arrays.toString(arrayTwo));
	}

}
