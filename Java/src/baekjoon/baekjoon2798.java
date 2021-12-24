package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class baekjoon2798 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n = Integer.parseInt(st.nextToken());
		int max = Integer.parseInt(st.nextToken());
		int card[] = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		for (int j = 0; j < card.length-2; j++) {
			for (int k = j+ 1; k < card.length-1; k++) {
				for(int i=k+1;i<card.length;i++) {	
					int sum = card[j] + card[k]+card[i];
					if (sum <= max) {
						list.add(sum);
					}
				}
			}
		}
		Collections.sort(list);
		System.out.println(list.get(list.size() - 1));

	}
}