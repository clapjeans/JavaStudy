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
	
	System.out.println("��� ��");
	
	int num = sc.nextInt();
	
	int []x=new int [num];
	
	for( int i=0;i<num;i++) {
		System.out.println("x["+i+"]");
		x[i]=sc.nextInt();
	}
	System.out.println("�˻��Ұ�");
	int ky =sc.nextInt();
	
	int i=seqSearch(num,x,ky);
	
	if(i== -1) {
		System.out.println("�˻��� ���� ã�� ���Ͽ����ϴ�.");
	}else {
		System.out.println("x["+i+"]���ֽ��ϴ�.");
	}
	
	}

}
