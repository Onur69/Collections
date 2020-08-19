package day14methodcreation;

public class InstanceLocalVeriable01 {

	int i;  //iste bu instance veriable dir.burda i ye deger atamazsak default veriable atar.yani "0"
	
	
	public static void main(String[] args) {
		/*1.Instance=gorunum,ornek,object demek
		    instance veriable= object veriable
		 2.main methodun disarisinda, classin icerisinde uretilir 
		 3.genelde main methodun ustunde uretilir 
		 ancak yuzde bir ihtimal altinda da uretilebilir
		 4.instance veriable ler classin icinde ki tum metodlar tarafindan kullanilabilir
		 */
		
		/*1. local veriable = methodun body si icinde veya 
		 methodun method parantezi icinde uretilen veriablelerdir
		 2. local veriable ler sadece method body si icinde kullanilabilirler (int sonuc=13 gibi)
		 */
	
		/*1.instance veriable nin scope u icinde bulundugu classin heryeridir
	      yani instance veriableler classin icinde heryerde kullanilabilir
		  2.local veriable nin scope u method body  scope==kapsam, alan, bolge  
		  yani local veriableler method body sinde kullanilabilirler
		  3. bir veriableyi kullanmak icin once onu olusturmak lazim. 
		  create etmeden method body si icinde kullaniyorum falan olmasin
		  4. instance veriablelere deger atamazsaniz java default deger atar.
		  ama local veriablelere deeger atamasi yapmazsaniz java default deger atamasi yapmaz.
		  ve o veriableyi kullanmak istediginizde Compile Time Error verir olustururken hata vermezkeen.
		 */
	
	
	}
	public void toplama() {
		int sonuc=13; //method body si icinde ye ornek
	    ++i;
		System.out.println(sonuc);
	}
	public void cikarma(int n1) { //method parantezi icindeye ornek
		n1++;
		i--;
		System.out.println("cikarma");
	
	}
}    
