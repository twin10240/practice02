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

			// System.err.println("k : " + k);

			int cnt = 1;
			int min = 1, max = 100;
			int num = 0;

			System.out.println("���� �����Ͽ����ϴ�. ���纸����");
			System.out.println(min + "-" + max);
			System.out.print(cnt + ">>");
			num = scanner.nextInt();

			while (num != k) {
				if (num > k) {
					max = num;
					System.out.println("�� ����");
					System.out.println(min + "-" + max);
					System.out.print(++cnt + ">>");
					num = scanner.nextInt();
				} else if (num < k) {
					min = num;
					System.out.println("�� ����");
					System.out.println(min + "-" + max);
					System.out.print(++cnt + ">>");
					num = scanner.nextInt();
				}
			}

			System.out.println("�¾ҽ��ϴ�.");
			System.out.println("�ٽ� �Ͻðڽ��ϱ�?(y/n)");
			answer = scanner.next();

			if (answer.equals("n")) {
				System.out.println("�����մϴ�.");
				break;
			} else {
				continue;
			}
		}
	}
}