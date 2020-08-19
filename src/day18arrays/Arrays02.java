package day18arrays;

import java.util.Arrays;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import day11stringmethodsforloopdt.ForLoop01;

public class Arrays02 {

	public static void main(String[] args) {
		// iki array olusturunuz lenghti ayni olsun.bu arraylerin tum elemanlari ayni ise
		//ekrana "ayni" yazdirin.farkli ise ekrana "farkli" yazdirin

		int arr1[]= {1,4,7,78,6};
		int arr2[]= {1,3,5,7,8,9};
		
		if (Arrays.equals(arr1, arr2)) {
			System.out.println("ayni");
		}else {
			System.out.println("farkli");
		}
	
System.out.println("=================");
	//hocanin 1. yolla cozumu==> bu cozum index sayilari esitse calisiyoor yoksa calismiyor
	
	char ch1[]= {'a','c','v','k'};
	char ch2[]= {'a','c','v','k'};
	int z=0;
	for(int i=0; i< ch1.length;i++) {
		if (ch1[i]==ch2[i]) {
			z++;
		}
	}
	if (z==ch1.length) {
		System.out.println("ayni");
	}else {
		System.out.println("farkli");
		
	}
	
	//hocanin 2. yol cozumu
	
	if (Arrays.equals(ch1, ch2)) {
		System.out.println("ayni");
		
	}else {
		System.out.println("farkli");
	}
	
	
	
	
	
	
	
	
	}
	
	
}
