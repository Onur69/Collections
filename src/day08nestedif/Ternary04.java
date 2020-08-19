package day08nestedif;

import java.util.Scanner;

public class Ternary04 {

	public static void main(String[] args) {
		/*
		 kullanicidan bir sayi alin
		 bu sayi tek sayi ise karesini ekrana yazdirin
		 bu sayi cift sayi ise yarisini ekrana yazdirin
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
	    int s=scan.nextInt();
	    
	    int result= s%2==0 ? s/2 : s*s;
		System.out.println(result);
	
		scan.close();
	
	}

}
