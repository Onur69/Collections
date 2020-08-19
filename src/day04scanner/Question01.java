package day04scanner;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		// Dikdortgenýn alan ve cevresi
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Dikdortgenin en ve boyunu giriniz");
		double en = scan.nextDouble();
		double boy= scan.nextDouble();
		System.out.println("Alan=" + en*boy);
		System.out.println("Cevre=" + 2*(en+boy));
		scan.close();
		
		

	}

}
