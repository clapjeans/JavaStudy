package baekjoon;

import java.util.Scanner;

public class baekjoon2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		String A="";
		String B="";
		while(num1>0&&num2>0) {
			A+=num1%10; //String�� ���ڸ� �ٷ� ���� �� �ִٴ� �� 
			B+=num2%10;
			num1/=10;
			num2/=10;
		}
		System.out.println(Integer.parseInt(A)>Integer.parseInt(B)?A:B);
	//Integer.valueOf�� ���� ������ �ֱ׷��� �˾ƺ���
	}

}
