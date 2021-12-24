
package Algorithm;

import java.util.Scanner;

public class AlgQ15 {

	static void triangle(int n) {
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++)
				System.out.print("*");

			System.out.println();
		}

	}

	static void triangleA(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void triangleB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j <= n - i)
					System.out.print(" ");
				else {
					System.out.print("*");
				}
			}
			System.out.println();

		}
	}

	static void triangleC(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j < i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("삼각형 모양으로 나타냅니다.");

		do {
			System.out.print("단수는 ：");
			n = stdIn.nextInt();
		} while (n <= 0);

		System.out.println("왼쪽 아래가 직각인 삼각형");
		triangle(n); // 왼쪽 아래가 직각인 이등변삼각형

		System.out.println("왼쪽 위가 직각인 삼각형");
		triangleA(n); // 왼쪽 위가 직각인 이등변삼각형

		System.out.println("오른쪽 아래가 직각인 삼각형");
		triangleB(n); // 오른쪽 위가 직각인 이등변삼각형

		System.out.println("오른쪽 위가 직각인 삼각형");
		triangleC(n); // 오른쪽 아래가 직각인 이등변삼각형

	}

}
