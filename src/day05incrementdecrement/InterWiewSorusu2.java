package day05incrementdecrement;

import java.util.Scanner;

public class InterWiewSorusu2 {

	public static void main(String[] args) {
		//INTERWIEW SORUSU
		/* kullanicidan 3 basamakli bir sayi alin
		aldiginiz sayinin rakamlari toplamini ekrana yazdiriniz*/
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("3 basamakli bir sayi giriniz");
		int s=scan.nextInt();
		
		int sonRakam=s%10;
		
		int ortaRakam=(s/10)%10;
		
		int ilkRakam=(s/100)%10;
		
		int toplam=sonRakam+ortaRakam+ilkRakam;
		
		System.out.println("toplam= "+ toplam);
		
		
		scan.close();
		
		
		
	}

}
