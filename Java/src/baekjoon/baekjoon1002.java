package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon1002 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());

		while (n > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());

			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			double d = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));

			if (d == 0 && r1 == r2) {
				System.out.println(-1);
			} else if (d > r1 + r2 || d < Math.abs(r1 - r2)) {
				System.out.println(0);
			} else if (r1 + r2 == d || Math.abs(r1 - r2) == d) {
				System.out.println(1);
			} else {
				System.out.println(2);
			}

			n--;

		}

	}

}
