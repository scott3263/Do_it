package chap05;

import java.util.Scanner;

public class Ex5_1_Factorial {

	static double factorial(double n) {
		if (n > 0 ) {
			System.out.println(n * (n-1));
			return n * factorial(n-1);
		} else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수를 입력하십시요 : ");
		double x = stdIn.nextDouble();
		System.out.println(x + "의 팩토리알은 " + factorial(x));
	}

}
