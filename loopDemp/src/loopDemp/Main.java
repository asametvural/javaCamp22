package loopDemp;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		// For Döngüsü
		for (int i = 2; i < 10; i += 2) {
			System.out.println(i);
			System.out.println("For Döngüsü " + i + " defa döndü.");
		}
		System.out.println("For döngüsü bitmiştir!!!");
		System.out.println("--------------------------------------------------------------");

		// While Döngüsü
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While döngüsü bitmiştir!!!");
		System.out.println("--------------------------------------------------------------");

		// Do-While Döngüsü
		int j = 1;
		do {
			System.out.println(j);
			j += 2;
		} while (j < 15);
		System.out.println("do-While döngüsü bitmiştir!!!");

	}

}
