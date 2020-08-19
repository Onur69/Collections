package day26passbyvalueinharitance;

public class Dog extends Mammal {

		public boolean loyal = true;
		
		public Dog() {
			super();//bu super her construcktorda bulunur ancak java onu yazili 
					//olmasa da otomatik olarak calistirir. O yuzden yazmasakta olur
			System.out.println("Dog");
		}
	
	public static void main(String[] args) {
		
		Dog dog=new Dog();
		dog.bark();
		dog.drink();
		dog.eat();
		dog.feed();
		dog.smell();
		System.out.println("Sadik? "+dog.loyal);
		System.out.println("Dogum? "+ dog.dogum);
		System.out.println(""+dog.age);
		
	}
	public void bark() {
		System.out.println("Havlarlar");
	}
	public void smell() {
		System.out.println("Iyi koku alirlar");
	}
}
