package Algorithm;

import java.util.Scanner;

public class Alg106 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		
		do {
			System.out.print("n�� �� :");
			n=sc.nextInt();
		}while(n<=0);
		
		int sum=0;
		for(int i=1;i<=n;i++)
			sum +=i;
	
		System.out.println("1���� "+n+"������ ���� "+sum +"�Դϴ�.");
	}

}
