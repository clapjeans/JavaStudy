package baekjoon;

import java.util.Scanner;

public class backjoon3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		int count = 0;
		int temp = 0;
		for (int i = 0; i < 10; i++) {
			a[i] = (sc.nextInt() % 42);
		}

		for (int i = 0; i < a.length; i++) {
			temp=0; // i번째 비교끝나후 다시 리셋 안해주면 값을 저장한채로 계속 돔
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					temp++; //1회전끝난후 temp는 0이 아닌상태이기때문에 서로다른지 체크값이 안됨 
				}
			}
			if (temp == 0) {
				count++;
			}
		}

		System.out.println(count);
	}
}