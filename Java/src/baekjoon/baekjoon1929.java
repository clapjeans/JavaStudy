package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon1929 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 공백을 기준으로 나눔

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		abc: for (int i = a; i <= b; i++) {
			for (int j = 2; j < (int) Math.sqrt(i) + 1; j++) {
				if (i % j == 0) {
					continue abc;
				}
			}
			System.out.println(i);
		}
	}
}
