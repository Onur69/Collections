package day28overridding;

public class Dog extends Animal{
	
	/*METHOD OVERRIDING
	1- Parent taki methodu method sinature sini degistirmeden,method bady sini degistirerek
	   child class ta kullanmaya "METHOD OVERRIDING" denir
	   method overridding isvec cakisi gibi birkac iste birden kullanilir.
	   INTERVIEW SORUSU==> overloading ve overridding farki nedir
	2- Parent classtaki private methodlar override edilemezler.
	3- Final methodlar override edilemezler. Cunku; final methodlarin bodyleri olabilecekleri
	   son haldedir. Yani method bodyleri degistirilemez. Halbuki overridingin amaci method bodyi 
	   degistirerek methodu kullanmaktir. Bu sebepten java final methodlarin override edilmesine
	   musade etmez.
	4- Static methodlar override edilemezler. Cunku; static methodlar ortak kullanima aciktir
	   onun bodysini degistirmek herkesi etkiler bu yuzden java static methodlarin override
	   edilmesine musade etmez.
	5- Child classtaki override edilmis method(everriding method) access modifieri, parent classtaki 
	   override edilen methodun (overridden method) access modifierinden daha dar olamaz.
	NOT==> Classlar data type olabilir. Mesela String Classtir ama data type olarakta kullanilir.
	6- Child classtaki override edilmis methodun return type ya parent classtaki override edilmis
	   methodun return type ile ayni olur, yada child larindan biri ile ayni olabilir.
	   public Cat myMethod() {} || public Animal myMethod() {}
	*/

	public static void main(String[] args) {
		
		Dog dog=new Dog();
		dog.sound();//Havlarlar
		dog.numOfFoot();//4 ayaklari vardir
	}
	public void sound() {
		System.out.println("Havlarlar");
	}
	@Override
	public void numOfFoot() {
		
		System.out.println("4 ayaklari vardir");
	}
	
}
