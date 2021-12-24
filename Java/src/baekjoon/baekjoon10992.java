package baekjoon;

import java.util.Scanner;

public class baekjoon10992 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) { 
			for (int j = 1; j <= n - i; j++) { 
				System.out.print(" ");
			}
			if (i == n)
				for (int j = 1; j <= (i - 1) * 2 + 1; j++) // (i-1)*2+1개의 '*'를 나타냄
					System.out.print("*");
			else {
				for (int j = 1; j <= (i - 1) * 2 + 1; j++) // (i-1)*2+1개의 '*'를 나타냄

					if (j == 1 || j == (i - 1) * 2 + 1) {
						System.out.print('*');
					} else {
						System.out.print(" ");
					}
			}
			System.out.println(); // 개행(줄변환)
		}
	}
}