package Algorithm;

import java.util.Scanner;

public class Alg202 {

	
	static int maxOf(int []a) {
		int max = a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)
				a[i]=max;
		}
		
		return max;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num=sc.nextInt();
		
		int []height = new int [num];
		
		for(int i=0;i<num;i++) {
			System.out.print("height["+i+"]:");
			height[i]=sc.nextInt();
		}
		System.out.println("최대값은 "+maxOf(height)+"입니다.");
		
	}

}
