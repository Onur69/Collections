package day04scanner;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		
		//Saati saniyeye cevirme long kullanarak
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Saniyeye cevirmekicin saat giriniz");
		long saat= scan.nextLong();
		System.out.println("Saniye karsiligi="+saat*60*60);
		
		scan.close();

	}

}
