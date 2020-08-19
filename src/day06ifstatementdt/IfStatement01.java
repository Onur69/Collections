package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {
		
	Scanner scan= new Scanner (System.in);
	
	System.out.println("lutfen bir sayi giriniz");
	int sayi=scan.nextInt();
	//1 tane = koyarsaniz olmaz == tane koymaniz gerekir
	if(sayi%3==0) {
		System.out.println("3'un kati");
		
		
	}
	if(sayi%3!=0) {
		System.out.println("3'e bolunmuyor");
		scan.close();
		
	}
	
	}
		

	
}
