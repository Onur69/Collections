package day13dowhileloop;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		/*kullanicidan bir sayi alin 
		  sayi cift sayi ise ekrana"kazandiniz"yazdirin
		  sayi tek sayi ise ekrana"kaybettiniz"yazdirin ve yeni bir sayi isteyin
		*/
	
		Scanner scan=new Scanner (System.in);
		int s=0;
		
		do {
			
		System.out.println("bir sayi giriniz");
		s=scan.nextInt();
			if(s%2!=0) {
				System.out.println("kaybettiniz");
				}
			}while(s%2!=0);
			System.out.println("kazandiniz");
		
		
		
		
		
		
		scan.close();
	
	
	
	}

}
