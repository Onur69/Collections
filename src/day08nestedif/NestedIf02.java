package day08nestedif;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		/*
		 *kullanicidan bir sayi alalim
		 *sayi pozitif ise 10 dan buyuk mu diye kontrol edin
		 *10 dan buyukse "woooow"yazdiriin
		 kucuk ise "hmmm" yazdirin
		 sayi 0 veya negatifse -10 dan kucuk mu diye kontrol edin
		 -10 dan kucukse "felaket"
		 -10dan buyukse "ne yapalim" yazdirin
		 */

		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir sayi giriniz");
		int sayi=scan.nextInt();
		
		if(sayi>0) {
		if (sayi>10) {
			System.out.println("wooow");
			
		}else {
			System.out.println("hmmmm");
		}
		}else {
			if(sayi<-10) {
				System.out.println("felaket");
			}else
				System.out.println("ne yapalim");
		
		}
		
		
		
		
		scan.close();
	}

}
