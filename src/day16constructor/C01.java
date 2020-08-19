package day16constructor;

public class C01 {
	
	int i=12;//instance variable/objecte asildigi icin variable denir
	static int k=13;// static variable/hatta classa asildigi icin variable de denir

	public static void main(String[] args) {

		C01 obj1 = new C01();
		obj1.i = 20;
		System.out.println(obj1.i); //20
		
		obj1.k=30;
		System.out.println(obj1.k);//30
		
		C01 obj2 = new C01();
		System.out.println(obj2.i); //12 
		
		System.out.println(obj2.k);//30
	}

	/*1) static variableler classlara aittir  ve diger adlari "class variebledir"
	 * instance variableler objectlere aittir ve diger adi object variabledir
	 * 2)static variablelerdeki degisiklikler kim tarfindan yapilirsa yapilsin 
	 * butun objectler tarafindan gorulur
	 * instance veriableler deki degisiklikler sadece o instance variable hangi objecte aitse onun 
	 * tarafindan gorulur
	 * 3)static variableler classlar olusturulurken java tarafindan olustururlur
	 * instance veriablelerse objectler olusturulurken olusturulur
	 * 4) 1 class , class icinde 1 tane static ve 1 tane  de instance variable var.
	 * bu classtan 10 object olusturulursa 1 tane static variable ve 10 tane instance variable 
	 * uretilmis demektir
	 * 
	 */
}
