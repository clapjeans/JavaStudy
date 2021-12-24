package Algorithm;

import java.util.Scanner;

public class AlgQ10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a의 값  ");
		int a = sc.nextInt();
		System.out.print("b의 값   ");
		int b = sc.nextInt();
		
		while(a>b) {
		System.out.println("a보다 큰값을 입력하세요");
		System.out.print("b의 값 ");
		b=sc.nextInt();
		}
		
		System.out.println("b-a는 "+(b-a));
		
		
	}

}
