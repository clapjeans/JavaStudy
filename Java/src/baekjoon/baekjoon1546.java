package baekjoon;

import java.util.Scanner;

public class baekjoon1546 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		int n = sc.nextInt();
		float a[]=new float[n];
		float sum=0;
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		
		}
		float Max=a[0];
		for(int i=1;i<a.length;i++) {
			if(Max<a[i]) {
				Max=a[i];
			}
		
		}
		for(int i=0;i<a.length;i++) {
			sum+=(a[i]/Max)*100;
		}
		System.out.print(sum/n);
	
		
		
	}

}
