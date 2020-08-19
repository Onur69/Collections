package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement04 {

	public static void main(String[] args) {
		// kullanicidan bir sayi alin bu sayi 0 dan 9 a kadar ise ekrana "rakam" yazin
        //bu syi 9 dan buyuk ve 100 den kucuk ise ise ekrana"iki bsamakli sayi" yazdirin
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int num=scan.nextInt();
		
		if(num>=0 && num<=9) {
			System.out.println("Rakam");
		}
		
		if(num>9 && num<100) {
			System.out.println("Iki basmakli sayi");
		
		}
		scan.close();
	}

}
