package day11stringmethodsforloopdt;

public class StringMethods01 {

	public static void main(String[] args) {
		//11.startsWith() ilk characteri kontrol eder

		String a="Hadi gidelim bu diyardan";
		System.out.println(a.startsWith("H"));//true
		System.out.println(a.startsWith(""));//true==> hic biseyi de kabul etti
		System.out.println(a.startsWith("Hadi"));//true
	
		System.out.println(a.startsWith("g", 5));//true==> index 5 "g" ile mi basliyor demektir
		System.out.println(a.startsWith("i", 7));//false==> index7 de "i" mi var diye bakar
		System.out.println(a.startsWith("", 6));//true==>index6 da normalde "i" var ancak hicbirsey arandiginda hicbirseylere bakar
	
		
		//12.indexOf()==>of=in,in anlami var.indexin gibi
		//indexOf da hem String hem de char kullanilir
		System.out.println(a.indexOf("i"));//3==>soldan saga giderken ilk gorunumun indexini verir
		System.out.println(a.indexOf('d'));//2
		//deli yi bulur ve ilk harfinin indexini verir.birden cok karakter varsa ilkinin indexini verir
		System.out.println(a.indexOf("deli"));//7
		//olmayan bir character icin indexOf kullanirsaniz java -1 return eder
		System.out.println(a.indexOf("x"));//-1
		System.out.println(a.indexOf("diyer"));//-1 coklu characterde hepsi ayni olmasa yine d yi gormeyip -1 doner
		
		System.out.println(a.indexOf("d", 4));//7==> 4.indexten sonraki d nin indexini buluyor
		System.out.println(a.indexOf("a", 9));//19==> 9. indexten sonraki a nin indexini verir
		System.out.println(a.indexOf('e', 8));//8
		
		//13. lastIndexOf()==>son gorunumun indexini verir
		
		String b="Java Ah java!";
		System.out.println(b.lastIndexOf("v"));//10 ==>son v nin indexi demektir
		System.out.println(b.lastIndexOf("av"));//9 ==> son av i bulup a nin indexini basar
		
		//14. subString()==> bir Stringin belli bir bolumunu kesip almaya yarar(ONEMLI COK KULLANILIR)
		
		String c="Karakartal";
		//asdece kartal kelimesini ekrana yazdirmak icin soyle yapilir. begin= baslangic
		System.out.println(c.substring(4));//kartal==> kesmeye baslanilan yerden sonrasini ekrana basar
		//ekrana arakartal yazalim
		System.out.println(c.substring(1));//arakartal
		//ekrana kar yazdiralim
		//subString methodun da iki sayi kullanirsaniz ilk sayi dahil ikinci sayi haric olur asagida ki gibi
		System.out.println(c.substring(4, 7));//kar
		//subString le ilk harfi almak icin subString(0,1) yazariz bunu cok kullaniriz
		System.out.println(c.substring(0, 1));//K
		// baslangic ve bitis index lerini ayni yaparsak hicbirsey aliriz.
		System.out.println(c.substring(2, 2));//"" hicbirsey goruruz
		//subString te baslangic indexi bitis indexinden buyk olamaz.
		//buyuk yazarsak Run Time Error aliriz
		//System.out.println(c.substring(5, 3));
		
		
		//trim() methodu==>trim==tras anlamina gelir.bir Stringin bas ve son tarafindaki spaceleri siler
		//dikkat edin aradakileri degil bas ve sondakileri siler
		String d="  Java iyidir   ";
		System.out.println(d.length());//16
		
		System.out.println(d.trim().length());//11
		
		
		
		
		
		
		
		
		
	}

}
