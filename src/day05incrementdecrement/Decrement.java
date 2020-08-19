package day05incrementdecrement;

public class Decrement {

	public static void main(String[] args) {
		// Decrease= azaltmak(fiil)  Decrement=Azalis(isim)

		int s=12;
		System.out.println(s);//12
		
		//Decrement 1. yol
		s=s-3;
		System.out.println(s);//9
		
		//Decrement 2. yol
		int t=22;
		System.out.println(t);//22
		
		t-=3;
		System.out.println(t);//19
		
		//Decrement i sadece 1 azaltacaksaniz asagida ki yontemi kullanin
		int u=32;
		System.out.println(u);//32
		
		u--;
		System.out.println(u);//31
		
		//Carpma ile increment
		int v=42;
		v=v*2;
		System.out.println(v);//84
		
		v*=3;
		System.out.println(v);//252
		
		//Bolme ile Decrement
		int y=52;
		System.out.println(y);
		
		y=y/2;
		System.out.println(y);//26
		
		y/=2;
		System.out.println(y);//13
		
		
		
		
	}

}
