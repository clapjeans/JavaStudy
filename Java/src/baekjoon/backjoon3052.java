package baekjoon;

import java.util.Scanner;

public class backjoon3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		int count = 0;
		int temp = 0;
		for (int i = 0; i < 10; i++) {
			a[i] = (sc.nextInt() % 42);
		}

		for (int i = 0; i < a.length; i++) {
			temp=0; // i��° �񱳳����� �ٽ� ���� �����ָ� ���� ������ä�� ��� ��
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					temp++; //1ȸ�������� temp�� 0�� �ƴѻ����̱⶧���� ���δٸ��� üũ���� �ȵ� 
				}
			}
			if (temp == 0) {
				count++;
			}
		}

		System.out.println(count);
	}
}