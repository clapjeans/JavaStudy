package baekjoon;

import java.util.Scanner;

public class baekjoon10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int b = a[0];
		int c = a[0];
		for (int i = 1; i < n; i++) {
			if (b < a[i]) {
				b = a[i];}
				
			if (c > a[i]) {
					c = a[i];
				}
			
		}
		System.out.println(c + " " + b);
	}

}
