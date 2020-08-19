package day03veriables;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Tam isminizi giriniz:");
		String tamIsim = scan.nextLine();
		
		System.out.println(tamIsim);
		scan.close();

	}

}
