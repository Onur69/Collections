package day23daytime;

public class Varargs01 {

	/*Varargs = variable arguments
	 Normalde Arraydir. Ama uzunlugu kullanicinin girdigi deger sayisina gore buyur.
	 hic eleman yoksa da cok eleman varsada calisir
	 
	 NOT= varargs dipsiz kuyu gibidir icine ne atarsaniz sonsuza kadar kabul eder
	 
	 1-Varargs tan sonra baska parametre kullanilamaz.Varargs method parantezi icinde
	 herzaman en son parametre olmalidir==>(int... y , int x)
	 2-Varargs sonda olduktan sonra Varargsin oncesinde Varargs olmayan parametreler
	 kullanilabilir ==> (int x, int... y)
	 3- Method parantezinin icinde sadece bir tane Varargs kullnabilirsiniz==> (String.. x ,Int... y)== bunu kabul etmez
	 
	 NOT=(...int x)==> bu kullanim yanlistir
	 */
	
	public static void main(String[] args) {
		
		add(3,5);//8
		add(3,5,7);//15
		add(1,2,3,4,5,6,78,9);//108
		product(2,3);//6
		product(1,2,3,4,5);//120
	}
//	public static void add(int s1 , int s2) {
//		System.out.println(s1+s2);
//	}
//	public static void add(int s1 , int s2 ,int s3) {
//		System.out.println(s1+s2+s3);
//	}
	//varargs method==> int... koyarak ifade edilir
	public static void add(int... x) {
		int sum= 0;
		for (int w : x) {
			sum = sum + w;
		}
		System.out.println(sum);
	}
	//ne kadar sayi girilirse girilsin carpimini yazdirin
	public static void product (int... y) {
		int product=1;
		for(int w : y) {
			product=product*w;
		}
		System.out.println(product);
	}
}
