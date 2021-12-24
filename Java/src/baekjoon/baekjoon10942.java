package baekjoon;

import java.util.Scanner;

public class baekjoon10942 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A,B;
		do {
		A = sc.nextInt();
		B = sc.nextInt();
		if(A+B>0)
		System.out.println(A+B);
		}while(A+B>0); 
		/*
		 * while(true) { int a= sc.nextInt(); int b= sc.nextInt(); if(a ==0 && b==0)
		 * break; System.out.println(a+b);
		 */
	}

}
