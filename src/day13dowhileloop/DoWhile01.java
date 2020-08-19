package day13dowhileloop;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		// "while" ile"do-while" arasinda ki fark nedir?
		 int i=1;
		  while(i<1) {
			  System.out.println(i);//ekran bostur bisey yazmaz
			  i++;
		  }
		  //do-while ise soyle kaliptadir/ do==>yap demek

		  do {
			  System.out.println(i);//ekrana 1 yazdirir
			  i++;
		  }while(i<1);
	
		/*kullanicidan sayi alin 
		  bu sayi 10 dan buyukse ekrana "kazandiniz"yazsin
		  sayi 10 veya 10 dan buyukse ekrana"kaybettiniz" yazdirip tekrar sayi isteyin
	     */
		/*oyun gibi kodlar yazarken while icinde ki sarti dongunun devam etme kosuluna gore ayarlayin
		 */
		  Scanner scan=new Scanner(System.in);
		  int s=20;//s veriable sine 10 danbuyuk herhangi bir deger atayabiliriz
		 
		  do {
			  if(s<=10) {
				  System.out.println("kaybettiniz");
			  }
			  System.out.println("bir sayi giriniz");
			  s=scan.nextInt();
			  
		  }while(s<=10);//bu sarti devam etmeye gore ayarlamak gerekir.
		  System.out.println("kazandiniz");
		  
		  
		  
		  
		  
		  scan.close();
	
	
	
	}

}
//ikisinde de dongu kiriliyor ama while ekrana bisey yazdirmadan kiriyor
//do-while da ise dongu kirilmasina ragmen ekrana "1"yazdiriyor
//do-while asla ekrani bos birakmazken while bazen bos birakir bu ikisinin en onemli farkidir
//while once sarti kontrol eder sonra kodu calistirir. do-while ise once calistirir sonra kodu kontrol eder