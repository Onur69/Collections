package day15constructors;

public class C02 {
		/*1)class olusturdugumuzda java bizim kesinlikle object uretecegimizi dusunur ve 
		 *  class ile beraber gorunmez bir construcktor olusturur.bu construcktor parametresiz bir construcktor dur 
		 *  ve ismi "default construcktor" dur.
		 *2)siz kendiniz herhangi bir construcktor uretirseniz java default construcktoru iptal eder.
		 *
		 */
	
	C02(int i){
		
	}
	
	C02(){
		
	}
	public static void main(String[] args) {
		// 
		C02 obj1 = new C02();
	}

}
