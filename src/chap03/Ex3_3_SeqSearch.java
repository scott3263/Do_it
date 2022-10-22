package chap03;

import java.util.Scanner;

public class Ex3_3_SeqSearch {

	static int seqSearch(int[] a, int key) {
		
		a[a.length -1] = key;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key)
				return i;
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		//int num = stdIn.nextInt();
		int[] x = new int[stdIn.nextInt() + 1];
		
		for (int i = 0; i < x.length -1; i++) {
			System.out.print("x[" + i + "]:");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("찾을 번호:");
		int key = stdIn.nextInt();
		
		int idx = seqSearch(x, key );
		
		if (idx == -1) {
			System.out.println("Not Found");
			
		} else {
			System.out.println("idx=" + idx);
		}
		
	}
}
