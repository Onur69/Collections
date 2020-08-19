package day09nestedternary;

import java.util.Scanner;

public class NestedTernary02 {

	public static void main(String[] args) {
		/*kullanicidan bir ucgenin uc kenar uzunlugunu aliniz
		 * 3u birbirine esitse cevreyi kontrol edin
		 * cevre 30 dan buyukse "ne buyuksun" yazsin
		 * degilse "normal" yazsin
		 * 3u birbirne esit degilse cevreyi kontrol edin
		 * cevre 20den kucuk ise"ne kucuksun"yazsin
		 * degilse "normal" yazsin		 
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Ucgenin kenarlarini giriniz");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
        String result=(a==b&&a==c)?((a+b+c>30)?("ne buyuksun"):("normal"))//sinavlarda bu sorular parantezsiz sorulur
        						  :((a+b+c<20)?("ne kucuksun"):("normal"));//bu sekildde alt satira gecilebilir
		
		
		System.out.println(result);
		
		scan.close();
	}

}
