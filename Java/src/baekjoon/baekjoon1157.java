package baekjoon;

import java.util.Scanner;

public class baekjoon1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int max = 0;
		int num = 0;
		int cnt = 0;
		int en[] = new int[26]; //담을 영어 

		str = str.toUpperCase(); //받은 단어를 다 대문자로 
		for (int i = 0; i < str.length(); i++) {
			en[str.charAt(i) - 'A']++; //에비씨디 순서에 맞게 숫자를 저장 
		}
		for (int i = 0; i < en.length; i++) {
			if (en[i] > max) {
				max = en[i]; //맥스값보다 큰 값을 max에 저장 
				num = i; //몇번째에 있는지 영어 변수저장 
			}
		}

		for (int i = 0; i < en.length; i++) {

			if (en[i] == max) {
				cnt++; //맥스와 같은 숫자가 있는지 횟수저장 
			}
		}

		if (cnt > 1) {
			System.out.println("?"); //1개이상의 같은 수가 있으면 ?출력
		}

		else {
			System.out.println((char) (num + 65)); //아스키 코드를 활용해서 출력 A는 65이다 
	}
}
}
