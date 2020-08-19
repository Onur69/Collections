package day32interface;

public interface Car {
	/*
	 1- interface bir class degildir,interface interface'dir
	 2- abstract classlarin icine concrete method koyabilirdik ama interface'lerin
	   icine (bazi ozel durumlar haric) concrete method koyamayiz. Yani interface'ler
	   sadece abstract method icerebilir.
	   Bu yuzden interface kullanimi "full abstraction" olarak adlandirilir.
	   Abstract class kullanimina ise kismi (partial abstract) abstract denir.
	 3- interface'ler iclerindeki methodlari default olarak abstract kabul ederler.
	   Bu yuzden method olustururken abstract keyword'unu kullanmak istege baglidir.
	   Asagida ki motor methodunda abstract method kullanmadik problem olmadi.
	   Direksiyon methodunda abstract keyword kullandik yine sorun olmadi.
	 4- interface icine concrete method koyarsaniz CTE verir.
	 5- interface'lerdeki methodlar default olarak "public" olurlar baska bir access modifier 
	   alamazlar.Yani; protected, private ve default olamazlar.
	 6- interface'lerde variableler default olarak "final" olurlar.Degistirilemez olarak atanirlar.
	 7- interface'lerde variablelerin access modifierleri default olarak "public" olurlar.
	 8- interface'lerde variableler default olarak "static" olurlar.
	 9- interface'lerde variable olusturdugunuzda mutlaka deger atamasi(initialize) yapmalisiniz.
	 10- interface'lerden obje uretilemez.
	 */
	
	//yani; int i=12; == final public static int i=12;
	final public static int i=12;//final public static yazmasakta, default olarak oyleymis gibi davranir.
	
	
	public void motor();
	public abstract void direksiyon();
	
	//teker() hem public hemde abstract'tir.
	//void teker(); = public void teker(); = abstract void teker(); = public abstract void teker();
	void teker();
	
	void fiyat();
	
}
