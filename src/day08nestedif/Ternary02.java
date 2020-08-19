package day08nestedif;

import java.util.Scanner;

public class Ternary02 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir üçgenin  üç kenar uzunluðunu alýn eðer üç kenar uzunluðu birbirine eþit ise ekrana
          “Eþkenar üçgen” yazdýrýn. Diðer durumlarda ekrana “Eþkenar deðil” yazdýrýn.
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("birinci kenari giriniz");
		int a=scan.nextInt();
		System.out.println("ikinci kenari giriniz");
		int b=scan.nextInt();
		System.out.println("ucuncu kenari giriniz");
		int c=scan.nextInt();
		
		String result=a==b&&b==c ? "Eskenar ucgen":"Eþkenar deðil";
				
		System.out.println(result);
		
		
		
		scan.close();
		
		
		
	}

}
