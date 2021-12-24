package Algorithm;

import java.util.Scanner;

public class AlgQ206 {

	static int cardConv(int x,int r ,char [] d) {
		int digits = 0;// 변환 뒤의 자릿수
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
			d[digits++] = dchar.charAt(x % r); // r로 나눈 나머지를 저장
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
		System.out.println("10진수 기수로 변환합니다. ");
		do {
		
		do {
			System.out.print("음이아닌 정수");
			 a = sc.nextInt();
		}while(a<0);
		
		do {
			System.out.print("어떤진수로 변환할까요");
			b = sc.nextInt();
		}while(a<2||a>36);
		
		dno=cardConv(a,b,div);
		
		for(int i =0;i<dno;i++) {
			System.out.print(div[i]);
			System.out.println("입니다.");
		}
		
		System.out.println("한번 더할까요 (1,예. 2, 아니요");
		 retry =sc.nextInt();
		
		}while(retry==1);
		
	}

}
