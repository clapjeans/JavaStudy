package Algorithm;

import java.util.Scanner;

public class Q116 {

	static void spria(int n) {
		for (int i = 0; i <n; i++) { // i행 (i = 1, 2, … ,n)
			// n-i+1개의 ' '를 나타냄
			for(int j=0;j<n+i;j++) {
				if(i+j>n/2+1) {
				System.out.print("*");
				}else {
				System.out.print(" ");
				}
		}
			System.out.println(); // 개행(줄변환)
		}
	
		
		
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("피라미드메서드 단 :");
		spria(sc.nextInt());
	}

}
