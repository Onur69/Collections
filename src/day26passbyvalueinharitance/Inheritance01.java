package day26passbyvalueinharitance;

public class Inheritance01 {

	public static void main(String[] args) {
		/*
		 Inheritance: Parent-Child iliskisi demektir.
		              Child'larin ortak ozellikler parent'a konulur. 
		              Child'lar parent'lardaki ozellikleri kendi mallari
		              kullanabilir.
		              Bu ==>  a)Code yazmada kolaylik saglar
		                      b)Yazilan codelari update etme veya tamir etmede 
		                        kolaylik saglar.
		                      c)Yazilan codelarin okunabilirligini artirir. 
		                      
		              Child class, Parent class'daki hersyi kullanabilir
		              ama Parent class Child class daki herseyi kullanamz. 
		   
		  NOT==> Javada bir class sadece 1 classa extend edebilir. cunku bir
		         cocugun bir babasi olur bir parente olur yani
		         Java multiple inheritance i onaylamaz.
		         
		  NOT==>Protected ve public methodlar inheritance a uygundurlar
		        private methodlar inheritance a uygun degildir
		        defaul ise; yani package de iseniz inheritance uygundur.
		        Ama farkli package de iseniz uygun degildir.Kullanmak risklidir
		        bu yuzden inheritance de default access midifier olarak kullanilmaz 
		 
		  NOT==>Parent class in es anlamlisi SUPER CLASS
		     	Child in es anlamlisi SUB CLASS dir.
		     	
		  NOT==> Her constructor in ilk satirinda (aksi bir hamle yailmadigi surece)
		  		"super()" constructor call u vardir. super() yazmak istege baglidir
		  		yazsanizda yazmasanizda super() otomatik olarak calisir.
		  		
		  		
		 
		  NOT==> super() ile parenttan constructor cagiriken parametrelere dikkat edin.
				 parent class ta olmayan bir constructoru super() ile cagirisaniz
				 compile time error alirsiniz
				 
		 NOT==> this(); class icinde ki constructorlari parametrelere gore cagirmak icin kullanilir
				 
		 NOT==> Aranan method constructor’i kullanilan class’da varsa sadece o method kullanilir,
		  		yoksa ayni method parent’tan kullanilir.	 
				 
				  */
				
		
	}

}
