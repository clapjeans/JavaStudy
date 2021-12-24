package Algorithm;

import java.util.Random;
import java.util.Scanner;

public class Alg205random {

	
	static int maxOf(int []a) {
		int max = a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)
				a[i]=max;
		}
		
		return max;
		
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int num=sc.nextInt();
		
		int []height = new int [num];
		
		for(int i=0;i<num;i++) {
			System.out.print("height["+i+"]:");
			height[i]=100+rand.nextInt(90); //요소값을 난수로 결정 nextInt(n)은 0부터n-1의 난수가 생성된다. 
		}
		System.out.println("최대값은 "+maxOf(height)+"입니다.");
		
	}

}
