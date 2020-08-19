package day19arrays;

import java.util.Arrays;

public class A02 {

	public static void main(String[] args) {
		//Bir stringi parcalara ayirmaak
		String str= "Ipek topu at, topu at Ipek";
		
		String strArray[]= str.split(",");
		System.out.println(Arrays.toString(strArray));//[Ipek topu at,  topu at Ipek] burda ki virgul arraye ait
		
		//str stringinde kac kelime var
		String sArray[]=str.split(" ");
		System.out.println(Arrays.toString(sArray));//[Ipek, topu, at,, topu, at, Ipek]
		System.out.println(sArray.length);//6
		
		String tArray[]=str.split("");//bu kod space dahil tum karakterleri ayirir
		System.out.println(Arrays.toString(tArray));
		//[I, p, e, k,  , t, o, p, u,  , a, t, ,,  , t, o, p, u,  , a, t,  , I, p, e, k]
		
	}

}
