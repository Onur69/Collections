package day12forvewhileloop;

public class WhileLoop04 {

	public static void main(String[] args) {
		// j den once ki tum kucuk harfleri yazdiran program yaziniz while-loop ile
		
		char ch='a';
		
		while(ch<'j') {
			System.out.print(ch+" ");
		ch++;
		}
		System.out.println();
		
		// ilk 5 buyuk harfin ascii degerleri toplamini ekrana yazdiran program yaziniz
		int sum=0;//toplamini sorunca direkt olarak bu veriable yi olustururuz
		char n='A';
		
		while(n<='E') {
			sum=sum+n;//charlari matematik isleminde kullaninca asci degerini kullanir
			n++;
		}System.out.print(sum);
	
	
	
	
	}

}
