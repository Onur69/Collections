package day30exceptions;

public class E01 {

	/*
	 1-Kod yazarken kirmizi alt cizgi almadiginiz halde kodu calistirdiktan sonra
	   console da kirmizi mesaj alirsaniz buna 'Run Time Exception' denir.
	   a) ArithmeticException bir Run Time Exception dir.Bir sayiyi 0 a bolerseniz bu 
	   	  exception u alirsiniz.
	   b) null atanmis bir Stringin length ini bulmak isterseniz, java.lang.NullPointerException verir.
	   	  Bu bir RTException dur.
	 */
	public static void main(String[] args) {
		
		int a=12;
		int b=0;
		
		String s1="";// Kutu olusturur ve icine "" koyar.
		String s2=null;//null hicbirsey demektir.Kutu olusturur ama icine hicbisey koymaz.
		
		try {
		System.out.println(a/b);//hatali old icin alttaki syso yu yazar
		}catch(ArithmeticException e){
			System.out.println("Bir sayiyi sifira bolemezsiniz");
		}
		System.out.println(s1.length());//0
		System.out.println(s2.length());//java.lang.NullPointerException verir.Bu bir RTException dur
	}

}
