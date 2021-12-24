package Algorithm;

public class AlgQ202 {
	

	static int sumOf(int[] a) {
		int sum =0;
		for(int i=0;i<a.length;i++)
		sum+=a[i];
		
		return sum;
			
	}
	
	public static void main(String[] args) {
		
		int A[] = new int[4];
		for(int i=0;i<A.length;i++) {
			A[i]=i;
		}
		
		System.out.println(sumOf(A));
		
	}

}
