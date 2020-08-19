package day26passbyvalueinharitance;

public class Cat extends Mammal {
	
	public boolean biyik = true;
	
	public Cat() {
		System.out.println("Cat");
	}

	public static void main(String[] args) {
		
		Cat cat=new Cat();
		cat.clean();
		cat.drink();
		cat.eat();
		cat.feed();
		cat.meow();

	}
	public  void meow() {
		System.out.println("Miyavlarlar");
	}
	public  void clean() {
		System.out.println("Temizlenirler");
	}

}
