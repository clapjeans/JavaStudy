package baekjoon;

import java.util.Scanner;

public class baekjoon1193 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = 1;
		int count_sum = 0;
		int n = sc.nextInt();
		while (true) {
			if (n <= count_sum + count) {
				if (count % 2 == 1) {
					System.out.print((count - (n - count_sum - 1) + "/" + (n - count_sum)));
					break;
				} else {
					System.out.print((n - count_sum) + "/" + (count - (n - count_sum - 1)));
					break;
				}
			}else {
				count_sum+=count;
				count++;
			}

		}

	}

}
