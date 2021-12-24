package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class baekjoon11811 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n =Integer.parseInt(br.readLine());
		String arr[]=new String[n];
		for(int i =0;i<n;i++) {
			st=new StringTokenizer(br.readLine());
			
			arr[i]=String.valueOf(st.nextToken());
		}
		Arrays.sort(arr,new Comparator<String>(){
			
			public int compare(String a,String b) {
				if(a.length()==b.length()) {
					return a.compareTo(b); //중복일경우 0을 반환 
				}else {
					return a.length()-b.length();
				}
			}
		});
		StringBuilder sb = new StringBuilder();
		sb.append(arr[0]).append("\n");
		for(int i=1;i<arr.length;i++) {
			if(!arr[i].equals(arr[i-1])) {
				sb.append(arr[i]).append("\n");
			}
		}
		System.out.println(sb);
	}

}
