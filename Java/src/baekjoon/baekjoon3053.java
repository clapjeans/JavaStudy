package baekjoon;

import java.util.Scanner;

public class baekjoon3053 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double radius = sc.nextInt(); // ������ �Է�

		double areaCircle = (double) (radius * radius * Math.PI); // ���� ����
		double TaxiareaCircle = (double) (2 * radius * radius); // �ý� ������ ���� ����

		System.out.println(areaCircle);
		System.out.println(TaxiareaCircle);

	}
}