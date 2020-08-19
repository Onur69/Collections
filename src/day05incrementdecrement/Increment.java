package day05incrementdecrement;

public class Increment {

	public static void main(String[] args) {
		// Increase= artirmak(fiil) Increment=artirim(isim)

		int s=12;
		System.out.println(s);
		
		//Increment 1. yol
		s=s+3;
		System.out.println(s);
		
		s=s+5;
		System.out.println(s);
		
		//Increment 2. yol
		int t=22;
		System.out.println(t);
		
		t +=3;  //t=t+3 ile aynidir
		System.out.println(t);
		
		//sadece 1 artiracaksaniz asagida ki yontemi kullanin
		
		int u=32;
		System.out.println(u);
		//u=u+1 veya u+=1 de olabilir ancak
		u ++;//ama hep bu kullanilir
		System.out.println(u);
		
		
	
	}

}
