package baekjoon;

import java.util.Scanner;

public class baekjoon11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int number = sc.nextInt();
		int sum = 0;
		while(number>0) {
			sum += number % 10;
			number/=10;
		}
			System.out.println(sum);
		}

	}
