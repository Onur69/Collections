package day12forvewhileloop;

public class WhileLoop03 {

	public static void main(String[] args) {
		
		//ilk 100 cift sayma sayisini yazdiran program yaziniz
		
		
		int sayma=1;
		int k=1;
		
		while(sayma<=100) {
			if(k%2==0) {
				System.out.print(k+" ");
				
				sayma++;
			}
			k++;
		}
	}

}
