package day11stringmethodsforloopdt;

public class ForLoop01 {

	public static void main(String[] args) {
		/* Java nin ana konularindan biridir loop lar. bir tik daha zordur
		loop=dongu demektir*/
		
		
		//ekrana 10 defa "Java" yazdirmak
		
		/*	System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");*/
	
	
		//yukarda ki isi for-loop kullanarak kisa bi sekilde yapabiliriz
	    //  baslangic;condition;artirma/azaltma
		for(int i =1 ; i<=10   ;    i++       ) {
			System.out.println("Java");
			
		}
		
		//ekrana 1 den 7 ye kadar olan tamsayilari yazdiriniz
		for(int i=1;i<=7;i++) {
			System.out.println(i);
		}
		
		//ekrana 4 den 1 e kadar olan tamsayilari yazdirin
		for(int i=4;i>=1;i--) {
			System.out.println(i);
		}
		
		//ekrana ilk uc cift sayma sayisini yazdiriniz(2,4,6)
		//1.yol
		for(int i=2; i<=6 ; i+=2   ) {
			System.out.println(i);
		}
		//2.yol
		for(int i=1; i<=6 ;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
			}
		
		//ekrana ilk 100  cif sayma sayisini yazdiriniz
		
		int sayma=1;
		
		for(int i=1;sayma<=100;i++) {
			
			if(i%2==0) {
				System.out.print(i+" ");
				sayma++;
			}
		}
			
		}
		
		
		
		
	}
