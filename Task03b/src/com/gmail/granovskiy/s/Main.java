/*
Java Start Task 03.02
Есть девятиэтажный дом, в котором 4 подъезда. Номер подъезда
начинается с единицы. На одном этаже 4 квартиры. Напишите программу
которая получит номер квартиры с клавиатуры, и выведет на экран на
каком этаже, какого подъезда расположенна эта квартира. Если такой
квартиры нет в этом доме то нужно сообщить об этом пользователю.
 */

package com.gmail.granovskiy.s;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int flatNumber;
		int floor;
		int entrance;

		System.out.println("Enter flat number: ");
		flatNumber = sc.nextInt();

		if (flatNumber > 0 && flatNumber <= 144) {
			entrance = (flatNumber - 1) / 36 + 1;
			floor = ((flatNumber - 1) % 36) / 4 + 1;
			System.out.println(
					"The flat #" + flatNumber + " is on the floor #" + floor + " , entrance #" + entrance + ".");
		} else {
			System.out.println("There is no such flat.");
		}
		sc.close();

	}

}
