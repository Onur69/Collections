package day16constructor;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Test01 {

	static int i=1;
	int k=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (i = 1; i < 10; i++) {
			i=i+2;
			System.out.print(i+" ");//3 6 9
			
		}
		System.out.println(i);//10==> static int i bu
		System.out.println();
		for (int k = 1; k < 10; k++) {
			k= k+2;
			System.out.print(k+" ");//3 6 9 
		}
		//System.out.println(k);==>bu kod hata verir cunku k static degil ama main method static
		//static olmayanlar static methoodlar icinde kullanilamazlar
	}


}
