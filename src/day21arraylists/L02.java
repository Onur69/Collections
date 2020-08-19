package day21arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L02 {

	public static void main(String[] args) {
		List<String> sl= new ArrayList<>();
		
		sl.add("Ali");
		sl.add("Kemal");
		sl.add("Ayse");
		
		//Bir elemani degistirmey nasil yapilir
		System.out.println(sl);//[Ali, Kemal, Ayse]
		sl.set(0, "Aliye");
		System.out.println(sl);//[Aliye, Kemal, Ayse]
		
		//Bir elemanin varligini kontrol etmek
		
		System.out.println(sl.contains("Kemal"));//true
		System.out.println(sl.contains("Wwwwww"));//false
		
		//Elemanlari natural order'a (kucukten buyuge + alfabetik sira) gore nasil dizeriz
		Collections.sort(sl);//bunu ezberlememiz lazim cok kullanilir
		System.out.println(sl);//[Aliye, Ayse, Kemal]
		
		//Elemanlari naturel order in tersine gore siralama nasil yapilir
		Collections.reverse(sl);
		System.out.println(sl);//[Kemal, Ayse, Aliye]
		
		//Listin icinde ki butun elemanlar nasil silinir
		
		sl.clear();
		System.out.println(sl);//[]
	
		
		//NOT=Listler asla primitive lerle calismazlar, non-primitive lerle calisirlar
		/*
		 Her primitive data type nin bir WRAPPER CLASS vardir
		 primitive  Wrapper Classlar(non-primitive)
		 boolean    ==>Boolean
		 char       ==> Character
		 byte       ==> Byte
		 short      ==> Short
		 int        ==>Integer
		 long       ==>Long
		 float      ==> Float
		 double ==>Double
		 */
		
		//Iki list in esit olup olmadigini nasil kontrol ederiz
		List<Integer> il1= new ArrayList<>();
		il1.add(12);
		il1.add(13);
		il1.add(14);
		
		List<Integer> il2= new ArrayList<>();
		il2.add(12);
		il2.add(13);
		il2.add(14);
		
		System.out.println(il1.equals(il2));//esitse true degilse false dondurur.
		//Hem elemanlara hemde indexlerine bakar.
		
		List<Integer> il3= new ArrayList<>();
		il3.add(12);
		il3.add(13);
		il3.add(14);
		
		List<Integer> il4= new ArrayList<>();
		il4.add(14);
		il4.add(13);
		il4.add(12);
		
		System.out.println(il3.equals(il4));//false ==> cunku elemanlar ayni olsa da indexleri farkli
		}
}
