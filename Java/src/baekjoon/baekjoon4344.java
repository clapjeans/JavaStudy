package baekjoon;

import java.util.Scanner;

public class baekjoon4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // ����
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt(); // ������ ����
			int sum = 0; // ���� ��
			int count = 0; // �������� �����
			float medium = 0f; // �����л� ����
			int a[] = new int[num];
			for (int j = 0; j < num; j++) {
				a[j] = sc.nextInt();
				sum += a[j];
			}
			for (int j = 0; j < num; j++) {
				if (a[j] > (sum / num)) {
					count++;
				}
			}
			medium = (float) count / num * 100;
			System.out.printf("%.3f%s\n", medium,"%");
		}
	}

}
