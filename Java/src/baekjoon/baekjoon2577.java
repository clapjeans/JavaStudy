package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class baekjoon2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int []A= {0,0,0,0,0,0,0,0,0,0};
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		String d = String.valueOf(a*b*c);
		for(int i=0;i<d.length();i++) {
			if(d.charAt(i)=='0') {
				A[0]+=1;
			}
			if(d.charAt(i)=='1') {
				A[1]+=1;
			}			
			if(d.charAt(i)=='2') {
				A[2]+=1;
			}

			if(d.charAt(i)=='3') {
				A[3]+=1;
			}
			if(d.charAt(i)=='4') {
				A[4]+=1;
			}
			if(d.charAt(i)=='5') {
				A[5]+=1;
			}
			if(d.charAt(i)=='6') {
				A[6]+=1;
			}
			if(d.charAt(i)=='7') {
				A[7]+=1;
			}
			if(d.charAt(i)=='8') {
				A[8]+=1;
			}
			if(d.charAt(i)=='9') {
				A[9]+=1;
			}
		}
		for(int i=0;i<A.length;i++) {
			System.out.println(A[i]);
		}
	}

}
