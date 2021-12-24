package baekjoon;

import java.util.Scanner;

public class baekjoon2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			String word = sc.next();
			for (int j = 0; j < word.length(); j++) {
				for (int k = 0; k < num; k++) {
					System.out.print(word.charAt(j));
				}
			}
			System.out.println();
		}

	}


}