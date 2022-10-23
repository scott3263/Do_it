package chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ex3_8_PhyExamSearch {

	static class PhyscData{
		
		private String name;
		private int height;
		private double vision;
		
		public PhyscData(String name, int height, double vision) {
			this.name = name; this.height = height; this.vision = vision;
		}

		@Override
		public String toString() {
			return "PhysData [name=" + name + ", height=" + height + ", vision=" + vision + "]";
		}
		
		public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();
		
		private static class HeightOrderComparator implements Comparator<PhyscData>{
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.height > d2.height) ? 1 :((d1.height< d2.height) ? -1: 0);
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		PhyscData[] x = {
				new PhyscData("aaa",162,0.4),
				new PhyscData("bbb",163,0.4),
				new PhyscData("ccc",164,0.4),
		};
		
		System.out.print("Target Height? :");
		int height = stdIn.nextInt();
		
		int idx = Arrays.binarySearch(x, new PhyscData("",height,0.0), PhyscData.HEIGHT_ORDER);
		
		if (idx < 0) {
			System.out.println("Not Found");
		} else {
			System.out.println("x[" + idx + "]에 있슴");
			System.out.println("찾은 데이타 : " + x[idx]);
		}
	}

}
