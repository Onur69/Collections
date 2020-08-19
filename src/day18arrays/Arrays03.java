package day18arrays;

public class Arrays03 {

	public static void main(String[] args) {
		
		String s[]= {"Ali","Veli","Can"};//normalde string kabul etmez 
		//ancak adresini basar. ama isi cozmustur yazdirirken reference dan stringi bulur
		System.out.println(s[1]);//veli==>reference dan gidip stringi buldu
	}

}
