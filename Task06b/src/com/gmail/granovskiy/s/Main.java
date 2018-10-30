/*
Реализуйте метод параметрами которого являются - целое число,
вещественное число и строка. Возвращает он конкатенацию строки с
суммой вещественного и целого числа.
 */

package com.gmail.granovskiy.s;

public class Main {

	public static void main(String[] args) {
		String s = concatenate(5, 3.71, "word");
		System.out.println(s);
	}

	private static String concatenate(int a, double b, String c) {
		c = c + (a + b);
		return c;
	}

}
