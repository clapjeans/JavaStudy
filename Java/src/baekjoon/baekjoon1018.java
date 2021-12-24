package baekjoon;

import java.util.Scanner;

public class baekjoon1018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int count =0;
		String board[][] = new String[w][h];
		for (int i = 0; i < w; i++) {
			for (int j = 0; j < h; j++) {
				board[i][j] = sc.next();
			}
		}
		for (int i = 0; i < w; i++) {
		for (int j = 0; j < h; j++) {
			if (i % 2 == 0) {
				board[i][w].compareTo("B");
				count++;
				if (w % 2 == 0) {
				}
			} else {

			}

		}

	}
}
}