package prob4;
public class Prob4 {

	public static void main(String[] args) {
		char[] c1 = reverse("Hello World");
		printCharArray(c1);
		
		char[] c2 = reverse("Java Programming!");
		printCharArray(c2);
		
		char[] nn = "ddd".toCharArray();
		
	}
	
	public static char[] reverse(String str) {
		/* 코드를 완성합니다 */
		char[] temp = str.toCharArray();
		
		for (int i = 0; i < str.length(); i++) {
			temp[i] = str.charAt((str.length()-1) - i);
		}
		
		return temp;
	}

	public static void printCharArray(char[] array){
		/* 코드를 완성합니다 */
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println();
	}
}
