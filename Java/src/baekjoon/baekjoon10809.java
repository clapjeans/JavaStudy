package baekjoon;

import java.util.Scanner;

public class baekjoon10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String leg = sc.next();
		int a[] = new int[26];
		for (int i = 0; i < a.length; i++) {
			a[i] = -1;
		}
		for (int i = 0; i < leg.length(); i++) {
			if (a[leg.charAt(i) - 'a']  == -1) {
				a[leg.charAt(i) - 'a'] = i;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
