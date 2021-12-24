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
			A+=num1%10; //String에 숫자를 바로 더할 수 있다는 점 
			B+=num2%10;
			num1/=10;
			num2/=10;
		}
		System.out.println(Integer.parseInt(A)>Integer.parseInt(B)?A:B);
	//Integer.valueOf를 쓰면 오류남 왜그런지 알아보기
	}

}
