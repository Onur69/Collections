package day14methodcreation;

public class Mc01 {

	public static void main(String[] args) {
		//method cagirilirken parantezin icine yazilan degerlere "argument" denir.(3,5 vb)
		carpma(3,5);//sonuc= 15
		toplama(4,5);//sonuc= 9
		carpma(5);
		carpma(6,5);
	}
	//method olustururken method parantezinin icine yazdiginiz veriablelere 
	//"parametre" denir.(int n1 vb)
	//hic parametre koymayadabiliriz methodun icine
	//ayni isimde birden cok method ismi yazilabilir ama parametreler farli olmali. 
	//birden fazla ali isimli kisi olabilecegi gibi yani
	
	//carpma metodu olustur ve main methodun icinden cagir
	public static void carpma(int n1, int n2) {
		System.out.print("sonuc= ");
		System.out.println(n1*n2);
	}
	
	//toplama metodu olustur ve main methodun icinden cagir
	public static void toplama(int n1, int n2) {
			
			System.out.println("birinci carpma metodu");
		}
		//1.parametre sayisini degistirerek ayni isimli method uretebilirsiniz 
		//2.parametre sayilari ayni oldugu haldi data type larini degistirerekte ayni isimli methodlar uretilebilir(long yapmak gibi)
		//3.parametrelerin data type leri farkli oldugunda parametrelerin yerlerini degistirerek ayni isimde methodlar uretilebilir (dort ve besinci deki gibi)
		//not= parametreleri degistirerek 1 den fazla ayni isimli method uretmeye METHOD OVERLOADING denir.
		//parametreler farkli olmasi gerekir.veya tek parametre konulabilir
			public static void carpma(int n1) {  
			System.out.println("ikinci carpma metodu");
		}
		public static void carpma(long n1) {
			System.out.println("ucuncu carpma metodu");
		}
		public static void carpma(int n1 , double n2) {
			System.out.println("dorduncu carpma metodu");
		}
		public static void carpma( double n1, int n2) {
			System.out.println("besinci carpma metodu");
		}
		//1. return type ler degsitirilerek method overloading yapilmaz. yani;
		//ismi ve parametreleri ayni olan iki method return typelari farkli 
		//bile olsa java onlari ayni method kabul eder
		//2. access modifierler degsitirilerek method overloading yapilmaz. yani;
		//ismi ve parametreleri ayni olan iki method access modifierleri farkli 
		//bile olsa java onlari ayni method kabul eder
		//3. method bodyler degsitirilerek method overloading yapilmaz. yani;
		//ismi ve parametreleri ayni olan iki method method bodyleri farkli 
		//bile olsa java onlari ayni method kabul eder
		//not=method overloading compile time polimorphism dir. polimorphism=coklu yapi
		//bunlarin ornekleri java yazilimin icinde olacak ordan bakabilirim



}
