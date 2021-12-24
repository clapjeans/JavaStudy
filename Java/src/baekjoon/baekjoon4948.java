package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon4948 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) {
				break;
			} else {
				int count = 0;
					a: for (int i = n + 1; i <= 2 * n; i++) {
				        if(i!=1) {                            
			                if(i==2) {
			                    count++;
							} else {

								for (int j = 2; j < Math.sqrt(i) + 1; j++) {
									if (i % j == 0) {
										continue a;
									}
								}
								count++;
							}
						}
					}
			
				System.out.println(count);
				}
			}
		}
	}

