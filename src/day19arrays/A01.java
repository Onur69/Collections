package day19arrays;

import java.util.Arrays;

public class A01 {

	public static void main(String[] args) {

		int arr[]= {3,7,1,18};
		System.out.println(Arrays.toString(arr));
		
		//Array elemanlarini kucukten buyuge siralayalim
		//kodunuz arrayse bisey lazim olunca Arrays classina gidilir
		
		//=====SORT======METHODU
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//Bir String array olusturun elmanlarini alfabetik sirada dizin
		String arr1[]= {"Ali","Aliye","Can","Furkan","Fadime"};
		
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		//Bir integer arrayda ki en buyuk ve en kucuk sayiyi ekrana yazdiran program ndir
		
		int arr2[]= {1,2,3,4,5};
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		System.out.println("En kucuk: "+arr2[0]+"\n"+"En buyuk: "+arr2[arr2.length-1]);
		
		//bir string array  olusturun alfabetik siraya gore bastn ve sondan 2. elemanlari yazdirin
		
		String arr3[]= {"ali","veli","can","dursun"};
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));
		System.out.println("Bastan ikinci sirada: "+arr3[1]+"\n"+"Sondan ikinci sirada: "+arr3[arr3.length-2]);
		
		//Bir elemanin array de var olup olmadigini kontrol etmek
		int arr4[]= {2,1,7,3,5};
		
		//yukarida ki array de 7 elemanin var olup olmadigini kontrol ediniz
		
		//1. yol=loop ile
		int count=0;
		for (int i = 0; i < arr4.length; i++) {
			if(arr4[i]==7) {
				count++;
			}
		}
		if(count!=0) {
			System.out.println("7 eleman olarak var");
		}else {
			System.out.println("7 eleman olarak yok");
		}
		//2. yol==>binarySearch() kullanarak
		//==> a- once array sort() kullanilir mutlaka.kullanmazsaniz bazen yanlis sonuc aliriz
		Arrays.sort(arr4);//[1,2,3,5,7]
		//==> b- aradiginiz eleman array de varsa binarySearch() o elemanin indexini verir
		System.out.println(Arrays.binarySearch(arr4, 7));//4
		
		/*binarySearch () methodu, eleman arrayda varsa asla negatif bir output vermez.
		  binarySearch () methodu, eleman arrayda yoksa negatif bir output verir.
		  Ayni zamanda, olsaydi hangi indexte oldugunu da verir
		 */
		
		System.out.println(Arrays.binarySearch(arr4, 6));//-5 verir==> - nin anlami yok demektir
														//5 'in anlami ==> var olsaydi 5. eleman olurdu demektir(indexini degil lengthini verir)
		System.out.println(Arrays.binarySearch(arr4, 4));//-4
		
		System.out.println(Arrays.binarySearch(arr4, 99));//-6
		
		//NOTE=bir array de ayni(tekrarli) elemanlar varsa binarySearch() methodu elemanin var olup olmadigi hakkinda 
		//dogru karar verebilir ama o elemanin sirasi hakkinda bazen yanilir.Bu javanin bug'idir.
		int mrr[]= {1,3,8,3,11};
		Arrays.sort(mrr);//{1,3,3,8,11}
		System.out.println(Arrays.binarySearch(mrr, 3));//1 veya 2 cikiyor yani kesin sonuc yok
		
	}

}
