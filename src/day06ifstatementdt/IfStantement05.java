package day06ifstatementdt;

import java.util.Scanner;

public class IfStantement05 {

	public static void main(String[] args) {
		/*
		 kullanicidan sayi alin
		 bu sayi 0 dan 9 a kadar ise ekrana "rakam" yazdirin
		 9 dan buyuuk veya 0 dan kucuk ise ekrana"sayi"yazdirin
		 */

		Scanner scan=new Scanner (System.in);
		System.out.println("Bir sayi giriniz");
		int sayi= scan.nextInt();
		
		if(sayi>=0 && sayi<=9) {
			System.out.println("Rakam");
		}
		if(sayi<0 || sayi>9) {
			System.out.println("Sayi");
			scan.close();
		}
	}

}
