package baekjoon;

import java.util.Scanner;

public class baekjoon10871 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();

		
		int z[] = new int[a];
		
		for(int i=0;i<z.length;i++) {
			z[i]=sc.nextInt();
		}

		for(int i=0;i<z.length;i++) {
			if(z[i]<b) {
				System.out.print(z[i]+" ");
			}
		}
		// for( int i=0;i<a;i++){
		// int A = sc.nextint();
		//if(A<b) syso(A+" ") 숏 코딩하는법 
		
		
		
	}

}
