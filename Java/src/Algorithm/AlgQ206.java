package Algorithm;

import java.util.Scanner;

public class AlgQ206 {

	static int cardConv(int x,int r ,char [] d) {
		int digits = 0;// ��ȯ ���� �ڸ���
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
			d[digits++] = dchar.charAt(x % r); // r�� ���� �������� ����
			x /= r;
		} while (x != 0);

		for (int i = 0; i < digits / 2; i++) { // d[0]~d[digits-1]
			char temp = d[i];
			d[i] = d[digits - i - 1];
			d[digits - i - 1] = temp;
		}
		return digits;
	
		
		
	}
	
	public static void main(String[] args) {
		int a,b,dno,retry;
		char [] div =new char[32];
		Scanner sc = new Scanner(System.in);
		System.out.println("10���� ����� ��ȯ�մϴ�. ");
		do {
		
		do {
			System.out.print("���̾ƴ� ����");
			 a = sc.nextInt();
		}while(a<0);
		
		do {
			System.out.print("������� ��ȯ�ұ��");
			b = sc.nextInt();
		}while(a<2||a>36);
		
		dno=cardConv(a,b,div);
		
		for(int i =0;i<dno;i++) {
			System.out.print(div[i]);
			System.out.println("�Դϴ�.");
		}
		
		System.out.println("�ѹ� ���ұ�� (1,��. 2, �ƴϿ�");
		 retry =sc.nextInt();
		
		}while(retry==1);
		
	}

}
