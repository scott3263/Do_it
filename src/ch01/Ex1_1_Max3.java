package ch01;

import java.util.Scanner;

public class Ex1_1_Max3 {

	public static void main(String[] args) {
		try (Scanner stdIn = new Scanner(System.in)) {
			System.out.println("세정수중 최대값을 구한다");
			System.out.print("a : " );int a = stdIn.nextInt();
			System.out.print("b : " );int b = stdIn.nextInt();
			System.out.print("c : " );int c = stdIn.nextInt();
			
			int max = a;
			if (max < b) max = b;
			if (max < c) max = c;
			
			System.out.println("최대값 = " + max);
		}
	}
}
