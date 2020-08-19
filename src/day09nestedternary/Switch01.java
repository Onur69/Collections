package day09nestedternary;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		/*
		 kullanicidan bir harf alin
		 harf 'a' veya'A' ise ekrana "ilk harf" yazdirin
		 harf 'b' veya'B' ise ekrana "ikinci harf" yazdirin
		 harf 'c' veya'C' ise ekrana "ucuncu harf" yazdirin
		 diger durumlarda ekrana"tanimlanamadi"
	     yazsin		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("bir harf giriniz");
		char ch=scan.next().charAt(0);
		
		//1.yol:if-else-if
		
		if (ch=='a'|| ch=='A') {
			System.out.println("ilk harf");
		}else if(ch=='b'|| ch=='B') {
			System.out.println("ikinci harf");
		}else if(ch=='c'|| ch=='C') {
			System.out.println("ucuncu harf");
		}else {
			System.out.println("tanimlanamadi");
		}
		
		
		//2. Yol: switch statement
				switch(ch) {		
				    case 'a':
				    case 'A':
				    	System.out.println("Ilk harf");
				    	break;
				    case 'b':
				    case 'B':
				    	System.out.println("Ikinci harf");
				    	break;
				    case 'c':
				    case 'C':
				    	System.out.println("Ucuncu harf");
				    	break;
				    default:
				    	System.out.println("Tanimlanamadi");	
				}

		
		
		scan.close();
		
		
	}

}


