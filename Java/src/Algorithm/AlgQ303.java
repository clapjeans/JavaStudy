package Algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class AlgQ303 {

	static int serCh(int[] A, int N, int Key, int[] B) {
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == Key)
				B[count++] = i;

		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("��Ҽ��� �Է��ϼ���");
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "]");
			a[i] = sc.nextInt();
		}

		System.out.print("ã�� ���� �Է��ϼ���");
		int key = sc.nextInt();

		int count = serCh(a, n, key, b);
		if (count == 0)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else {
			for (int i = 0; i < count; i++) {
				System.out.print("�װ��� x["+b[i]+"]���ֽ��ϴ�.");
			}
		}
	}

}
