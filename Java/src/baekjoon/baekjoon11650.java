package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class baekjoon11650 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
			
		int arr[][]=new int [n][2];	
				
		for(int i =0;i<n;i++) {
			st=new StringTokenizer(br.readLine());
			arr [i][0]=Integer.parseInt(st.nextToken());
			arr [i][1]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			
			public int compare(int[]a,int[]b) {
				if(a[0]==b[0]) {
				//	System.out.println(a[1]); 배열의 두번째 자리를 땡겨옴 
				//	System.out.println(b[1]);
					return a[1]-b[1];
				}else {
					return a[0]-b[0];
				}
			}
			
			
		});
		
		
		
		for(int i =0;i<n;i++) {
			System.out.println(arr[i][0]+" "+arr[i][1]);
		}
		//StringBuilder sb = new StringBuilder();
	//	for(int i =0;i<n;i++) {
		//	sb.append(arr[i][0]+" "+ arr[i][1]).append('\n');
	//	}
		//System.out.println(sb);

	}

} //String빌더가 코드는 더 길지만 실행속도는 훨씬 빠르다.
