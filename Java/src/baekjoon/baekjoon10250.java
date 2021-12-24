package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon10250 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 공백을 기준으로 나눔

		int n = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < n; i++) {
			int num = 0;
			int room = 0;
			st=new StringTokenizer(br.readLine());
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int guest = Integer.parseInt(st.nextToken());

			if (w * h < guest) {
				break;
			} else {
				for (int k = 1; k <= w; k++) {
					for (int j = 1; j <= h; j++) {
						if (num == guest) {
							break;
						} else {
							room = (100 * j) + k;
							num++;
						}

					}

				}

			}
			System.out.println(room);
		}

	}

}
