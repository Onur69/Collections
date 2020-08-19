package day30exceptions;

public class E02 {
	/*
	 1)llegalArgumentException bir RTException dur. Istedigimiz sartlara
	   uygun argument kullanilmadigi zaman bu exception devreye girer.Buna 
	   biz karar verir manuel olarak yazdiririz.
	 2) throw ve throws farki nedir?
	   a) throw method body si icinde kullanilir. 
	   	  throws ise method parantezi ile curly brase arasinda kullanilir.
	   	  ==> )throws IOException{
	   b) throw u method body icinde istedigimiz yerde istedigimiz kadar kullaniriz.
	      throws ise a da belirtilen yerde bir defa kullanilir.
	   c) 1 throw sadece 1 tane exception üretir, 1 throws ile birden çok 
          exception üretebilirsiniz yani " ) throws NullPointerException, ArithmeticException { " mümkündur.
	   d) throws dan sonra sadece exception classinin ismi yazilir.==> )throws IOException{
	   	  throw dan sonra ise new ve constructor yazilir.==>throw new IllegalArgumentException();
	 */

	public static void main(String[] args) {
		
		countEgg(-8);//Ben sana yumuta sayisi dedim sen negatif sayi kullandin
		division(15, 3);//Tek sayilara bolme artik
	}
	
	public static void countEgg(int numOfEgg) {
		try {
		if(numOfEgg<0) {
			throw new IllegalArgumentException();
		}else {
			System.out.println(numOfEgg);
		}
		}catch(IllegalArgumentException e) {
			System.out.println("Ben sana yumuta sayisi dedim sen negatif sayi kullandin");
		}
		
	}
	public static void division(int a, int b) {
		try {
		if(b%2!=0) {
			throw new ArithmeticException();
		}else {
			System.out.println(a/b);
		}
	}catch(ArithmeticException e) {
		System.out.println("Tek sayilara bolme artik");
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
