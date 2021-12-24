package Algorithm;

import Algorithm.IntStack.OverflowIntStackException;

public class stkmethod {
	private int max;			// ���� �뷮
	private int ptr;			// ���� ������
	private int[] stk;			// ���� ��ü
	
	public stkmethod(int capcity) {
		ptr =0;
		max=capcity;
		stk=new int[capcity];
		
	 }
	
	
	// ���� �� ���� : ������ ��� ����
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() { }
	}

	// ���� �� ���� : ������ ���� ��
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() { }
	}
	//�����͸� �Է� 
	public int push(int x){
		if(ptr>=max) 
			throw new  OverflowIntStackException();
		return stk[ptr++]= x;
	}
	//�����͸� ��� 
	public int pop() {
		if(ptr<=0)
			throw new EmptyIntStackException();
		return stk[--ptr];
	}
	
	public int peek() {
		if(ptr<=0)
			throw new EmptyIntStackException();
		return stk[ptr-1];
	}
	
	
	
	// ������ �뷮�� ��ȯ
		public int capacity() {
			return max;
		}

		// ���ÿ� �׿� �ִ� ������ ���� ��ȯ
		public int size() {
			return ptr;
		}
		public void dump() {
			if(ptr<=0)
				System.out.println("�̽����� ����ֽ��ϴ�.");
		for(int i =0;i<ptr;i++)
			System.out.println(stk[i]);
		}
		public void clear() {
			ptr = 0;			
		}
		public int indexOf(int x) {
			for(int i =ptr-1;i>=0;i--) 
				if (stk[i] == x)
					return i;								// �˻� ����
			return -1;
		}



}
