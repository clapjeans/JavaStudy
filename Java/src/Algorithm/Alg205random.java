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
			height[i]=100+rand.nextInt(90); //��Ұ��� ������ ���� nextInt(n)�� 0����n-1�� ������ �����ȴ�. 
		}
		System.out.println("�ִ밪�� "+maxOf(height)+"�Դϴ�.");
		
	}

}
