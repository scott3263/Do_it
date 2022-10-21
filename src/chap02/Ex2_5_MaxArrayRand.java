package chap02;

import java.util.Random;
import java.util.Scanner;

public class Ex2_5_MaxArrayRand {

	public static void main(String[] args) {
		Random rand = new Random();
		
		@SuppressWarnings("resource")
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("키의 최대값을 구합니다.");
		System.out.print("사람수는 : ");
		int num = stdIn.nextInt();
		
		int[] height = new int[num];
		
		for (int i = 0; i < height.length; i++) {
			height[i] = 150 + rand.nextInt(35);
			System.out.println(height[i]);
		}
	}

}
