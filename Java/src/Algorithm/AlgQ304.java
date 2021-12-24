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

		int pl = 0; // 검색범위 맨 앞의 index
		int pr = n - 1; // 검색범위 맨 뒤의 index

		do {
			int pc = (pl + pr) / 2; // 중앙요소의 index

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
				return pc; // 검색성공
			else if (a[pc] < key)
				pl = pc + 1; // 검색범위를 뒤쪽 절반으로 좁힘
			else
				pr = pc - 1; // 검색범위를 앞쪽 절반으로 좁힘
		} while (pl <= pr);
		return -1; // 검색실패
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("요소수");
		int num = sc.nextInt();
		int X[] = new int[num];

		System.out.println("첫 요소 수 입력 ");
		X[0] = sc.nextInt();
		for (int i = 1; i < num; i++) {
			X[i] = sc.nextInt();

		}
		System.out.println("검색할값");
		int key = sc.nextInt();

		int idx = seqSearch(X, num, key);

		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(key + "은 x[" + idx + "]에 있습니다.");

	}

}
