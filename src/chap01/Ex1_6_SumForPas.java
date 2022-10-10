package chap01;

import java.util.Scanner;

public class Ex1_6_SumForPas {

	public static void main(String[] args) {
		try (Scanner stdIn = new Scanner(System.in)) {
			int n;
			
			do {
				System.out.print("n을 입력하십시요 : ");
				n = stdIn.nextInt();
			} while (n <= 0);
		}
		
	}

}
