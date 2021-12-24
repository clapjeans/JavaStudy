package baekjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class baekjoon1181 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String arr[] = new String[n];
		for (int i = 0; i < 13; i++) {
			arr[i] = sc.next();
		}
		Arrays.sort(arr, new Comparator<String>() {

			@Override

			public int compare(String o1, String o2) {

				if (o1.length() == o2.length()) {

					return o1.compareTo(o2);

				} else {

					return o1.length() - o2.length();

				}

			}

		});

		for (int i = 0; i < n; i++) {

			if (i > 0 && arr[i].equals(arr[i - 1])) {
			}

			else
				System.out.println(arr[i]);

		} // end for

	}

}
