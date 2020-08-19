package day04scanner;

public class TypeCasting01 {

	public static void main(String[] args) {
		
		// dusuk data type nin buyuk data type ne cast edilmesi
        // Yapilan isleme Auto Widening(genisletme) Casting denir
		
		byte b1=13;
		int i1=b1;
		System.out.println(b1);
		System.out.println(i1);
	
		short s1=2300;
		float f1=s1;
		System.out.println(s1);
		System.out.println(f1);
		
		//Explitic(acýkca) narrowing(daraltma) Casting
		
		short s2=120;
		byte b2=(byte)s2;
		System.out.println(s2);
		System.out.println(b2);
		
		double d1= 23.364745594934567233453;
		float c1=(float)d1;	
		System.out.println(d1);
		System.out.println(c1);
		
		short s3= 1200;
		byte b3=(byte)s3;
		System.out.println(s3);
		System.out.println(b3);
		
		// Asagýda ki hata kac farkli sekilde duzeltilebilir
		//float f3=2.34;
		
		// 1) 2.34 den sonra f yazabiliriz
		//float f3=2.34f;
		//2) 2.34 un onune float yazarak
		//float f3=(float)2.34;
		//3) data type ni double yapariz
		//double f3=2.34;
				
				
				
				
		
		
	}

}
