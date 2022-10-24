package chap03;

import java.util.Scanner;

public class Ex3_1_SeqSearch {

	static int seqSearch(int[] a, int key) {
		int i = 0;
		
		while(true) {
			if (i == a.length) 
				return -1;
			if (a[i] == key)
				return i;
			
			i++;
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for (int i = 0; i < x.length; i++) {
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
