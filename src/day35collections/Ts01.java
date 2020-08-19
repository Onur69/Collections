package day35collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.TreeSet;

public class Ts01 {

	public static void main(String[] args) {
		//Elemanlar naturel order'a gore dizilirler. Tree==>agac
		//Bu islem zaman alir bu yuzden TreeSet, HashSet'ten yavastir.
		LocalTime time1 = LocalTime.now();
		System.out.println(time1);//22:15:20.369
		
		TreeSet<String> ts01 = new TreeSet<String>();
		ts01.add("Apple");
		ts01.add("Mango");
		ts01.add("Grape");
		ts01.add("Fig");
		ts01.add("Orange");
		ts01.add("Peach");
		System.out.println(ts01);//[Apple, Fig, Grape, Mango, Orange, Peach]
		
		LocalTime time2 = LocalTime.now();
		System.out.println(time2);//22:15:20.371
		//HashSet siralamay zaman harcamadigi icin "0" nanosecond'da isini yapiyor.
		HashSet<String> hs01 = new HashSet<>();
		hs01.add("Apple");
		hs01.add("Mango");
		hs01.add("Grape"); 
		hs01.add("Fig");
		hs01.add("Banana"); 
		hs01.add("Peach");
		System.out.println(hs01);//[null, Apple, Fig, Grape, Mango]
		
		LocalTime time3 = LocalTime.now();
		System.out.println(time3);//22:15:20.371
		
		//==INTERVIEW SORUSU==
		//Sirali ve tekrarsiz elemanlari listelemek icin hangi yontemi kullanirsiniz?
		
		/*
		 Klasik cevap= TreeSet kullanirim.Ama boyle derseniz patlar yani gittiniz yandiniz.
		 Dogru cevap= HashSet kullanarak objeyi olustururum.Elemanlari HashSet'e eklerim.
		 Bu elemanlari siralamak icinde olusturdugum HashSet objesini TreeSet'e ceviririm.
		 */
		
		HashSet<String> hs02 = new HashSet<>();
		hs02.add("Apple");
		hs02.add("Mango");
		hs02.add("Grape"); 
		hs02.add("Fig");
		hs02.add("Banana"); 
		hs02.add("Peach");
		System.out.println(hs02);
		
		//Siraliya cevirmek icin TreeSet kullaniriz.
		TreeSet<String> ts02 = new TreeSet<String>(hs02);
		System.out.println(ts02);//[Apple, Banana, Fig, Grape, Mango, Peach]
		
		LocalTime time4 = LocalTime.now();
		System.out.println(time4);//time3=22:26:33.450==>time4=22:26:33.450==>aralarinda fark olmadi
		
		
		
		
		
		
	}
}
