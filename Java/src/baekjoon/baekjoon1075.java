package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon1075 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int f = Integer.parseInt(br.readLine());

		int div = (n / 00) * 100; //뒤자리를 초기화 00으로 맞춤

		while (true) {
			if (div % f == 0) { //div가 f로 나눠진다면
				int result = div % 100; //나누고나서 나온 나머지를 담음
				if (result < 10) { //두자리수보다 작다면 
					System.out.println("0" + result); //앞에 0과함께 출력
				} else {
					System.out.println(result); //아니라면 그냥출력
				}
				return;
			}
			div++; //나눠질때까지 div 일의자리씩 늘림 

		}

	}

}
