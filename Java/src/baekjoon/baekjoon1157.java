package baekjoon;

import java.util.Scanner;

public class baekjoon1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int max = 0;
		int num = 0;
		int cnt = 0;
		int en[] = new int[26]; //���� ���� 

		str = str.toUpperCase(); //���� �ܾ �� �빮�ڷ� 
		for (int i = 0; i < str.length(); i++) {
			en[str.charAt(i) - 'A']++; //���񾾵� ������ �°� ���ڸ� ���� 
		}
		for (int i = 0; i < en.length; i++) {
			if (en[i] > max) {
				max = en[i]; //�ƽ������� ū ���� max�� ���� 
				num = i; //���°�� �ִ��� ���� �������� 
			}
		}

		for (int i = 0; i < en.length; i++) {

			if (en[i] == max) {
				cnt++; //�ƽ��� ���� ���ڰ� �ִ��� Ƚ������ 
			}
		}

		if (cnt > 1) {
			System.out.println("?"); //1���̻��� ���� ���� ������ ?���
		}

		else {
			System.out.println((char) (num + 65)); //�ƽ�Ű �ڵ带 Ȱ���ؼ� ��� A�� 65�̴� 
	}
}
}
