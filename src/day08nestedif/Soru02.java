package day08nestedif;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		/*
		  Kullanýcýdan alacaðý ürün miktarýný ve ürünün birim fiyatýný alýn. 
		  Eðer urun miktarý 1000 den fazla ise
          Kullanýcýya %10 indirim yapýn ve ödemesi gereken toplam parayý ekrana yazdýrýn. 
          Diðer durumlarda
          ödemesi gereken toplam parayý herhangi bir indirim yapmadan ekrana yazdýrýn.
		 */
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Urun adedini giriniz");
		int adet=scan.nextInt();
		System.out.println("Urun birim fiyatini giriniz");
		int fiyat=scan.nextInt();
		
		if(adet>1000) {
			System.out.println("indirimli odeme= "+fiyat*0.90*adet);
		}else {
			System.out.println("indirimsiz odeme= "+fiyat*adet);
		}
		
		
		scan.close();
	
	
	}

}
