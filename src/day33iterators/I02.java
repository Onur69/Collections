package day33iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class I02 {

	public static void main(String[] args) {
		
		List<String> list1=new ArrayList<>();
		list1.add("X");
		list1.add("Y");
		list1.add("Z");
		System.out.println(list1);//[X, Y, Z]

		//Bu list'teki elemanlari silmek
		
		ListIterator<String> li1= list1.listIterator();
		

		//sadece "Y"'ye kadar olan kismi("Y"'de dahil) silmek istersek;
		while(li1.hasNext()) {
			Object el= li1.next();
			li1.remove();
			if(el.equals("Y")) {
				break;
			}
		}
		System.out.println(list1);//[Z]
		
		//while loop'un icinde next() methodunu kullanmazsaniz
		//pointer hareket etmez ve sonsuz dongu olusur.
		//Bu list'teki elemanlari silmek istersek;
		while(li1.hasNext()) {
			li1.next();
			li1.remove();
		}
		System.out.println(list1);//[]
		
		/*
		 Bir String list olusturun 
		 tum elemanlari "XXX" e donusturun.
		 */
		List<String> list2=new ArrayList<>();
		list2.add("AB");
		list2.add("CD");
		list2.add("EF");
		System.out.println(list2);//[AB, CD, EF]
		
		ListIterator<String> li2 = list2.listIterator();
		while(li2.hasNext()) {
			String el = li2.next();
			li2.set(el.replace(el, "XXX"));
		}
		System.out.println(list2);//[XXX, XXX, XXX]
	}

}
