package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon1011 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // ������ �������� ����
		int hap[] = new int[3];
		hap[0] = -1;
		int n = Integer.parseInt(st.nextToken());
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int distance =b-a;
			
			int max = (int)Math.sqrt(distance); //distance��Ʈ���� ��ȯ distance 9�̸� 3�� ��ȯ
			System.out.println(max);
		



		}
	}

}
