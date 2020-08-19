package day04scanner;

public class TypeCasting02 {

	public static void main(String[] args) {
		
		//Decimal bir sayiyi byte short int long gibi bir tamsayiya assign edersek
		//java virgüllu sayinin ondalik kismini iptal edip tam kismini basar
		//java yuvarlama yapmaz
		int i1= 5/2;
		System.out.println(i1);//2 yazar
		
		//java int/ int sonucunu tamsayi olarak return eder
		double d1= 5/2;
		System.out.println(d1);//2.0 yazar

		// matematiksel islemlerde birden fazla data type varsa java sonucu
		//en  buyuk data type gore yazar. double sýralamada int ten buyuk oldugu icin double yazacak
		double d2= 5.0/2;
		System.out.println(d2);//2.5 yazar
		
		double d3= 5/2.0;
		System.out.println(d3);//2.5
	}

}
