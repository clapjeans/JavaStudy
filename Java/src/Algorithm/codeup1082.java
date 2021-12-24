import java.util.Scanner;

public class codeup1082 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

  int n =sc.nextInt(16);
  for (int i=0;i<16;i++) {
	  
	  System.out.printf("%x*%X=%X",n,i,(n*i));
	  
	  
  }


	}

}
