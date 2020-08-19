package day30exceptions;

public class E03 {//Bu String i sayiya cevirmek cok kullanilir.

	public static void main(String[] args) {
		
		String s="12345";
		String t= "abcde";
		
		// integer wrapper classinin icinde ki parseInt methodu Stringleri sayiya 
		//cevirmek icin kullanilir.
		int i = Integer.parseInt(s);//String i integer a cevirmis olduk
		System.out.println(i+2);//12347
		
		//Eger bir String rakamlardan olusturulmamissa parseInt() methoduyla
		//onu sayiya cevirmek isterseniz NumberFormatException alirsiniz.
		//Cunku java rakam disinda ki characterleri prseInt() ile sayiya ceviremez.
		int j =  Integer.parseInt(t);//java.lang.NumberFormatException

	}

}
