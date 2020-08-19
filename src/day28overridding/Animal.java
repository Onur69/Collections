package day28overridding;

public class Animal {
	
	public void sound() {
		System.out.println("Ses cikarirlar");
	}
	public void numOfFoot() {
		System.out.println("Ayak sayisi bellidir");
	}
	  //NOT==> Classlar data type olabilir. Mesela String Classtir 
	  //ama data type olarakta kullanilir.Burda da Animal Class olmakla
	  //beraber data type olarak kullanildi.
	
	public Animal myMethod() {
		Animal obj=new Animal();
		return null;
		
	}
}
