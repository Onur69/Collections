package day12forvewhileloop;

public class ForLoop01 {

	public static void main(String[] args) {
		/*
		 ilk 30 sayma sayisinin toplamini ekrana yazdiran
		 program
		 */
		
		int sum=0;
		for(int i=1; i<=30; i++) {
			
			sum=sum+i;
			
		}
		/*final sonucu gormek isterseniz System.out.println("toplam="+ sum);
		ifadesini for-loop un disina yaziniz.
		her loop tan sonra ki toplami gormek isterseniz System.out.println("toplam="+ sum);
		ifadesini fo-loop un icine yazilir	*/	
		System.out.println("toplam="+ sum);
		
		
		//ilk 10 sayma sayisinin carpimini ekrana yazdirin
		//matemetikte 1*2*3*4 ifadesine 4 faktoriyel denirve 4! ile gosterilir
		//INTERVIEW SORUSUDUR==>faktoriyel hesabini yapan bir program yapin diye sorulur
		int product=1;
		for(int i=1; i<=10; i++) {
			
			product=product*i;
		
		}
		System.out.println("carpim="+ product);
	
		//100 ile 200 arasinda ki 3 ile bolunebilen sayilarin toplamini bulan program
	    int sum1=0;
		for(int i=101; i<200; i++) {
			if(i%3==0) {
				sum1=sum1+i;
			}
		}
		System.out.println(sum1);
	
	}

}
