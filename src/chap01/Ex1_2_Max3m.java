package chap01;

public class Ex1_2_Max3m {

	static int Max3m(int a, int b, int c) {
		int max = a;
		if (max < b) max = b;
		if (max < c) max = c;
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("max3(3,2,1) = " + Max3m(3,2,1));
		System.out.println("max3(3,1,2) = " + Max3m(3,1,2));
}
	
	

}
