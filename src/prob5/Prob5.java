package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String answer = "";

		while (true) {
			Random r = new Random();
			int k = r.nextInt(100) + 1;

			int cnt = 1;
			int min = 1, max = 100;
			int num = 0;

			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			System.out.println(min + "-" + max);
			System.out.print(cnt + ">>");
			num = scanner.nextInt();

			while (num != k) {
				if (num > k) {
					max = num;
					System.out.println("더 낮게");
				} else if (num < k) {
					min = num;
					System.out.println("더 높게");
				}
				
				System.out.println(min + "-" + max);
				System.out.print(++cnt + ">>");
				num = scanner.nextInt();
			}

			System.out.println("맞았습니다.");
			System.out.println("다시 하시겠습니까?(y/n)");
			answer = scanner.next();

			if (answer.equals("n")) {
				System.out.println("종료합니다.");
				break;
			} else {
				continue;
			}
		}
	}
}