package day13dowhileloop;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		/*kullanicidan bir string alin 
		 * Stringin icinde 'a' varsa "kazandiniz" yazdirin
		 * 'a' yoksa "kaybettiniz" yazdirinve yeni String isteyin
		 */

		Scanner scan=new Scanner(System.in);
		String h="";
		
		do {
			System.out.println("Bir String giriniz");
			h=scan.nextLine();
			if(!h.contains("a")) {
				System.out.println("Kaybettiniz");
			}
		}while(!h.contains("a"));
		
		System.out.println("Kazandiniz");
		
		
		
		
		
		
		
		scan.close();
		
		
		
	}

}
