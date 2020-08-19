package day07ifelseifstatementdt;

import java.util.Scanner;

public class IfElseIf02 {

	public static void main(String[] args) {
		/*
		 kullanicidan bir harf alalim
		 bu harf a veya A ise ekrana"ilk harf" yazdirin
		 bu harf b veya B ise ekrana "ikinci harf"yazdirin
		 bu harf !c veya C ise ekrana"ucuncu harf" yazdirin
		 baska harf ise ekrana"burasini bilmiyorum" yazdirin
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Bir harf giriniz");
		char h=scan.next().charAt(0);
		
		if(h=='a'||h=='A') {
			System.out.println("ilk harf");
			
		}else if(h=='b'||h=='B') {
			System.out.println("Ikinci harf");
			
			
		}else if(h=='c'||h=='C') {
			System.out.println("ucuncu harf");
			
		}else {
			System.out.println("burasini bilmiyorum");
		}
		
		
		
		scan.close();
	}

}
