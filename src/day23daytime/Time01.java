package day23daytime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Time01 {

	public static void main(String[] args) {

		LocalTime lt = LocalTime.now();
		System.out.println(lt);//22:20:40.337 ==> 337 nanosecond demektir
		
		//Zamanda ileri nasil gidilir
		System.out.println(lt.plusMinutes(10));//22:32:46.167
		System.out.println(lt.plusHours(7));//05:24:41.417
		
		//Zamanda nasil geri gidilir
		System.out.println(lt.minusSeconds(23));//22:25:51.931
		System.out.println(lt.minusHours(7));//15:27:32.878
		
		//Time formati nasil degistirilir
		//hh ==> 12 lik sistem kullanir     HH ==> 24 lik sistem kullanir
		//h yi tek kullansak rakamlari 10 dan kucukse tek basar
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(dtf1.format(lt));//10:29
		
		//Farkli ulkelerdeki saati nasil alirim
		System.out.println(LocalTime.now(ZoneId.of("Turkey")));//22:34:17.737
		System.out.println(LocalTime.now(ZoneId.of("Japan")));//04:35:23.925
		System.out.println(LocalTime.now(ZoneId.of("Europe/Moscow")));//22:37:43.283
	}

}
