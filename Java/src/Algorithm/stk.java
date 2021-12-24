package Algorithm;

import java.util.Scanner;

public class stk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		stkmethod s = new stkmethod(30);

		while (true) {
			System.out.println("현재데이터수" + s.capacity() + s.size());

			System.out.print("(1)푸시 (2)팝 (3)피크 (4)덤프 (5)검색 (6)비움  (0)종료：");

			int menu = sc.nextInt();
			if (menu == 0)
				break;
			int x;
			switch(menu) {
			case 1:
				System.out.print("데이터：");
				x = sc.nextInt();
				try {
					s.push(x);
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;
			case 2:
				try {
					x=s.pop();
					System.out.println("pop한데이터는"+x+"입니다.");
				}catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비었습니다.");
				}
				break;

			case 3:
				try {
					x=s.peek();
				System.out.println("꼭대기 값은"+x+"입니다.");
				}catch(IntStack.EmptyIntStackException e) { 
				System.out.println("스택이 비어있습니다");
			}
			case 4:
				s.dump();
				break;
			case 5:
				System.out.print("찾는 데이터：");
				x = sc.nextInt();
				int n = s.indexOf(x);
				if (n >= 0)
					System.out.println("꼭대기부터 " + (s.size() - n) + "번 째에 있습니다.");
				else
					System.out.println("그 데이터가 없습니다.");
				break;
				
			case 6 :
				s.clear();
				break;
			}
		}

	}
}
