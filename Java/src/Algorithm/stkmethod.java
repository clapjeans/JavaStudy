package Algorithm;

import Algorithm.IntStack.OverflowIntStackException;

public class stkmethod {
	private int max;			// 스택 용량
	private int ptr;			// 스택 포인터
	private int[] stk;			// 스택 본체
	
	public stkmethod(int capcity) {
		ptr =0;
		max=capcity;
		stk=new int[capcity];
		
	 }
	
	
	// 실행 시 예외 : 스택이 비어 있음
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() { }
	}

	// 실행 시 예외 : 스택이 가득 참
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() { }
	}
	//데이터를 입력 
	public int push(int x){
		if(ptr>=max) 
			throw new  OverflowIntStackException();
		return stk[ptr++]= x;
	}
	//데이터를 출력 
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
	
	
	
	// 스택의 용량을 반환
		public int capacity() {
			return max;
		}

		// 스택에 쌓여 있는 데이터 수를 반환
		public int size() {
			return ptr;
		}
		public void dump() {
			if(ptr<=0)
				System.out.println("이스택은 비어있습니다.");
		for(int i =0;i<ptr;i++)
			System.out.println(stk[i]);
		}
		public void clear() {
			ptr = 0;			
		}
		public int indexOf(int x) {
			for(int i =ptr-1;i>=0;i--) 
				if (stk[i] == x)
					return i;								// 검색 성공
			return -1;
		}



}
