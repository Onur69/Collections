package day08nestedif;

import java.util.Scanner;

public class Ternary02 {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir ��genin  �� kenar uzunlu�unu al�n e�er �� kenar uzunlu�u birbirine e�it ise ekrana
          �E�kenar ��gen� yazd�r�n. Di�er durumlarda ekrana �E�kenar de�il� yazd�r�n.
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("birinci kenari giriniz");
		int a=scan.nextInt();
		System.out.println("ikinci kenari giriniz");
		int b=scan.nextInt();
		System.out.println("ucuncu kenari giriniz");
		int c=scan.nextInt();
		
		String result=a==b&&b==c ? "Eskenar ucgen":"E�kenar de�il";
				
		System.out.println(result);
		
		
		
		scan.close();
		
		
		
	}

}
