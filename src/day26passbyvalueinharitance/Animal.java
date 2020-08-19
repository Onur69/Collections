package day26passbyvalueinharitance;

public class Animal {
		
	public int age=1;
		
	public Animal() {
		
		System.out.println("Animal");
	}
	public static void main(String[] args) {
		
		Animal animal=new Animal();
		animal.drink();
		animal.eat();

	}
	public void eat() {
		System.out.println("Yemek yerler");
	}
	public void drink() {
		System.out.println("Su icerler");
	}
}
