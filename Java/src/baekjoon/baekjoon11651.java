package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class baekjoon11651 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());

		int arr[][] = new int[n][2];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][1] = Integer.parseInt(st.nextToken()); //처음을 두번째 배열로 제거
			arr[i][0] = Integer.parseInt(st.nextToken()); //두번째를 첫번째 배열로 입력
			
		}

		Arrays.sort(arr, new Comparator<int[]>() { //두번째 배열을 기준으로 정렬

			public int compare(int[] a, int[] b) {
				if (a[0] == b[0]) {

					return a[1] - b[1];
				} else {
					return a[0] - b[0];
				}
			}

		});

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(arr[i][1] + " " + arr[i][0]).append('\n');  //첫번째 출력 두번째 출력 
		}
		System.out.println(sb);

	}

}
