package baekjoon;

import java.util.Scanner;

public class baekjoon2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sugar = sc.nextInt();
		int count = 0;
		while (true) {
			if (sugar % 5 == 0) {
				count += sugar / 5; //5�� �������� 5�� ��������
				System.out.println(count);
				break;
			} else {
				sugar -= 3; //5�� ����� �ɶ����� 3�� ����
				count++; //���ٶ����� +1���� 
				
				}

			if (sugar==1||sugar==2) { //sugar 1�Ǵ� 2 �ָ��ϰ� ���������� -1�� ��ȯ�� 
				System.out.printf("-1");
				break;
			}

		}
	}
}
