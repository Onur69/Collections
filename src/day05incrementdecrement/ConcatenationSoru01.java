package day05incrementdecrement;

public class ConcatenationSoru01 {

	public static void main(String[] args) {
		
		int num1=2;
		int num2=3;
		String str1="cok";
		String str2="calis";

		//ekrana cok calis 1 yazdir
		System.out.println(str1+" "+str2+" "+(num2-num1));
		
		//5 cok calis yazdir
		System.out.println((num1+num2)+" "+str1+" "+str2);
		
		//cok23 yazdir
		System.out.println(str1+num1+num2);//cok23
		
		System.out.println(str1+(num1+num2));//cok5
		
		System.out.println(num1+num2+str1);//5cok
		


		
		
		
		
		int n1=2;
		int n2=3;
		String s1="study";
		
		//ekrana 61 study-1 yazdirin
		
		System.out.println(n1*(n2*((n1+n2)+(n1+n2)))+(n2-n1)+" "+s1+(n1-n2));//1.yol
		 
		System.out.println((n1*n2)+""+(n2-n1)+" "+s1+(n1-n2));//2. yol `en dogrusu budur ama`
	
		
	
		
		
	}

}
