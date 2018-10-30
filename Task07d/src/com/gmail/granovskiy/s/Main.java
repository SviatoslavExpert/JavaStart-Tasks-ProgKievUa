/*
Выведите на экран 10 строк со значением числа Пи. Причем в первой
строке должно быть 2 знака после запятой, во второй 3, в третьей 4 и т.д.
 */

package com.gmail.granovskiy.s;

import java.util.Formatter;

public class Main {

    public static void main(String[] args){
    	Formatter fr = new Formatter();
        for(int i = 2; i < 12; i++) {
            fr.format("%." + i + "f  \n", Math.PI);
            System.out.println(fr.toString());
        }
        fr.close();
    }

}
