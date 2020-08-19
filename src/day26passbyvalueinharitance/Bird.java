package day26passbyvalueinharitance;

public class Bird extends Animal{
	
	public boolean kanat = true;
	
	public Bird() {
		System.out.println("Bird");
	}

	public static void main(String[] args) {
	
		Bird bird=new Bird();
		bird.drink();
		bird.eat();
		bird.fly();
		bird.nest();
		bird.tweet();
		
	}
	public void fly() {
		System.out.println("Ucarlar");
	}
	public void tweet() {
		System.out.println("Oterler");
	}
	public void nest() {
		System.out.println("Yuva yaparlar");
	}

}
