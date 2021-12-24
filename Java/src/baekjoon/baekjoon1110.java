package baekjoon;

import java.util.Scanner;

public class baekjoon1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); //입력값을 받음 
		int save = a; // a로 나누고 담으면 메모리 초과가 뜸 그래서 만듬 
		int count = 0;

		while (true) {
			String b = "";
			b += save% 10; //String 클래스 +기능이 연산할때 문자열로 변환시켜 더하는 것 
			//빈문자열로 합치게 되면 정수가 문자열로 바뀌게됨 
			b += ((save /10) + (save % 10)) % 10;

			save = Integer.parseInt(b);
			count++;
			if (save == a) {
				System.out.println(count);
			   break;

			}
		}

	}

}
