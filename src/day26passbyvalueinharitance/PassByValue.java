package day26passbyvalueinharitance;

public class PassByValue {

	/*PassByValue:
	 Java bir methoda bir variableye ait degeri yollarken o degerin
	 kopyasini olusturur ve kopyayi methoda yollar.
	 Method kendisine yollanan degeri degistirirken kopya degeri degistirmis olur.
	 Java bu sayede variableye ait orjinali korumus olur.
	 NOTE=Methodlar hep kopya ile calisir kopyayi degistirir,
	 gercek variableyi java saklar.
	 
	 PassByReference:
	 Bunda reference kopyalanip methoda yollanir.Ama orjinal reference da kopya referenceda
	 ayni objeyi gosterdiginden dolayi orjinal obje degismis olur.
	 Java orjinal objenin degismesini istemediginden passbyreferance kullanilmaz.
	 Primitivelerde de non-primitive'lerde de pass by value kullanilir.
	 */
	public static void main(String[] args) {
		
		int gomlek=100;
		//primitiveler
		System.out.println(indOgr(gomlek));//80==>kopyasi
		System.out.println(askInd(gomlek));//95==>kopyasi
		System.out.println(yslInd(gomlek));//90==>kopyasi
		System.out.println(gomlek);//100==>asil
	
		//non-primitiveler
		String hazine="Altin";
		System.out.println(hazinecal(hazine));//Altin calindi==>kopyasi//notta da anlatildigi gibi
		           							//java pass byrefernce degil pass byvalue yapti.yani objenin 
											//value sini degistirdi adresini degil.diger diller reference ni 
											//degistiriyor.
		System.out.println(hazine);//Altin==>asil
		
	}
	public static int indOgr(int gomlek) {
		return gomlek-20;
	}
	public static int askInd(int gomlek) {
		return gomlek-5;
	}
	public static int yslInd(int gomlek) {
		return gomlek-10;
	}
	public static String hazinecal(String hazine) {
		return hazine+" calindi";
	}
}
