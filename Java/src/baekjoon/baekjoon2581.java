package baekjoon;

import java.util.Scanner;

public class baekjoon2581 {

	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int sum = 0;
		    int sosuMin = 0;
		    int min = sc.nextInt();
		    int max = sc.nextInt();
		    
		    boolean[] sosus = sosus(min, max);
		    for (int i = 0; i < sosus.length; i++) {
		      if (sosus[i] == false) {
		        if (sosuMin == 0) {
		          sosuMin = i + min;
		        }
		        sum += i + min;
		      }
		    }
		    
		    if (sum == 0) {
		      System.out.println(-1);
		    } else {
		      System.out.println(sum);
		      System.out.println(sosuMin);
		    }
		  }
		  
		  static boolean[] sosus(int min, int max) {
		    boolean[] whole = new boolean[max - min + 1];
		    if (min == 1) {
		      whole[0] = true;
		    }
		    for (int i = 2; i <= max; i++) {
		      for (int j = 2; j <= max / 2 ; j++) {
		        if (i * j > max) {
		          break;
		        }
		        if (i * j >= min) {
		          whole[i * j - min] = true; 
		        }
		      }
		    }
		    return whole;
		  }
		}