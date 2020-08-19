package day32interface;

public class Toyota implements Car,Klima{

	public static void main(String[] args) {
		Toyota toyota=new Toyota();
		
		toyota.antiBakteri();
		toyota.isitma();
		toyota.direksiyon();
		toyota.motor();
		toyota.teker();

	}
	@Override
	public void motor() {
		System.out.println("1.0 VTEC Diesel");
		
	}
	@Override
	public void direksiyon() {
		System.out.println("Plastik");
		
	}
	@Override
	public void teker() {
		System.out.println("14 inch demir jant");
		
	}
	@Override
	public void isitma() {
		System.out.println("Kalorifer kullan");
		
	}
	@Override
	public void antiBakteri() {
		System.out.println("Kader...");
		
	}
	@Override
	public void fiyat() {
		// TODO Auto-generated method stub
		
	}

}
