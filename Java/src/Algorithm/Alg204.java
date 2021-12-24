package Algorithm;

public class Alg204 {

	static void copy(int a[],int b []) {
		for(int i=0;i<a.length;i++) {
			a[i]=b[b.length-i-1]; //배열 a 값에 배열 b값을 대입  b값에 a열대입이아님
			System.out.println(a[i]); //b를 역순으로 대입하는 방법 
		}
	
	}
	
	
	
	public static void main(String[] args) {

		int a[]=new int [3];
		for(int i=0;i<a.length;i++) {
			a[i]=i;
			System.out.println(a[i]);
		}
		int b[]=new int[3];
		
		copy(a,b);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(b[i]);
		}
		
	}

}
