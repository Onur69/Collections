package day20multidimensionalarrays;

import java.util.Arrays;

public class Mda01 {

	public static void main(String[] args) {
		//multi dimensional array nasil olusturulur
		int mda[][]=new int[3][2];
		
		//Arraya deger atamasi nasil yapilir
		mda[1][0]=7;
		
		//multi dimensional arrayler nasil console'a yazdirilir
		System.out.println(Arrays.deepToString(mda));//[[0, 0], [7, 0], [0, 0]]
		
		mda[2][0]=11;		
		System.out.println(Arrays.deepToString(mda));//[[0, 0], [7, 0], [11, 0]]
		
		mda[0][1]=23;		
		System.out.println(Arrays.deepToString(mda));//[[0, 23], [7, 0], [11, 0]]
		
		mda[0][0]=10;
		mda[1][1]=12;
		mda[2][1]=55;
		System.out.println(Arrays.deepToString(mda));//[[10, 23], [7, 12], [11, 55]]
		
		//multi dimensional array lerde istenen bir elemani yazdirmak
		System.out.println(Arrays.toString(mda[0]));//[10, 23]
		System.out.println(Arrays.toString(mda[1]));//[7, 12]
		System.out.println(Arrays.toString(mda[2]));//[11, 55]
		System.out.println(mda[0][0]);//10
		System.out.println(mda[1][1]);//12
		System.out.println(mda[2][1]);//55
		
		//multi dimensional array olusturmanin kisa yolu
		
		char mdach[][]= { {'a','b','c'},{'d'},{'e','f'},{'g','h','i','k'} };
		System.out.println(Arrays.deepToString(mdach));//[[a, b, c], [d], [e, f], [g, h, i, k]]
		
		//soru: yukarida ki multi dimensional array daki ilk arrayin elemanlarinin 
		//ascii  degerleri toplamini yazdirin
		
		//1.yol ==> bu yol hard code dur
		System.out.println(mdach[0][0] + mdach[0][1] + mdach[0][2]);//294
		
		//2.yol for loop==> bu kod flexible dinamik bir koddur ve tercih edilir
		int sum=0;
		for (int i = 0; i < mdach[0].length; i++) {
			sum=sum+mdach[0][i];
		}
		System.out.print(sum);//294
		
	}

}
