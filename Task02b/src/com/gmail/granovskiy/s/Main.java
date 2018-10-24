package com.gmail.granovskiy.s;

public class Main {

	public static void main(String[] args) {

		double a = 0.3;
		double b = 0.4;
		double c = 0.5;

		double p = (a + b + c) / 2.0;
		double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		System.out.println("Triangle area: " + area);

	}
}
