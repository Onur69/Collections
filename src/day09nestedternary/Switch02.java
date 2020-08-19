package day09nestedternary;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan gun numarasini alin
		 Ekrana gun ismini yazdirin
		 1 ==> Pazar, ... 7 ==> Cumartesi
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("gun numarasi giriniz");
		int num=scan.nextInt();
		
		
		switch(num) {
		
		case 1://integer oldugu icin tirnaksiz yaziyoruz. char olsa tirnak kullanirdik
			System.out.println("pazartesi");
			break;
		case 2:
			System.out.println("sali");
		break;
		case 3:
			System.out.println("carsamba");
			break;
		case 4:
			System.out.println("persembe");
			break;
		case 5:
			System.out.println("cuma");
			break;
		case 6:
			System.out.println("cumartesi");
			break;
		case 7:
			System.out.println("pazar");
			break;
			default:
				System.out.println("dogru gun girin");
		}
		
		
		
		
		scan.close();
	}

}
