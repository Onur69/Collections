package day18arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		
		int arr1[] = new int[3];
		
		//bir arraysi consola yazdirmak icin Arrays.toString() kullaniriz
		System.out.println(Arrays.toString(arr1));//[0,0,0]
		
		//bir Arraysa eleman eklemek
		arr1[2] =11;// son eleman 11 olsun istersek
		System.out.println(Arrays.toString(arr1));
		
		arr1[1]=9;//orta eleman 9 olsun
		System.out.println(Arrays.toString(arr1));
		
		arr1[0]=7;//ilk elemani 7 yapalim
		System.out.println(Arrays.toString(arr1));
		//bir Array de olmayan indexi kullanmaya calisirsaniz run time error alirsiniz
		//arr1[3]=5;//ornegin bu ornekte 3. index olmadigi icin run time error verdi
		
		//kisa yoldan array olusturup deger atama
		int arr2[] = {8, 10, 12, 14};
		System.out.println(Arrays.toString(arr2));
	
		//bir array daki belli bir elemani ekrana yazdirmak
		System.out.println(arr2[1]);//10
		System.out.println(arr2[3]);//14
		System.out.println(arr2[0]);//8==>ilk eleman herzaman "arrayismi[0]"ile yazdirilir

		//her array de son elemani yazdiran kod nedir
		
		int arr3[]= {21,22,23,24,25,26};
		System.out.println(arr3[arr3.length-1]);//26==> son eleman herzaman arrayismi[arrayismi.length-1] ile bulunur
		
		//bir array olusturunuz bu arrayin tum elemanlarini for-loop kullanarak ekrana ayni satirda aralarina bosluk koyarak yazdirin
		
		int arr4[]= {1,2,3,4};
		
		for (int i = 0; i < arr4.length;i++ ) {
			System.out.print(arr4[i]+" ");
			
		}
		System.out.println();
		//bir array olusturunuz bu arrayin indexi cift olan elemanlarini while loop
		//kullanarak ekrana ayni satirda ve aralarina bosluk koyarak yaziniz
		int arr5[]= {1,3,4,5,6,7,8};
		int i=0;
		while (i<arr5.length) {
			if (i%2==0) {
				System.out.print(arr5[i]+" ");
			}
			i++;
		}
		
		
		
		
		
		
	}}
