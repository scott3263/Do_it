package chap02;

import java.util.Scanner;

public class Ex2_13_DayOfYear {

	static int[][] mdays = {
			{31,28,31,30,31,30,31,31,30,31,30,31},
			{31,29,31,30,31,30,31,31,30,31,30,31}
	};
	
	static int isLeap(int year) {
		return (year % 4 ==0 && year % 100 !=0 || year % 400 == 0) ? 1 : 0;
	}
	
	static int dayOfYear(int y, int m , int d) {
		int days = 0 ;
		
		for (int i = 1; i < m; i++) 
			days += mdays[isLeap(y)][i-1];
		return days;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int retry;
		
		System.out.println("경과 일수 구하기");
		
		do {
			System.out.print("년 : "); int year = stdIn.nextInt();
			System.out.print("월 : "); int month = stdIn.nextInt();
			System.out.print("일 : "); int day = stdIn.nextInt();
			
			System.out.println(year + "년의 " + dayOfYear(year, month, day) + "일째");
			
			System.out.print("retry?(1.Yes 2.No):");
			retry = stdIn.nextInt();
		} while (retry ==1);
		
		
	}

}
