package chap04;

import java.util.Scanner;

public class Ex4_2_IntStackTester {

	static class IntStack{
		private int max;
		private int ptr;
		private int[] stk;
		
		public class EmptyIntStackException extends RuntimeException{
			public EmptyIntStackException() {
			}
		}
		
		public class OverflowIntStackException extends RuntimeException{
			public OverflowIntStackException() {
				
			}
		}
		public IntStack(int capacity) {
			ptr = 0;
			max = capacity;
			try {
				stk = new int[max];
			} catch (OutOfMemoryError e) {
				max = 0;
				// TODO: handle exception
			}
		}
		
		public int capacity() {
			return max;
		}
		public int size() {
			return ptr;
		}
		
		public boolean isEmpty() {
			return ptr <= 0;
		}
		
		public boolean isFull() {
			return ptr >= max;
		}
		
		public void dump() {
			if (ptr <=0) {
				System.out.println("Stack is Empty");
			} else {
				for (int i = 0; i < ptr; i++) 
					System.out.print(stk[i] + " ");
				System.out.println();
			}
		}
		public int push(int x) throws OverflowIntStackException {
			if (ptr >= max) throw new OverflowIntStackException();
			return stk[ptr++] = x;
		}
		
		public int pop() throws EmptyIntStackException{
			if (ptr <= 0) {
				throw new EmptyIntStackException();
			}
			return stk[--ptr];
		}
		
		public int peek() throws EmptyIntStackException{
			if (ptr <= 0) {
				throw new EmptyIntStackException();
			}
			return stk[ptr -1];
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner stdIn = new Scanner(System.in);
		IntStack s = new IntStack(5);
		
		while (true) {
			System.out.println("현재 데이터 수 : "  + s.size() + "/" + s.capacity());			
			System.out.print("(1)PUSH (2)POP (3)PEAK (4)DUMP (0)QUIT : ");
			
			int menu = stdIn.nextInt();
			if (menu == 0)  {
				System.out.println("프로그램 종료");
				break;
			}
			int x;
			switch (menu) {
			case 1:
				System.out.print("데이터 : ");
				x = stdIn.nextInt();
				
				try {
					s.push(x);
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("Stack is Full");
				}
				break;
			case 2:
				try {
					s.pop();
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("Stack is Empty");
				}
				break;
			case 3:
				try {
					x = s.peek();
					System.out.println("PEEK DATA : " + x);
				} catch ( IntStack.EmptyIntStackException e) {
					System.out.println("Stack is Empty");
				}
				break;
			case 4:
				s.dump();
				break;
				
			default:
				break;
			}
			
		}
	}

}
