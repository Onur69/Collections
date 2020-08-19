package day20multidimensionalarrays;

public class Mda02 {
	/*multi dimensional array integer olarak olusturun ve tum elemanlarinin 
	 * toplamini ekrana yazdirin
	 */
	public static void main(String[] args) {
		
		int mdai[][]= { {1,2},{3},{4,5,6} };
		//1 yol hard coding :(
		System.out.println(mdai[0][0]+mdai[0][1]+mdai[1][0]+mdai[2][0]+mdai[2][1]+mdai[2][2]);
	
		//2.yol for loop==> dynamic coding
		
		int sum=0;
		for (int i = 0; i < mdai.length; i++) {
			for (int k = 0; k < mdai[i].length; k++) {
				sum=sum+mdai[i][k];
			}
		}
		System.out.println(sum);
	
	}

}
