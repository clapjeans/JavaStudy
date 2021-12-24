
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

		System.out.println("�ﰢ�� ������� ��Ÿ���ϴ�.");

		do {
			System.out.print("�ܼ��� ��");
			n = stdIn.nextInt();
		} while (n <= 0);

		System.out.println("���� �Ʒ��� ������ �ﰢ��");
		triangle(n); // ���� �Ʒ��� ������ �̵�ﰢ��

		System.out.println("���� ���� ������ �ﰢ��");
		triangleA(n); // ���� ���� ������ �̵�ﰢ��

		System.out.println("������ �Ʒ��� ������ �ﰢ��");
		triangleB(n); // ������ ���� ������ �̵�ﰢ��

		System.out.println("������ ���� ������ �ﰢ��");
		triangleC(n); // ������ �Ʒ��� ������ �̵�ﰢ��

	}

}
