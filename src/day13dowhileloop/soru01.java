package day13dowhileloop;

import java.util.Scanner;

public class soru01 {

	public static void main(String[] args) {
		/*day13dowhileloop
		  Kullan�c�dan ba�lang�� ve biti�  de�erlerini al�n 
		  ve ba�lang�� de�erinden ba�lay�p biti� de�erinde
		  biten t�m tamsay�lar�n �arp�m�n� ekrana yazd�r�n.
		*/

		Scanner scan=new Scanner(System.in);
		System.out.println("baslangic degerini giriniz");
		int baslangic=scan.nextInt();
		System.out.println("bitis degerini giriniz");
		int bitis=scan.nextInt();
		
		int product=1;
		while(baslangic<=bitis) {
			product=product*baslangic;
			baslangic++;
		}
		System.out.println(product);
		
		
		scan.close();
		
		
		
	}

}
