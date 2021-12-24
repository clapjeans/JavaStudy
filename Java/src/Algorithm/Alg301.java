package Algorithm;

import java.util.Scanner;

public class Alg301 {

	static int seqSearch(int a, int[]X, int key) {
		int i = 0;
		
		while(true) {
		if(i==a) {
			return -1;
		}
		if(X[i]==key) {
			return i;
		}
		i++;
		}
		}
	
	
	public static void main(String[] args) {

	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("요솟 수");
	
	int num = sc.nextInt();
	
	int []x=new int [num];
	
	for( int i=0;i<num;i++) {
		System.out.println("x["+i+"]");
		x[i]=sc.nextInt();
	}
	System.out.println("검색할값");
	int ky =sc.nextInt();
	
	int i=seqSearch(num,x,ky);
	
	if(i== -1) {
		System.out.println("검색할 값을 찾지 못하였습니다.");
	}else {
		System.out.println("x["+i+"]에있습니다.");
	}
	
	}

}
