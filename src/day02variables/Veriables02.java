package day02variables;

public class Veriables02 {

	public static void main(String[] args) {
		
		int fiyat = 500;
		System.out.println(fiyat);
		System.out.println("fiyat");//fiyat� resim olarak alg�lar ve "fiyat" c�kt�s� ver�r
		
		//iki tane tamsayi veriable olusturun ve toplamini ekrana yazdirin
		
		int ilkSayi=4;
		int ikinciSayi=6;
		System.out.println(ilkSayi+ikinciSayi);
        // bir tane boolean bir tane char olusturup deger atamas� yap�n ve degerleri ekrana yazd�r�n
	    boolean sigortali=true;
	    System.out.println(sigortali);
	    
	    char harf='s';
	    System.out.println(harf);

	    // 1 byte yapal�m -128,+127
	    
	    byte yas = 83;// 127 den buyuk -128 den kucuk kullan�rsan�z k�rm�z� alt c�zg� olusur
	    System.out.println(yas);
	    
	    // short olusturma
	    
	    short nufusKoy= 23000;
	    System.out.println(nufusKoy);
	    
	    // integer
	    int hazinePara=2039949000;
	    System.out.println(hazinePara);
	    
	    // long
	    long hazinePara2= 2038737800;
	    System.out.println(hazinePara2);
	    
	    // float
	    float borc=12.53f;// float larda son tarafa f konulmazsa hata verir
	    System.out.println(borc); 
	    
	    // double
	    double borc2=12.53;//double larda son tarafa d yazma zorunlulugu yoktur
	    System.out.println(borc2);
	}

}
