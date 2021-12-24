package baekjoon;

import java.util.Scanner;

public class baekjoon5622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String  a = sc.next();
		
		String b[]=a.split("");
		int count=0;
		for(int i=0;i<b.length;i++) {
			if(b[i].equals("A")||b[i].equals("B")||b[i].equals("C"))
				count+=3;
			if(b[i].equals("D")||b[i].equals("E")||b[i].equals("F"))
				count+=4;
			if(b[i].equals("G")||b[i].equals("H")||b[i].equals("I"))
				count+=5;
			if(b[i].equals("J")||b[i].equals("K")||b[i].equals("L"))
				count+=6;
			if(b[i].equals("M")||b[i].equals("N")||b[i].equals("O"))
				count+=7;
			if(b[i].equals("P")||b[i].equals("Q")||b[i].equals("R")||b[i].equals("s"))
				count+=8;
			if(b[i].equals("T")||b[i].equals("U")||b[i].equals("V"))
				count+=9;
			if(b[i].equals("W")||b[i].equals("X")||b[i].equals("Y")||b[i].equals("Z"))
				count+=10;
		}
		System.out.println(count);
		
		
	}
}