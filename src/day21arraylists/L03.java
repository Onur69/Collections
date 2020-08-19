package day21arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L03 {

	public static void main(String[] args) {
		
		String s[]= {"A","B","C"};
		List<String> sl=new ArrayList<>();
		
		// Bir arrayi nasil List e cevirebilirim
		sl= Arrays.asList(s);
		System.out.println(sl);//[A, B, C]
		
		//Bir List nasil Arraya cevrilir
		/*Javada her classin en az 1 tane parent i vardir(aile).Parent i olmayan tek 
		  class object class tir. object class butun classlarin ortak babasidir
		 */
		
		Object[] listtenArray=sl.toArray();
		

	}

}
