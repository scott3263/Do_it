package chap01;

public class Ex1_7_Multi99table {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 9; i++) {
			
			if (i == 1) {
				System.out.print("  |");
				for (int j = 1; j <= 9; j++) {
					System.out.printf("%3d", i * j);	
				}
				System.out.println();
			}
			
			for (int j = 1; j <= 9; j++) {
				 System.out.printf("%3d", i * j);
			}
			
			System.out.println();
		}

	}

}
