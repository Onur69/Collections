package day32interface;

public class Honda implements Car,Klima{
	/*
	 1- Bir class'i bir interface'in child'i yapmak icin "implements" keyword kullaniriz.
	 2- Abstract class kullanarak abstraction yaparsak bir classa biden fazla parent koyamayiz.
	 Cunku Java multiple inharitence'a musaade etmez. Bu yuzden interface kullaniriz ve 
	 bir class icin 1'den fazla parent olusturarak calisabiliriz.
	 3- 1'den fazla interface'i bir class icin parent yaptiginizda, parent olan interface'lerde
	 ayni isimli methodlar kullanabilirsiniz. Ama ayni isimli methodlarin return type'lari ayni 
	 olmak zorundadir. Ayni olmazsa CTE alirsiniz.
	 4- 1'den fazla interface'i bir class icin parent yaptiginizda, parent olan interface'lerde
	 ayni isimli variableler kullnabilirsiniz. Ancak, hangi variable'i kullanacaginiza
	 interface ismini kullanarak siz karar vermelisiniz. 
	 Aksi taktirde Java hangisini kullanacagina karar veremez bu yuzden CTE alirsiniz.
	 */
	public static void main(String[] args) {
		Honda honda=new Honda();
		
		honda.antiBakteri();
		honda.isitma();
		honda.direksiyon();
		honda.motor();
		honda.teker();
		System.out.println(Car.i);//(Klima.i) deseydik "15" basacakti

	}
	@Override
	public void motor() {
		System.out.println("1.6 VTEC Diesel");
		
	}
	@Override
	public void direksiyon() {
		System.out.println("Suni deri");
		
	}
	@Override
	public void teker() {
		System.out.println("16 inch alasim");
		
	}
	@Override
	public void isitma() {
		System.out.println("Isitma var");
		
	}
	@Override
	public void antiBakteri() {
		System.out.println("99% bakteri koruma");
		
	}
	@Override
	public void fiyat() {
		System.out.println("Ozellige gore degisir.");
		
	}

}
