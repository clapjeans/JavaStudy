package Algorithm;

import java.util.Scanner;

public class Q116 {

	static void spria(int n) {
		for (int i = 0; i <n; i++) { // i�� (i = 1, 2, �� ,n)
			// n-i+1���� ' '�� ��Ÿ��
			for(int j=0;j<n+i;j++) {
				if(i+j>n/2+1) {
				System.out.print("*");
				}else {
				System.out.print(" ");
				}
		}
			System.out.println(); // ����(�ٺ�ȯ)
		}
	
		
		
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("�Ƕ�̵�޼��� �� :");
		spria(sc.nextInt());
	}

}
