package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
처음에는 리스트의 값 중 하나를 선택해 나머지 값들을 이분탐색으로 탐색해 작은 값을 구하는 방식을 택했지만 시간초과
다른 방식인 투 포인터 방식으로 문제를 풀었다.
맨 왼쪽과 오른쪽에서 시작해 두 값의 차이가 0보다 크면 right를 줄이고 반대면 left를 늘린다
그 사이 두 값의 차이를 더 작은 값으로 갱신하면서 num1 값과 num2 값을 갱신한다
 */

public class baekjoon2467 {

    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }

        int min = Integer.MAX_VALUE;//두 수의 차이 중 가장 작은 값을 담는 정수

        //투 포인터 알고리즘으로 진행하기 때문에 left와 right 변수 선언
        int left = 0;
        int right = list.size() - 1;

        //가장 작은 차이를 가진 두 값을 담기 위해 선언
        int num1 = 0;
        int num2 = 0;
        while(left < right){//서로 같은 위치거나 left가 right보다 오른쪽이면 탈출
            int result = list.get(left) + list.get(right);//두 용액간의 차
            if(result == 0){//차이가 없을 경우 리스트이 값을 담고 반복문 탈출
                num1 = list.get(left);
                num2 = list.get(right);
                break;
            }

            if(min > Math.abs(result)){//두 값의 차이가 min보다 작으면 갱신
                min = Math.abs(result);
                //num1과 num2 갱신
                num1 = list.get(left);
                num2 = list.get(right);
            }

            if(result > 0){//두 차이가 0보다 크면 right를 줄인다
                right--;
            }else{//두 차이가 0보다 작으면 left를 늘린다
                left++;
            }
        }

        System.out.println(num1 + " " + num2);
    }
}
