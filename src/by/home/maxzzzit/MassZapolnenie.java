package by.home.maxzzzit;

import java.util.Arrays;

public class MassZapolnenie {
	public static void main(String [] args) {
		//Заполнение массива значениями
		int [] mas = new int [10];
		String [] smas = new String[10];
		System.out.println(Arrays.toString(mas));//Вывод массива int
		System.out.println(Arrays.toString(smas));//Вывод массива String	
		
		Arrays.fill(mas, 33);//Заполнение всего массива элементами
		System.out.println(Arrays.toString(mas));
		Arrays.fill(mas, 3, 7, 57);//Заполнение части массива элементами
		System.out.println(Arrays.toString(mas));
		Arrays.fill(smas, " ");
		System.out.println(Arrays.toString(smas));
	}
}
