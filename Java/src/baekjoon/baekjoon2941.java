package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		String croatia[] = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		for (int i = 0; i < croatia.length; i++) {

			if (str.contains(croatia[i])) {

				str = str.replaceAll(croatia[i], "*");
			}
		}
		System.out.println(str.length());

		String str1 = "abcdefg";

		System.out.printf(str1.replace("a", "��").replace("b", "�Ӹ�").replace("c", "�����ϱ�Ⱦ�"));
		System.out.println(str1.replaceAll("abc", "���Ӹ� �����ϱ�Ⱦ�"));
	}

}
