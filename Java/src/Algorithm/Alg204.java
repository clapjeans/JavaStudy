package Algorithm;

public class Alg204 {

	static void copy(int a[],int b []) {
		for(int i=0;i<a.length;i++) {
			a[i]=b[b.length-i-1]; //�迭 a ���� �迭 b���� ����  b���� a�������̾ƴ�
			System.out.println(a[i]); //b�� �������� �����ϴ� ��� 
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
