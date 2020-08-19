package day30exceptions;

public class E04 {

	public static void main(String[] args) {
			
		Object obj= new Integer(100);
		/*
		 INTERWIEV DE SORULDU : Errorlari handle(ustesinden gelmek) edebilirmisin? 
		 Cevap: Errorleri handle edemezsiniz. Exceptionlar handle edebilir 
		 ama Errorler ise bi anda durdurur sistemi...edemez.  
		 2. INTERWIEV SORULARI : "Exceptions istisnai hatalardir. 
		 Ve bir sekilde cozulebilirler. Ama Errorler cozulemiyor. 
		 "Out of memory" (hafiza doldu hatasi, heap memorylerde).....  
		 StackOverflowError ise stack memorynin doldu hatasidir.
		 (Stack memorylerde). Temelde iki ERROR bilmelisiniz. "
		 */
		
		//Java byte, short, int, long, float, double (primitive ler arasinda)
		//arasinda casting yapabilir
		//ama wrapper classlari Stringe ceviremez.Bunu yapmaya calisirsaniz
		//ClassCastException alirsiniz.
		//ClassCastException RTException dir.
		
		System.out.println((Byte)obj);//ClassCastException
	}

}
