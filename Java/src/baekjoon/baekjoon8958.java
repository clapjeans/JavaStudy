package baekjoon;

import java.util.Scanner;

public class baekjoon8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String score = sc.next();
			sum=0;
			count=0;
			for (int j = 0; j < score.length(); j++) {
				if (score.charAt(j) == 'O') {
					sum+=++count;
					
				}else if(score.charAt(j)=='X') {
			     count=0;
				}
				
		}
	    	System.out.println(sum);

		}
	}

}
