package baekjoon;

import java.util.Scanner;

public class baekjoon4673 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int sum=0;
		while(sum<10000) {
			sum+=Integer.valueOf(n);
					if(n.length()>1) {
					sum+=Integer.valueOf(n.charAt(0))+Integer.valueOf(n.charAt(1));
					}
					System.out.println(sum);
		}
		
		
	}

}
