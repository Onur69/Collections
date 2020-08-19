package day13dowhileloop;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
		/*Kullanýcýdan uzunluðu çift sayý olan bir String alýn 
		 ve bu String’in ilk yarýsýný ekrana yazdýrýn.
		 Ornegin; Kullanýcý “Hollanda” girerse ekrana “Holl” yazdýracaksýnýz.
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("cift sayili charactere sahip string giriniz");
		String s=scan.nextLine();
		
		System.out.println("Ilk yari:"+s.substring(0, s.length()/2));//ilk yarisi
		
		System.out.println("ikinci yari:"+s.substring(s.length()/2));
		scan.close();
	}

}
