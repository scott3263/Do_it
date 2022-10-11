package chap02;

import java.util.Scanner;

public class Ex2_6_ReverseArray {

	static void swap(int[] a, int idx1 , int idx2){
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void reverse(int[] a){
		for (int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - i -1);
		}
	}
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요소수 : ");
		int num = stdIn.nextInt();
		
		int[] x = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}

		reverse(x);
		
		for (int i = 0; i < x.length; i++) {
			System.out.println("x[" + i + "] :" + x[i]);
		}
	}

}
