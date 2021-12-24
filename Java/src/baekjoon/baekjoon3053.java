package baekjoon;

import java.util.Scanner;

public class baekjoon3053 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double radius = sc.nextInt(); // 반지름 입력

		double areaCircle = (double) (radius * radius * Math.PI); // 원의 넓이
		double TaxiareaCircle = (double) (2 * radius * radius); // 택시 기하학 원의 넓이

		System.out.println(areaCircle);
		System.out.println(TaxiareaCircle);

	}
}