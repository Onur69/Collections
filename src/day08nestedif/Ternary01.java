package day08nestedif;

import java.util.Scanner;

public class Ternary01 {

	public static void main(String[] args) {
		// ternary; if else nin daha kisa yazilmis halidir
        //if-else kullandik
		if(5>4) { System.out.println("Elma");}else {System.out.println("Armut");}

	    //ternary kullandik
        String result= 5>4 ? "Elma" : "Armut";//result=sonuc anlamina gelir.result yerine baska degiskende yazilabilir ancak genelde result yazilir
	    System.out.println(result);
	    
	    
	    /*
	     * kullanicidan bir sayi alin
	     * bu sayi 0 dan 9 a kadar ise ekrana"rakam" yazsin
	     * diger durumlarda ekrana"sayi" yazdirin
	     * bu isi ternary ile cozun
	     */
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Bir sayi giriniz");
	    int s=scan.nextInt();
	    
	    String result1 =  s>=0 && s<=9 ? "Rakam" : "Sayi";
	     System.out.println(result1);
         
	     
	     scan.close();
	}
}