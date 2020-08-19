package day17staticblock;

public class Sb01 {
	
	/*Farzecinki bu class dairenin alanini ve cevresini hesaplayacak
	 Alan= pi* r *r      Cevre= 2* pi* r
	 burda ki islemde pi bize lazim ya, iste static block bu ise yarar
	 Bu classta pi sayisi herzaman kullanilacaktir.
	 pi sayisina class uretirken deger atamasini yapmak faydalidir
	 eger class uretilirken bazi variablelere deger atamasi yapilmasini isterseniz 
	 static block kullanmalisiniz
	 static block icinde kullanilan hersey static olmalidir bu yuzden asagida ki 
	 ornekte pi variablesini static yapmak zorundayiz.
	 
	 ONEMLI= static block, main methodtan once calisir. constructordan da diger butun methodlardan da 
	 once calisir
	 static block class olusturulurken calisir.
*/
	static double pi;
	
	Sb01(){    //==>constructor
		System.out.println("Constructor");//4. olarak bunu yazar
	}
	
	static {
		pi= 3.14;
		System.out.println("Static block ali"); //once static blocklari calistirir 1. bunu yazar
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Main method");//3.olarak bunu yazar
		Sb01 obj=new Sb01();
		

	}
	static {
		pi= 3.14;
		System.out.println("Static block veli"); //once static blocklari calistirir 2. bunu yazar
	}
	
}
