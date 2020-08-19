package day26passbyvalueinharitance;

public class Mammal extends Animal {
		
	public boolean dogum = true;
	
	public Mammal() {
		System.out.println("Mammal");
	}
	
	public static void main(String[] args) {
		
		Mammal mammal= new Mammal();
		mammal.drink();
		mammal.eat();
		mammal.feed();

	}
	public void feed() {
		System.out.println("Yavrularini beslerler");
	}
}
