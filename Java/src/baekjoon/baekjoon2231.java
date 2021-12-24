package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon2231 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int result =0; // �����
		
		// N= 555 �� ���, i�� 1���� 555���� �ݺ���
		for(int i=1; i<N; i++){
			int num = i; // 1���� 555������ ����
			int sumNum = i; // ������ 
			
			// i = 543�� ��
			while(num != 0) {
				sumNum += num%10;
				// 543 + 543%10(= 3) -> 543 + 543%10(= 3) + 54%10(= 4) + 543 +...+ 5%10(= 5)
				
				num = num/10; 
				// num = 543/10(= 54) -> 54/10(= 5)
			}	
			if(sumNum == N) { //543 + 3 + 4 + 5 = 555
				result = i; // result = i(543)
				break;
			}
		}
		System.out.println(result);
	}
}
