package baekjoon;

public class baekjoon2438 {

	static void star(int a) {
		
		for( int i=0;i<a;i++) {
			for(int j=0;j<=i;j++) {
		
			System.out.print("*");
		
			}
			System.out.println();
			}
	}
	
	
	public static void main(String[] args) {

		star(5);
		
	}

}
