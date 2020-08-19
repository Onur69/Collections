package day09nestedternary;

import java.util.Scanner;

public class NestedTernary01 {

	public static void main(String[] args) {
		/*
		 * kullanicidan bir sayi alin
		 * sayi pozitif ise 9dan buyuk mu diye bakin
		 * 9dan buyukse "sayi" degilse "rakam"yazdirin
		 * sayi pozitif degilse 0 mi diye kontrol edin
		 * 0 ise "rakam" degilse "negatif sayi" yazdirin
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("bir sayi giriniz");
		int s=scan.nextInt();
		
		String result= (s>0)? ( (s>9) ? ("Sayi"): ("Rakam")):
			( (s==0) ? ("Rakam"): ("Negatif sayi"));//sinavda parantezsiz olarak soruyorlar
		System.out.println(result);
		
		scan.close();
	}

}
