package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement02 {

	public static void main(String[] args) {
		
		/*
		 Kullanýcýdan bir gun alýn eðer gun 
		 “Cuma” ise ekrana “Müslümanlar icin kutsal gün” yazdýrýn.
	     “Cumartesi” ise ekrana “Yahudiler icin kutsal gün” yazdýrýn. 
	     “Pazar” ise ekrana “Hristiyanlar icin kutsal gün” yazdýrýn
		*/
	
		Scanner scan=new Scanner (System.in);
		System.out.println("lutfen kutsal gununuzu giriniz");
		String gun= scan.next();
		//Stringleri karsilastirirken sakin ha == kullanmayin
		//Stringleri karsilastiriken mutlaka equals() kullanin
		//equals() metodu boolean return eder
		
		if(gun.equals("Cuma")) {
			System.out.println("muslumanlar icin kutsal gun");
			
		}
		if(gun.equals("Cumartesi")) {
			System.out.println("yahudiler icin kutsal gun");
		}
		
		if(gun.equals("Pazar")) {
			System.out.println("hiristiyanlar icin kutsal gun");
		}
		
		scan.close();
		

	}

}
