package day08nestedif;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir yýl alýn eðer yýl 1000’e bulunuyorsa ekrana “Milenyum” yazdýrýn.
         Eðer yýl 100’e bulunuyorsa ekrana “Yüzyýl” yazdýrýn.
         Eðer yýl 10’a bulunuyorsa ekrana “Onyýl” yazdýrýn.
		 */

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir yil giriniz");
		int yil=scan.nextInt();
		//once 10yil yazdirsaydik program hatali calisirdi
		
		if(yil%1000==0) {
			System.out.println("Milenyum");
		}else if(yil%100==0) {
			System.out.println("Yuzyil");
		}else if(yil%10==0) {
			System.out.println("Onyil");
		}else {
			System.out.println("Hicbiri");
		}
		
		
		scan.close();
		
		
	}

}
