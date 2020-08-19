package day08nestedif;

import java.util.Scanner;

public class Ternary03 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir character alýn eðer character bir harf ise ekrana “Harf” yazdýrýn.
            Diðer durumlarda ekrana “Harf deðil” yazdýrýn.
		 */

		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir karakter giriniz");
		char ch=scan.next().charAt(0);
		 String result= (ch>='a' && ch<='z') || (ch>='A' && ch<= 'Z') ? "harf" : "harf degil";
		 System.out.println(result);
		
		
		scan.close();
	}

}
