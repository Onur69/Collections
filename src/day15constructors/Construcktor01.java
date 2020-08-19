package day15constructors;

public class Construcktor01 {
	/*1)Construcktor lar main metodun disinda, classin icinde olusturulurlar
	 *2)Construcktor in ismi class ismi ile ayni olmalidir 
	 *3) method ile Construcktor farki;
							 *  a) method ismi class isminden farli olabilir, 
							 *   fakat Construcktor ismi class ismiyle ayni olmak zorundaadir
							 *  b) methodlarda return type olmak zorundadir
							 *   ama Construcktor larda return type olmaz.
							 *   Construcktora return type eklerseniz artik o Construcktor degil methoddur.
	 * 4)bir class ta birden fazla Construcktor olabilir ama Construcktorlarin 
	 * parametreleri farkli olmalidir
	 * yani farkli Construcktor uretmek icin overloading kurallarini kullanmaliyiz
	*/
	Construcktor01(){
		System.out.println("Parametresiz Construcktor");

	}
	Construcktor01(int i){
		System.out.println("integer parametreli Construcktor");

	}
	Construcktor01(String s){
		System.out.println("String parametreli Construcktor");

	}
	Construcktor01(String s,int i){
		System.out.println("iki parametreli Construcktor");

	}
	public static void main(String[] args) {
	  //class ismi     object e isim     new keyword kullanin   Construcktor
		
		Construcktor01     obj1         =  		 new      		Construcktor01();
		Construcktor01     obj2         = 		 new      		Construcktor01("Ali");
		Construcktor01     obj3         = 		 new      		Construcktor01(2);
		Construcktor01     obj4         =  		 new     		Construcktor01("Ali",3);
	}
	void toplama() {
		System.out.println("Toplama");
	}

}
