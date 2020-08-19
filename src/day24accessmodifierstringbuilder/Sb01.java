package day24accessmodifierstringbuilder;

public class Sb01 {
	/*
   1-String class; her degisim icin yeni bir String olusturur. var olan Stringi degistirmez.
	 bu yuzden Stringler "immutable"(degistirilemez) dir denir.
	 
	 StringBuilder ise; degisime aciktir. yeni String olusturmadan var olani degistirmek mumkundur.
	 bu yuzden StringBuilderler "mutable"(degistirilebilir) demektir.
	 
	 
	 */

	public static void main(String[] args) {

		//StringBuilder ile String olusturmak icin 3 yol var
		//1. yol
		StringBuilder stb1 = new StringBuilder();
		System.out.println(stb1);//bos doner
		
		stb1.append("Java");
		System.out.println(stb1);//Java
		
		stb1.append("Kolaydir");
		System.out.println(stb1);//JavaKolaydir
		
		//2. yol
		StringBuilder stb2 = new StringBuilder(5);//5 karakterli olsun demektir
		stb2.append("Ali");//bunu kabul eder
		System.out.println(stb2);//Ali
		stb2.append("Kazandi");//5 den fazla karakter verdik ama degisime acik oldugu icin 
		 					   //otomatikmen genisletip devam eder
		System.out.println(stb2);//AliKazandi
		
		//3. yol ==> en cok kullanilan yol
		StringBuilder stb3 = new StringBuilder("Java");
		System.out.println(stb3);//Java
		
		/*Soru: 
		 1- 3. yolu kullanarak bir String olusturun
		 2- bu Stringe ekleme yapin
		 3- Bu Stringin belli bir bolumunu ekrana yazdirin
		
		*/
		StringBuilder stb4=new StringBuilder("Ankara");
		stb4.append(" ne bicim").append(" ayni ismi gibi");//Mathod Chain(zincir)uc uca zincirleme ekledik
		System.out.println(stb4);//Ankara ne bicim ayni ismi gibi
		System.out.println(stb4.substring(0,10));//Ankara ne 
		
		System.out.println(stb4.charAt(3));//a
		
		//delete() methodunda birinci parametre dahil ikinci parametre dahil degildir
		System.out.println(stb4.delete(15, 20));//Ankara ne bicim ismi gibi==>substring deki gibi 
												//ikinci index haric tutar

		//getClass stb4 un hangi classtan olusturuldugunu verir. hangi classin constructorunu kullandiysak 
		//onu veriyor
		//mesela Sb01 classini vermedi
		System.out.println(stb4.getClass());//class java.lang.StringBuilder
		
		System.out.println(stb4.indexOf("ne"));//7
		
		//insert() ==> gazete arasinda ki reklam gibi. bir yerden sonraya bisey eklemek icin kullanilir
		System.out.println(stb4.insert(6, ","));//Ankara, ne bicim ismi gibi
		
		System.out.println(stb4.lastIndexOf("m"));//19
		
		System.out.println(stb4.length());//26
		
		System.out.println(stb4.replace(21, 26, ""));//Ankara, ne bicim ismi

		//INTERWIEV SORUSU
		//Stringi tersten yazdirma
		//1. yol ==> loop ile
		String s ="";
		for(int i = stb4.length()-1 ; i>=0 ; i--) {
			s=s+ stb4.charAt(i);
		}System.out.println(s);//imsi micib en ,araknA
		
		//2. yol ==> StringBuilder ile yazdirmak
		System.out.println(stb4.reverse());//imsi micib en ,araknA
		
		stb4.setCharAt(1, 'k');
		System.out.println(stb4);//iksi micib en ,araknA
		
		// capacity() ile length() farki
		
		StringBuilder stb5=new StringBuilder(11);
		stb5.append("Java");
		/* genel kultur olsun diye yazildi yoksa cok onemli degil
		 1- belirlenen kapasiteyi gecerseniz capacite belirlenen kapasitenin 2 katinin 2 fazlasi olarak yazilir
		 belirlenen kapasitenin 2 katinin 2 fazlasini da gecerseniz kapasite ile length ayni olur.
		 */
		System.out.println(stb5.capacity());//11
		System.out.println(stb5.length());//4
		
		//ONEMLI NOT
		StringBuilder stb6=new StringBuilder("Java Kolay");
		//StringBuilder dan gelen methodlar  StringBuilder i degistirir
		stb6.append("X");
		System.out.println(stb6);//Java KolayX
		
		//substring() String classinin methodudur bu yuzden StringBuilder i update edemez/
		//ornekte goruldugu gibi String i bolemedi.
		stb6.substring(8);
		System.out.println(stb6); //Java KolayX
		
	}

}
