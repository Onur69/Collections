package day26passbyvalueinharitance;

public class Car extends Vehicle {
	/*
	 super() ile parenttan constructor cagiriken parametrelere dikkat edin.
	 parent class ta olmayan bir constructoru super() ile cagirisaniz
	 compile time error alirsiniz
	 
	 this(); class icinde ki constructorlri parametrelere gore cagirmak icin kullanilir
	 */
	
	public Car() {
		super(2);
		System.out.println("Car");
	}
	public Car(String name) {
		this();
		System.out.println("Car");
	}

	public static void main(String[] args) {
		
		Car car = new Car("Honda");
	
	}

}
