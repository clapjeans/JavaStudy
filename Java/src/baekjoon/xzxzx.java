package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class xzxzx {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int min = Integer.parseInt(br.readLine());
		int max = Integer.parseInt(br.readLine());
		int  sum = 0;
		ArrayList<Integer> arr = new ArrayList<>();
		abc: for (int i = min; i <= max; i++) {
			for (int j = 2; j < (int) Math.sqrt((double) i) + 1; j++) { //Math.sqrt() 메소드는 입력값과 출력값은 모두 double형
				if (i % j == 0) {
					continue abc;

				}
			}
			arr.add(i);
			sum += i;
		}


		if (sum == 0) {
			System.out.println(-1);
		} else {
			min = arr.get(0);
			for (int k = 1; k < arr.size(); k++) {
				if (min > arr.get(k)) {
					min = arr.get(k);
				}
			}
			System.out.println(sum);
			System.out.println(min);
		}

	}

}
