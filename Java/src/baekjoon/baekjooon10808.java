package baekjoon;

import java.util.Scanner;

public class baekjooon10808 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String leg=sc.next();
		int a [] = new int [27];
		
		for(int i =0;i<leg.length();i++) {
			a[leg.charAt(i)-'a']++;
		}
		for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
		}
		
	}

}
