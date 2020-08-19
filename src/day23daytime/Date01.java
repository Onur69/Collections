package day23daytime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date01 {
	/*
	 1-Anlik tarih almak
	 2-Tarihi ilerletmeyi veya geriletmek
	 3-Tarihi farkli formatlarda yazmak
	 */

	public static void main(String[] args) {
		
		LocalDate ld = LocalDate.now();//sifirdan object uretmeyip classtan "localdate" now a gidip simdiki tarihi yazdirdik
		System.out.println(ld);//2020-07-21
		System.out.println(LocalDate.now());//2020-07-21
		
		//Ileri tarihler ekrana nasil yazdirilir/ileri gitmek  ==> plus=arti
		System.out.println(ld.plusDays(275));//2021-04-22
		System.out.println(ld.plusMonths(3));//2020-10-21
		System.out.println(ld.plusYears(3));//2023-07-21
		
		//Gecmis tarihler nasil yazdirilir  ==> minus=eksi
		System.out.println(ld.minusDays(34));//2020-06-17
		System.out.println(ld.minusMonths(6));//2020-01-21
		System.out.println(ld.minusYears(37));//1983-07-21
		
		//Tarihi farkli formatta yazdirmak
		//MM ==> ayi rakamsal olarak
		//MMM ==> ayin isminin 3 harfi
		//MMMM ==> ayin isminin tamami
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(dtf1.format(ld));//21/07/2020
		
		//d ==> 10 dan kucuk gunler icin tek rakam basar ama 10 dan yukarisi icin cift rakam basar
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMMM.d.yyyy");
		System.out.println(dtf2.format(ld));//July.21.2020
		
		}

}
