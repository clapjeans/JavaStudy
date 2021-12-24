package baekjoon;

import java.util.Scanner;

public class baekjoon15596 {

	static int sum(int[] a) {
		int ans = 0;

		for (int i = 0; i < a.length; i++) {
			ans += a[i];
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int A[] = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		System.out.println(sum(A));
	}

}