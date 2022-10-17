package chap02;

public class Ex2_9_PrimeNumber1 {

	public static void main(String[] args) {
		int counter = 0;
		for (int n = 2; n <= 1000; n++) {
			int i;
			for (i = 2; i < n; i++) {
				if (n % i == 0) {
					counter++;
					break;
				}
				
				if (n == i) {
					System.out.println(n);
				} 
			}
		}
		System.out.println("counter = " + counter);
	}

}
