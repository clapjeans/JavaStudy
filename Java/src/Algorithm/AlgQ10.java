package Algorithm;

import java.util.Scanner;

public class AlgQ10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a�� ��  ");
		int a = sc.nextInt();
		System.out.print("b�� ��   ");
		int b = sc.nextInt();
		
		while(a>b) {
		System.out.println("a���� ū���� �Է��ϼ���");
		System.out.print("b�� �� ");
		b=sc.nextInt();
		}
		
		System.out.println("b-a�� "+(b-a));
		
		
	}

}
