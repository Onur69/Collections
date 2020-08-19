package day22foreachloop;

import java.util.ArrayList;
import java.util.List;

public class FEL01 {

	public static void main(String[] args) {
		//
		List<Integer> il= new ArrayList<>();
		il.add(21);
		il.add(22);
		il.add(23);
		il.add(24);
		il.add(25);
		il.add(26);
		
		//for-each loop = enhanced loop(zenginlestirilmis)
		// for-each loop Array lerde kullanilmaz
		
		for(Integer w : il) {
			System.out.println(w);
		}
		
		//il Listinin tum elemanlarini toplayiniz
		
		int sum=0;
		for(Integer w: il) {
			sum=sum+w;
		}System.out.println(sum);
		

		// il Listinin icinde ki tek sayi olan elemanalrin carpimini
		int carp=1;
		for (int w: il) { // wrapper classida yani Integer i da, primitive int i de kullanabiliriz burda
			if (w%2!=0) {
				carp=carp*w;
			}
		}System.out.println(carp);
		
		// il Listinin icinde ki tek sayi olan elemanalri yazdirin
		
		for(int w: il) {
			if (w%2!=0) {
				System.out.println(w);
			}
		}
		System.out.println("=======");
		//break ve continue karsilastirmasi==> interwiev
		
		//il listinin ilk 3 elemanini yazdiriniz
		//benim cozumum
		int i=1;
		for(int w: il) {
			if(i<4) {
				System.out.println(w);
				i++;
			}
		}
		//hocanin 1. yol cozumu
		
		int count=0;
		for(int w: il) {
			if(count<3) {
				System.out.print(w+" ");
				count++;
			}
		}
		System.out.println();
		
		//hocanin 2. yol cozumu
		int coun=0;
		for(int w : il) {
			System.out.print(w+" ");
			coun++;
			if(coun==3) {
				break;
			}
		}
		System.out.println();
		
		//il Listinde 3 ile bolunebilenleri ekrana yazdirin
		
		//1.yol
		for(int w : il) {
			if(w%3==0) {
				System.out.print(w+" ");
			}
		}
		System.out.println();
		
		//2.yol ==> continue ile
		for(int w : il) {
			if(w%3!=0) {
				continue;
			}
			
			System.out.print(w+" ");
		}
		}
}
