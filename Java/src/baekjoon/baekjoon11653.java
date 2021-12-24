package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon11653 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		while(true) {
			if(n == 1) {
				return;
			}
			else {
				for(int i = 2; i<=n; i++) {
					if(n%i == 0) {
						System.out.println(i); //자기자신과 나눠지는 소수 i를출력
						n /= i; //n을 다시 갱신 
						break; //n이 1인지 구분하기위해while문을 다시실행 
					}
				}
			}
		}
	}
}
