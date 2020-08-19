package day21arraylists;

import java.util.ArrayList;
import java.util.List;

public class L01 {
	/*
	 INTERWIEV SORUSU; arrayle listin farki nedir?
	1-arraylerin uzunluklari en basta belirlenir ve degistirilemez.
	 List (array list)lerin ise  list olustururken uzunluk belirlemeye gerek yoktur
	 cunku listler eleman eklendikce kendilerini buyulturken
	 eleman silindikce kendilerini kuculturler.
	2-Listler cok kullanisli methodlara sahiptir bu yuzden arraylere tercih edilir
	3-Arraylar primitive ve referance lari eleman olarak kabul ederler
	 ama Listler sadece non-primitive leri eleman olarak kabul ederler
	 */

	public static void main(String[] args) {
		//Array list olusturma nasil yapilir
		
		//1. yol
		ArrayList<String> sl1 = new ArrayList<String>();
		
		//2.yol
		ArrayList<String> sl2 = new ArrayList<>();
		
		//3.yol: bunu kullaniniz daha kisa oldugu icin
		List<String> sl3 = new ArrayList<>();
		System.out.println(sl3);//[]
		
		// List'e eleman ekleme nasil yapilir
		sl3.add("A");
		System.out.println(sl3);//[A]
		
		sl3.add("B");// add methodu herzaman yeni elemani en saga ekler
		System.out.println(sl3);//[A, B]
		
		sl3.add("C");
		System.out.println(sl3);//[A, B, C]
		
		//Herhangi bir indexe eleman ekleme nasil yapilir
		
		sl3.add(1, "X");
		System.out.println(sl3);//[A, X, B, C]
		
		sl3.add(0, "Yaserra");
		System.out.println(sl3);//[Yaserra, A, X, B, C]
		
		//List'lerde eleman sayisini bulma nasil yapilir
		System.out.println(sl3.size());//5
		
		//bir Listin bos olup ollmadigini bulma
		System.out.println(sl3.isEmpty());//false==>bossa true diyor doluysa false verir
		
		//Listten eleman istenen elemani silme
		/*NOT==>remove() methodunun icine tamsayi koyarsaniz Java onu index kabul eder. 
		Bu yuzden elemanlari integer olan bir listteki elemanlari silmek icin 
		remove() methodunun sadece indexlisini kullanabilirsiniz.*/
		
		sl3.remove(0);
		System.out.println(sl3);//[A, X, B, C]
		
		//2.yol= Eleman secip sil
		sl3.remove("X");
		System.out.println(sl3);//[A, B, C]
		
		//Iki adet ayni eleman varsa yok etmeyi nasil yapar
		sl3.add("B");//[A,B,C,B] burda B ekledik olayi gormek icin
		sl3.remove("B");//Ayni eleman varsa ilkini siler break yapar.
		System.out.println(sl3);//[A, C, B]
		System.out.println(sl3.remove("B"));//true ==> ilem tamm demek istiyor
		
		//olmayan elemani remove etmek istersek
		//remove edemez ve list'i aynen oldugu gibi birakir
		
		sl3.remove("W");
		System.out.println(sl3);//[A, C, B]
		System.out.println(sl3.remove("W"));// false==> islem tamam degil yapamadim demktir
		
		//remove() methodu ne return eder
		//sl3==> [A,C,B]
		System.out.println(sl3.remove(1));//C==> onceden indexi 1 olan sildigi elemani verir
		System.out.println(sl3);//[A]
		
		//remove(eleman) ne sonuc verir
		//sl3[A]
		System.out.println(sl3.remove("A"));//true
		
		
		
		}

}
