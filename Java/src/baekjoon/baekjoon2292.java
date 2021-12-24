package baekjoon;

import java.util.Scanner;

public class baekjoon2292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 1;
		int range = 1;
		int up = 1;
		while (range < n) {
			answer++;
			range += 6 * up;

			up++;
			
		}
		System.out.println(answer);
	
	}
	}

