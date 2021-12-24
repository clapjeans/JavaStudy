package Algorithm;

import java.util.Scanner;

public class AlgQ304 {

	static int seqSearch(int a[], int n, int key) {
		System.out.println(" |");
		for (int k = 0; k < n; k++)
			System.out.printf("%4d", k);
		System.out.println();

		System.out.print("---+");
		for (int k = 0; k < 4 * n + 2; k++)
			System.out.print("-");
		System.out.println();

		int pl = 0; // �˻����� �� ���� index
		int pr = n - 1; // �˻����� �� ���� index

		do {
			int pc = (pl + pr) / 2; // �߾ӿ���� index

			System.out.print("   |");
			if (pl != pc)
				System.out.printf(String.format("%%%ds<-%%%ds+", (pl * 4) + 1, (pc - pl) * 4), "", "");
			else
				System.out.printf(String.format("%%%ds<-+", pc * 4 + 1), "");
			if (pc != pr)
				System.out.printf(String.format("%%%ds->\n", (pr - pc) * 4 - 2), "");
			else
				System.out.println("->");
			System.out.printf("%3d|", pc);
			for (int k = 0; k < n; k++)
				System.out.printf("%4d", a[k]);
			System.out.println("\n   |");

			if (a[pc] == key)
				return pc; // �˻�����
			else if (a[pc] < key)
				pl = pc + 1; // �˻������� ���� �������� ����
			else
				pr = pc - 1; // �˻������� ���� �������� ����
		} while (pl <= pr);
		return -1; // �˻�����
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("��Ҽ�");
		int num = sc.nextInt();
		int X[] = new int[num];

		System.out.println("ù ��� �� �Է� ");
		X[0] = sc.nextInt();
		for (int i = 1; i < num; i++) {
			X[i] = sc.nextInt();

		}
		System.out.println("�˻��Ұ�");
		int key = sc.nextInt();

		int idx = seqSearch(X, num, key);

		if (idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(key + "�� x[" + idx + "]�� �ֽ��ϴ�.");

	}

}
