package day34collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class I01 {

	public static void main(String[] args) {
		
		List<String> list1=new ArrayList<>();
		list1.add("X");
		list1.add("Y");
		list1.add("Z");
		System.out.println(list1);//[X, Y, Z]
		
		//List'i [ZA,YA,XA] sekline donusturun yani ekleme yapip tersten yazdirin(iterator kullanin)
		ListIterator<String> li1 = list1.listIterator();
		
		while(li1.hasNext()) {
			Object el = li1.next();
			li1.set(el+ "A");
			
		}System.out.println(list1);//[XA, YA, ZA]
		
		//hasPrevious() ve previous() methodlarini kullanabilmek icin oncesinde hasNext()
		//ve next() methodlarini pointer'i en sona tasimak icin kullanmis olmamiz gerekir.
		//Previous==> onceki
		while(li1.hasPrevious()) {
			Object el = li1.previous();
			
			System.out.print(el+" ");//ZA YA XA
		}
		}
}
