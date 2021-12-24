import java.util.Scanner;

public class codeuo1080 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long a = scan.nextLong();

		int sum = 0;
		int i = 0;
		for (i = 0; i < 1000; i++) {
			sum += i;

			if (sum >= a) {
				break;
			}

		}
		System.out.println(i);

	}

}
