package day09nestedternary;

import java.util.Scanner;

public class Switch04 {

	public static void main(String[] args) {
		/*
		 kullanici ay ismini girince 
		 o ayin mevsimini ekrana yazdirin
		 */
        //not= Switchlerde boolean ,duoble ,float,long kullanilmaz
		Scanner scan=new Scanner(System.in);
		System.out.println("ay ismini giriniz");
		String ay=scan.next();
		
		//1.yol ve uzun
		switch (ay) {
		
		case "ocak":
			System.out.println("kis");
			break;
		case "subat":
			System.out.println("kis");
			break;
		case "mart":
			System.out.println("ilkbahar");
			break;
		case "nisan":
			System.out.println("ilkbahar");
			break;
		case "mayis":
			System.out.println("ilkbahar");
			break;
		case "haziran":
			System.out.println("yaz");
			break;
		case "temmuz":
			System.out.println("yaz");
			break;
		case "agustos":
			System.out.println("yaz");
			break;
		case "eylul":
			System.out.println("sonbahar");
			break;
		case "ekim":
			System.out.println("sonbahar");
			break;
		case "kasim":
			System.out.println("sonbahar");
			break;
		case "aralik":
			System.out.println("kis");
			break;	
		default:
			System.out.println("yanlis giris yaptiniz");
		}
		
		//2.yol ve kisa
		
		switch(ay) {
        
        case "Aralik":
        case "Ocak":
        case "Subat":
            System.out.println("Kis");
            break;
        case "Mart":
        case "Nisan":
        case "Mayis":
            System.out.println("Ilkbahar");
            break;
        case "Haziran":
        case "Temmuz":
        case "Agustos":
            System.out.println("Yaz");
            break;
        case "Eylul":
        case "Ekim":
        case "Kasim":
            System.out.println("Sonbahar");
            break;
        default:
            System.out.println("Gecerli ay ismi giriniz");
        }
		
		
		
		scan.close();
	}

}
