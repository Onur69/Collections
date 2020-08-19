package day28overridding;

public class Cat extends Animal {

	public static void main(String[] args) {
		
		Cat cat=new Cat();
		cat.sound();//Miyavlarlar
		cat.numOfFoot();//4 ayaklari vardir
	}
	public void sound() {
		System.out.println("Miyavlarlar");
		
	}
	@Override//Annotation(ozel kelime-not)denir bu duruma. source dan otomatik olarak yaptik
			 //Asagida ki methodun Override kurallarina uygun olup olmadigini
			 //kontrol edip uyari yapar.
	public void numOfFoot() {
		
		System.out.println("4 ayaklari vardir");
	}
	@Override
	public Dog myMethod() {
		Animal obj1= new Animal();
		return null;
	}
	
}
