package baekjoon;

import java.util.Scanner;

public class baekjoon2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sugar = sc.nextInt();
		int count = 0;
		while (true) {
			if (sugar % 5 == 0) {
				count += sugar / 5; //5로 나눠지면 5의 몫을더함
				System.out.println(count);
				break;
			} else {
				sugar -= 3; //5의 배수가 될때까지 3을 빼줌
				count++; //빼줄때마다 +1씩함 
				
				}

			if (sugar==1||sugar==2) { //sugar 1또는 2 애매하게 남았을때는 -1을 반환함 
				System.out.printf("-1");
				break;
			}

		}
	}
}
