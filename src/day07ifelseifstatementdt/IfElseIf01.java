package day07ifelseifstatementdt;

import java.util.Scanner;

public class IfElseIf01 {

	public static void main(String[] args) {
		/*kullanicidan sayi alin
		 * sayi sifirdan buyukse ekrana"Pozitif" yazdirin
		 * sayi sifir ise ekrana"Notr" yazdirin
		   sayi sifir dan kucukse ekrana"Negatif" yazdirin
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Kullanicidan sayi alin");
		double s= scan.nextDouble();
		
		if(s>0) {
			System.out.println("Pozitif");
			}else if(s==0) {
				System.out.println("Notr");
			}else {
				System.out.println("Negatif");
			}
		     //javanin derdi true yu bulmak,true yu bulana kadar inceler bulursa ekrana onu girer
		
		
		scan.close();
	}

}
