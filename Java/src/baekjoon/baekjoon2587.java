package baekjoon;

import java.util.Scanner;

public class baekjoo2587 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        while(A<100 || A>999 || B<100 || B>999){
            //System.out.println("A,B를 세자리 자연수(100 ~ 999 사이의 수)로 입력하세요.");
            A = sc.nextInt();
            B = sc.nextInt();
        }
        //B의 자리수별 숫자 구하기
        int B1 = B%10; //일의 자리
        int B2 = (B/10)%10; //십의 자리
        int B3 = (B/100)%10; //백의 자리
        
        //자리별 A와 곱 구하기
        int C1 = B1*A;
        int C2 = B2*A;
        int C3 = B3*A;
        
        //최종 A*B 구하기
        int C = A*B;
        
        System.out.println(C1);
        System.out.println(C2);
        System.out.println(C3);
        System.out.println(C);
    }
}
