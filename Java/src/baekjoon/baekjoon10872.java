package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class baekjoon10872 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[] = new int[21];
		int n = sc.nextInt();
		int sum = 0;
		arr[0] = 0;
		arr[1] = 1;
		if (n >= 2) {
			for (int i = 2; i <= n; i++) {
				arr[i] = (arr[i - 1]) + (arr[i - 2]);
			}

		}
		System.out.println(arr[n]);
	}

}
