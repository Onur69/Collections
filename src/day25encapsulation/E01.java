package day25encapsulation;

public class E01 {

	/*
	 capsul=biseyi saklamak
	 1-day25encapsulation(Data saklamak(hiding=saklamak))=>icinde ki datayi saklar.data hiding demektir
	 2- Encapsulation yapmak icin variableleri "private" yapariz.
	 3- Encapsulation yaptiginiz variableyi;
		 a- okumak icin
		 b- degistirmek icin acabilirsiniz
	 
	 
	 */
	
	private int sifre = 123456;
	private String isim = "Ali Can"; 
	private String soyad = "Canan";
	private char ch = 'A';
	
	
	public static void main(String[] args) {
		
	}
	//Encapsulation yaptiginiz variablenin baska classlardan okunabilmesini isterseniz 
	//getter method olusturmaniz gerekir.getter method bu olusturdugumuz "public int getSifre(){}" olandir
	
	//getter olusturmak icin
	//1- Access modifier public olmalidir
	//2- Return type variablenin rturn type ile ayni olmali
	//3- "Isim get+variable ismi" seklinde olsun
	//4- Methodun icinde "return+variable ismi" yazilsin
	public int getSifre() {
	return sifre;
}
	
	public String getIsim() {
		return isim;
	}
	public String getSoyad() {
		return soyad;
	}
	public char getCh() {
		return ch;
	}
	/*
	 1-Access modifieri public yapiniz
	 2-Return type herzaman void yapiniz
	 3-Method ismi "set+variable ismi" sekilnde yaziniz
	 4-Method parantezi icine variableyi return type ile beraber yaziniz
	 5-Method body`si icine "this.ch=ch;" olarak yaziniz.(variable ismi ch ise)
	 6-Setter ile degeri degistirince class taki deger degismez, objede ki deger degisir
	 */
	public void setSifre(int sifre) {
		this.sifre=sifre;
	}
	public void setCh(char ch) {
		this.ch=ch;
	}
	public void setIsim(String isim) {
		this.isim=isim;
	}
	
	
	
	
	
	
}
