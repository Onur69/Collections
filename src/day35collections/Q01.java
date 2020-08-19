package day35collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q01 {

	public static void main(String[] args) {
		//1.LinkedList Constructor'i kullanirsak;
		//Queue==> ilk eklenen elemani remove'da ilk once siler.
		//FIFO==>First In First Out
		Queue<String> q01 = new LinkedList<String>();
		q01.add("Apple");
		q01.add("Mango");
		q01.add("Fig");
		q01.add("Peach");
		q01.add("Grape");
		System.out.println(q01);//[Apple, Mango, Fig, Peach, Grape]
		
		q01.remove();
		System.out.println(q01);//[Mango, Fig, Peach, Grape]==> ilk ekleneni sildi
		
		System.out.println(q01.element());//Mango==>size ilk elemani verir ama elemani Queue'dan silmez.
										  //Ilk eleman yoksa "NoSuchElementException" verir.
		System.out.println(q01);//[Mango, Fig, Peach, Grape]
		
		q01.peek();//Ilk elemani size verir.Queue'dan silmez. 
					//element methodundan farki;ilk eleman yoksa "null"return eder.
		
		System.out.println(q01.poll());//Mango==>buda bize ilk elemani verir ama ilk elemani Queue'dan siler.
		System.out.println(q01);//[Fig, Peach, Grape]
		
		//2.PriorityQueue ile
		//PriorityQueue kullanirsaniz bazen naturel order'a gore elemanlari dizer.
		//Bazende java arkada kendine gore bir kural olusturur ve ona gore lemanlari dizer.
		Queue<String> q02 = new PriorityQueue<String>();
		
		q02.add("Apple");
		q02.add("Mango");
		q02.add("Fig");
		q02.add("Peach");
		q02.add("Grape");
		System.out.println(q02);//[Apple, Grape, Fig, Peach, Mango]
		}
}
