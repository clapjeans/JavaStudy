package Algorithm;

import java.util.Scanner;

public class stk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		stkmethod s = new stkmethod(30);

		while (true) {
			System.out.println("���絥���ͼ�" + s.capacity() + s.size());

			System.out.print("(1)Ǫ�� (2)�� (3)��ũ (4)���� (5)�˻� (6)���  (0)���᣺");

			int menu = sc.nextInt();
			if (menu == 0)
				break;
			int x;
			switch(menu) {
			case 1:
				System.out.print("�����ͣ�");
				x = sc.nextInt();
				try {
					s.push(x);
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("������ ���� á���ϴ�.");
				}
				break;
			case 2:
				try {
					x=s.pop();
					System.out.println("pop�ѵ����ʹ�"+x+"�Դϴ�.");
				}catch (IntStack.EmptyIntStackException e) {
					System.out.println("������ ������ϴ�.");
				}
				break;

			case 3:
				try {
					x=s.peek();
				System.out.println("����� ����"+x+"�Դϴ�.");
				}catch(IntStack.EmptyIntStackException e) { 
				System.out.println("������ ����ֽ��ϴ�");
			}
			case 4:
				s.dump();
				break;
			case 5:
				System.out.print("ã�� �����ͣ�");
				x = sc.nextInt();
				int n = s.indexOf(x);
				if (n >= 0)
					System.out.println("�������� " + (s.size() - n) + "�� °�� �ֽ��ϴ�.");
				else
					System.out.println("�� �����Ͱ� �����ϴ�.");
				break;
				
			case 6 :
				s.clear();
				break;
			}
		}

	}
}
