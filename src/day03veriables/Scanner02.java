package day03veriables;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Tam isminizi giriniz:");
		String tamIsim = scan.nextLine();
		System.out.println(tamIsim);
		
		System.out.println("Yasinizi giriniz:");
		byte yas = scan.nextByte();
		System.out.println(yas);
		
		System.out.println("�sminizin ilk harfini giriniz:");
		char ilkHarf = scan.next().charAt(0);
		System.out.println(ilkHarf);
		 // cocuk say�s�n� byte �le almak
		System.out.println("Cocuk say�s�n� g�r�n�z:");
		byte cocukSayisi=scan.nextByte();
		System.out.println(cocukSayisi);
		
		
        scan.close();
	}

}
