package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class baekjoon7568 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());

		int w[] = new int[n];
		int h[] = new int[n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			w[i] = Integer.parseInt(st.nextToken());
			h[i] = Integer.parseInt(st.nextToken());

		}
		int count;
		int rank[] = new int[n];
		for (int i = 0; i < n; i++) {
			count = 1;
			for (int j =0; j < n; j++) {
				if (w[i] < w[j] && h[i] < h[j]) {
					count++;
				}
					rank[i] = count;
				
			}
		}

		int i = 0;
		while (i < n) {
			System.out.println(rank[i]);
			i++;
		}

	}

}
