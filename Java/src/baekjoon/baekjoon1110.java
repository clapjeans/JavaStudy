package baekjoon;

import java.util.Scanner;

public class baekjoon1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); //�Է°��� ���� 
		int save = a; // a�� ������ ������ �޸� �ʰ��� �� �׷��� ���� 
		int count = 0;

		while (true) {
			String b = "";
			b += save% 10; //String Ŭ���� +����� �����Ҷ� ���ڿ��� ��ȯ���� ���ϴ� �� 
			//���ڿ��� ��ġ�� �Ǹ� ������ ���ڿ��� �ٲ�Ե� 
			b += ((save /10) + (save % 10)) % 10;

			save = Integer.parseInt(b);
			count++;
			if (save == a) {
				System.out.println(count);
			   break;

			}
		}

	}

}
