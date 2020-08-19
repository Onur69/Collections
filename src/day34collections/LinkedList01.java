package day34collections;

import java.util.LinkedList;

public class LinkedList01 {

	public static void main(String[] args) {
		//LinkedList elemanlari giris sirasina gore siralar.Buna "insertion order" denir.
		//LinkedList ekleme ve cikartmada cok dinamiktir.
		//Ama eleman bulmakta yavastir. O yuzden Arraylar tercih edilir eleman bulmali islerde.
		
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Aliye");
		linkedList.add("Veli");
		linkedList.add("Burhan");
		linkedList.add("Canan");
		linkedList.add("Kemal");
		linkedList.add("Reyhane");
		System.out.println(linkedList);//[Aliye, Veli, Burhan, Canan, Kemal, Reyhane]==>insertion order
		
		LinkedList<String> linkedList2 = new LinkedList<>();
		linkedList2.add("XXXX");
		linkedList2.add("YYYY");
		linkedList2.add("ZZZZ");
		System.out.println(linkedList2);//[XXXX, YYYY, ZZZZ]
		
		System.out.println(linkedList);//[Aliye, Cemal, Veli, Burhan, Canan, Kemal, Reyhane]
		
		linkedList.addFirst("Kayahan");
		System.out.println(linkedList);//[Kayahan, Aliye, Cemal, Veli, Burhan, Canan, Kemal, Reyhane]
		
		linkedList.addLast("Ayse");
		System.out.println(linkedList);//[Kayahan, Aliye, Cemal, Veli, Burhan, Canan, Kemal, Reyhane, Ayse]
		
		//addAll() kullandiginizda ilk list degisir , parantezin icindeki list degismez.
		linkedList.addAll(linkedList2);
		System.out.println(linkedList);//[Kayahan, Aliye, Veli, Burhan, Canan, Kemal, Reyhane, Ayse, XXXX, YYYY, ZZZZ]
		
		linkedList.addAll(5, linkedList2);
		System.out.println(linkedList);//[Kayahan, Aliye, Veli, Burhan, Canan, XXXX, YYYY, ZZZZ, Kemal, Reyhane, Ayse, XXXX, YYYY, ZZZZ]
		
		linkedList.remove();//ilk elemani siler
		System.out.println(linkedList);//[Aliye, Veli, Burhan, Canan, XXXX, YYYY, ZZZZ, Kemal, Reyhane, Ayse, XXXX, YYYY, ZZZZ]
		
		linkedList.remove(1);//index'i 1 olani siler
		System.out.println(linkedList);//[Aliye, Burhan, Canan, XXXX, YYYY, ZZZZ, Kemal, Reyhane, Ayse, XXXX, YYYY, ZZZZ]
		
		linkedList.remove("Canan");
		System.out.println(linkedList);//[Aliye, Burhan, XXXX, YYYY, ZZZZ, Kemal, Reyhane, Ayse, XXXX, YYYY, ZZZZ]
		
		linkedList.remove("Saz");//olmayan elemanda hata vermez ve silme yapamaz.
		System.out.println(linkedList);//[Aliye, Burhan, XXXX, YYYY, ZZZZ, Kemal, Reyhane, Ayse, XXXX, YYYY, ZZZZ]
	
		linkedList.remove("YYYY");//tekrarli elemanlarda ilkini siler
		System.out.println(linkedList);//[Aliye, Burhan, XXXX, ZZZZ, Kemal, Reyhane, Ayse, XXXX, YYYY, ZZZZ]
		
		linkedList.removeFirstOccurrence("ZZZZ");//FirstOccurrence==>ilk gorunum
		System.out.println(linkedList);//[Aliye, Burhan, XXXX, Kemal, Reyhane, Ayse, XXXX, YYYY, ZZZZ]
		
		linkedList.removeLastOccurrence("XXXX");//LastOccurrence==>son gorunum
		System.out.println(linkedList);//[Aliye, Burhan, XXXX, Kemal, Reyhane, Ayse, YYYY, ZZZZ]
		
		linkedList.removeAll(linkedList2);//linkedlist2'de var olan elemanlarin tamamini siler
		System.out.println(linkedList);//[Aliye, Burhan, Kemal, Reyhane, Ayse]
		
		linkedList.removeFirst();
		System.out.println(linkedList);//[Burhan, Kemal, Reyhane, Ayse]
		
		linkedList.removeLast();
		System.out.println(linkedList);//[Burhan, Kemal, Reyhane]
		
		linkedList.removeIf(t->t.contains("a"));//"t" herhangi bir harf teknik olarak "t" tercih edilmis
		System.out.println(linkedList);//[]==>  bu method cok kullanilir 
	}
}
