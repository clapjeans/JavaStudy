package baekjoon;

import java.util.Scanner;

public class baekjoon2775 {

	public static void main(String[] args) {
		
		int [][] apart = new int [15][15];  // 15�� 15ȣ���� ����� 2�����迭 ���
		
		for (int i=1; i<apart.length; i++) { //0�� �ֹε� �����ϱ�.
			apart[0][i]=i;
		} 
		
		for (int i=1; i<apart.length; i++) {      //1�� 1ȣ������ ������ ���� �����ϱ�.
			int nesting =0;
			for (int j=1; j<apart[i].length; j++) {	
				apart[i][j]=apart[i-1][j]+ nesting;
				nesting= apart[i][j]; 
				}
		}
		
		Scanner sc = new Scanner(System.in);
		
		// ����� ������ �迭�� ����ϱ�.
		int test = sc.nextInt();
		for (int i=0; i<test; i++) {
			int floor =sc.nextInt();  //�� 
			int arc = sc.nextInt();   //ȣ
			System.out.println(apart[floor][arc]);      // ���� ��ȣ�� ����Ұ���..
		}
	}
}
