package chap01;

import java.util.Scanner;

public class Ex1_4_SumWhile {

	public static void main(String[] args) {
		try (Scanner stdIn = new Scanner(System.in)) {
			System.out.println("1부터 n까지의 합을 구함.");
			System.out.print("n ? : ");
			int n = stdIn.nextInt();
			
			int s = 0;
			int i = 1;
			while (i <= n) {
				s += i;
				i++;
			}
			
			System.out.println("1부터 " + n + "까지의 합은 : " + s);
		}
	}

}
