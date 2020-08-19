package day15constructors;

public class Araba {

	int yil= 2019;
	String marka = "Toyota";
	String model = "Rav4";
	int fiyat = 20000;
	
	Araba(String model, int fiyat){
		this.model = model;
		this.fiyat = fiyat;
	}
	
	Araba(int fiyat,String marka, String model,int yil ){
		this.fiyat=fiyat;
		this.marka=marka;
		this.model=model;
		this.yil=yil;
		
	}
	
	Araba(){
		
	}
	
	public static void main(String[] args) {
		
		Araba a1 = new Araba();
		System.out.println("Fiyat: " + a1.fiyat);//20000
		System.out.println("Marka: " + a1.marka);//Toyota
		System.out.println("Model: " + a1.model);//Rav4
		System.out.println("Yil: " + a1.yil);//2019
		a1.hizlanma(10);
		a1.tuketim();
		
		
System.out.println("===============================");
		
		Araba a3 = new Araba("Corolla", 15000);
		System.out.println("Fiyat: " + a3.fiyat);//15000
		System.out.println("Marka: " + a3.marka);//Toyota
		System.out.println("Model: " + a3.model);//Corolla
		System.out.println("Yil: " + a3.yil);//2019
		a3.hizlanma(9);
		a3.tuketim();
		
System.out.println("===============================");
		
		Araba a2 = new Araba(15000,"Opel","Corsa",2001);
		System.out.println("Fiyat: " + a2.fiyat);//15000
		System.out.println("Marka: " + a2.marka);//Opel
		System.out.println("Model: " + a2.model);//Corsa
		System.out.println("Yil: " + a2.yil);//2001
		a2.hizlanma(8);
		a2.tuketim();
		
	}
	public void hizlanma (int i) {  //int i yazarak methodu dinamik(degisken)yaptik
		System.out.println(i +" sn de 100km/s e ulasir");//dinamik yapinca burda i degisebilir hale geldi
	}
	
	public void tuketim () {
		System.out.println("km de 0.1$ yakar");
	}
}
