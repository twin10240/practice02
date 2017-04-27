package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		final int[] MONEYS = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};

		Scanner scanner = new Scanner(System.in);
		System.out.print("금액 : ");
		int cash = scanner.nextInt();
		int cnt = 0;
		
		while (cash > 0) {
			System.out.println(MONEYS[cnt] + "원 : " + cash / MONEYS[cnt] + "개");
			cash -= MONEYS[cnt] * (cash / MONEYS[cnt]);
			cnt++;
		}

		scanner.close();
 	}
}