package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement03 {

	public static void main(String[] args) {
		/* kullanicidan bir sayi alin 
		sayi negative ise  "negatif" yazdirin
		sayi pozitive ise 
		ekrana"pozitif" yazdirin
		sayi "0" ise ekrana "notr" yazdirin*/
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Lutfen bir sayi giriniz");
		
		int sayi= scan.nextInt();
		
		if(sayi>0) {
			
			System.out.println("Pozitif");
			
		}
		if(sayi<0) {
			
			System.out.println("Negatif");
		
		}
		
		
		if (sayi==0) {
			System.out.println("Notr");
		}
		scan.close();

	}

}
