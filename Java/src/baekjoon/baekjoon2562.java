package baekjoon;

import java.util.Scanner;

public class baekjoon2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int index = 0;
		int a[] = new int[9];

		for (int j = 0; j < 9; j++) {
			a[j] = sc.nextInt();
		}
		int b = a[0];
		for (int i = 1; i < 9; i++) {
			if (b < a[i]) {
				b = a[i];
				index=i;
			}
		}
		System.out.println(b);
		System.out.println(index+1);
	}

}
