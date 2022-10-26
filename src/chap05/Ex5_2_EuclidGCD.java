package chap05;

import java.util.Scanner;

public class Ex5_2_EuclidGCD {

	static int gcd(int x, int y) {
		if (y==0) {
			return x;
		} else {
			return gcd(y, x % y);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.println("두 정수의 최대공약수 구하기");
		
		System.out.print("정수 1을 입력하시오 :");
		int x = stdIn.nextInt();
		System.out.print("정수를 2를 입력하시오 :");
		int y = stdIn.nextInt();
		
		System.out.println("정수 " + x + ", " + y +"의 최대 공약수는 " + gcd(x,y) +" 입니다.");
	}

}
