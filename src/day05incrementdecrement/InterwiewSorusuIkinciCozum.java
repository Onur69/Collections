package day05incrementdecrement;

import java.util.Scanner;

public class InterwiewSorusuIkinciCozum {

	public static void main(String[] args) {
		/*ONEMLI BIR KONU (SWAP)
		 
		 0-sayilari kullanicidan alalim
		 1-iki tane int veriable olusturun a=5 b=3 gibi
		 2-sonra bu int larin degerlerinin yerlerini degistirin(swap).
		 yani a=3 b=5 olsun
		 */
       
		Scanner scan=new Scanner(System.in);
		
		System.out.println("birinci sayiyi giriniz");
		int s1=scan.nextInt();
		
		System.out.println("ikinci sayiyi giriniz");
		int s2=scan.nextInt();
		
		System.out.println(s1+" "+s2);
		
		s1=s1+s2;
		
		s2=s1-s2;
		
		s1=s1-s2;
		
		System.out.println(s1+" "+s2);
		
		scan.close();
	}

}


	
