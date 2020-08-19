package day08nestedif;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		//nest== kus yuvasi demek,icice gecmek demek aslinda
		/*
		 kullanicidan cinsiyetini ve yasini alin
		 erkek ve 18 yasindan kucuk ise "erkek cocuk" yazdiralim 
		 diger durumlarda "bay"yazdiralim
		 kadin ve 18 yasindan kucuk ise "kiz cocuk" yazdiralim 
		 diger durumlarda "bayan"yazdiralim
		 diger cinsiyetler icin "tanimlanamadi"yazdiralim
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("cinsiyet giriniz erkek/kadin");
		String cinsiyet=scan.next();
		System.out.println("yasinizi giriniz");
		int yas=scan.nextInt();
		
		if(cinsiyet.equals("Erkek")) {
			if(yas<18) {
				System.out.println("Erkek cocuk");
			}else {
				System.out.println("Bay");
			}
			}else if(cinsiyet.equals("Kadin")) {
				if (yas<18) {
					System.out.println("Kiz cocuk");
				}else {
					System.out.println("Bayan");
				}
				}else {
					System.out.println("Tanimlanamadi");
				}
			

		
		
		scan.close();
		
		
		
	}

}
