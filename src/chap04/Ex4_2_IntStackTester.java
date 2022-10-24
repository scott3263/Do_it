package chap04;

import java.util.Scanner;

public class Ex4_2_IntStackTester {

	static public class IntStack{
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
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		IntStack s = new IntStack(64);
		
	}

}
