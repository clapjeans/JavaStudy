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
						System.out.println(i); //�ڱ��ڽŰ� �������� �Ҽ� i�����
						n /= i; //n�� �ٽ� ���� 
						break; //n�� 1���� �����ϱ�����while���� �ٽý��� 
					}
				}
			}
		}
	}
}
