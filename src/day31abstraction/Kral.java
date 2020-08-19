package day31abstraction;

public class Kral  extends Otel{
  public static void main(String[] args) {
		
		Kral krl = new Kral();
		krl.cay();//Cay ic iyidir...
		krl.kahvalti();//Insan gibi ye...
		krl.wifi();//7/24 wifi servisi

	}

	@Override
	public void kahvalti() {
		System.out.println("Insan gibi ye...");	
	}

	@Override
	public void cay() {
		System.out.println("Cay ic iyidir...");
	}
}