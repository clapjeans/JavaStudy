package baekjoon;

public class programers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   

		abc : for (int i = 2; i <=10; i++) {
          int root = (int)Math.sqrt((double) i);
			for (int j = 2; j < root+1; j++) {

				if (i % j == 0) {
					
					continue abc;
				}

			
			}
	
		}

	
	}
}