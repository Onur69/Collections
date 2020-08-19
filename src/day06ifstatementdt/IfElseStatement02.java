package day06ifstatementdt;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		/*
		 kullanicidan sayi alin
		 bu sayi 10 dan 100 e kadar ise "Iki basamkli sayi" yazdirin
		 degilse ekrana"iki basamakli degil" yazdirin
		 */

		Scanner scan=new Scanner (System.in);
		System.out.println("Sayi giriniz");
		int sayi=scan.nextInt();
		
		if(sayi>=10 && sayi<100) {
			System.out.println("Iki basamkli sayi");
			
		}
		else {
			System.out.println("iki basamakli degil");
		}
		
		
		scan.close();
	}

}
