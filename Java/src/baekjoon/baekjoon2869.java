package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class baekjoon2869 {

public static void main (String[] args) throws Exception {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); //������ �������� ���� 
        
		double up = Integer.parseInt(st.nextToken()); //string�� integer�� ��ȯ 
		double down = Integer.parseInt(st.nextToken());
		double height= Integer.parseInt(st.nextToken());
		int day =0;

		day = (int) Math.ceil((height-down) / (up-down)) ;
		System.out.println(day);
}}
