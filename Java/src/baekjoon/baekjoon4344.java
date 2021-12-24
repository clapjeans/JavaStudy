package baekjoon;

import java.util.Scanner;

public class baekjoon4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 갯수
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt(); // 점수의 갯수
			int sum = 0; // 점수 합
			int count = 0; // 점수넘은 사람수
			float medium = 0f; // 넘은학생 비율
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
