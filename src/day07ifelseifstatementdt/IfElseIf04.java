package day07ifelseifstatementdt;

import java.util.Scanner;

public class IfElseIf04 {

	public static void main(String[] args) {
		/*
		 kullanicidan iki not alin
		 ortalam 50nin altinda ise "kaldiniz"
		 ortalam 70 in altinda ise" c ile gectiniz"
		 85 in altinda ise"b ile gectini"
		 100 ve altinda ise"a ile gectiniz"
		 diger durumlarda ise "gecerli not giriniz"
		 */
	
		Scanner scan=new Scanner(System.in);
		System.out.println("birinci notu giriniz");
		double n1=scan.nextDouble();
		System.out.println("ikinci notu giriniz");
		double n2=scan.nextDouble();
		double ort=(n1+n2)/2;
		
		if(n1<0 || n2<0) {
			System.out.println("notlar negatif olamaz");
			
		}else if(n1>100 || n2>100) {
			System.out.println("notlar 100 den buyuk olamaz");
		}else if (ort<50) {
			System.out.println("kaldin");
			System.out.println(ort);
		}else if(ort<70) {
			System.out.println("c ile gectin");
			System.out.println(ort);
		}else if(ort<85) {
			System.out.println("b ile gectin");
			System.out.println(ort);
		}else if(ort<=100) {
			System.out.println("a ile gectin");
			System.out.println(ort);
		}
		
		scan.close();
	
	
	
	}

}
