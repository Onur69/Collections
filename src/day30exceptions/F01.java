package day30exceptions;

public class F01 {
	
	/*MESHUR INTERWIEW SORUSU
	  final, finally ve finalize() arasinda ki farklar nelerdir?
	  
	  ==>final ve finally keyword dur ama finalize() method dur.
	  
	  final: final keyword u variablelerden, methodlardan ve classlardan 
	  once kullanilabilir.
	  	1-final variable:Bir variable final ise, o variableye bir kere deger atamasi
	  	yaparsiniz ve o degeri bidaha degistiremezsiniz.
	 	2-final method:Body si son halde olan methodlardir. Yani body si 
	 	degistirilemeyecek olan methodlardir.Bu yuzden final methodlar override edilemezler.
	 	3-final class:Child i olamaz.Bu yuzden inharitence yapilamaz.
	 
	 finally: try-catch den sonra kullanilir. Try block, exception uretsede uretmesede 
	 finally block icinde ki kod calisir.
	 
	 finalize():Javada garbage collector, silmesi gereken datalari once finalize eder 
	 sonra imha eder.
	 */
	
	final static double pi= 3.14;
	
	
	public static void main(String[] args) {
		

	}

}
