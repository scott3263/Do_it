package chap02;

import java.util.Iterator;
import java.util.Scanner;

public class Ex2_14_PhysicalExamination {

	static final int VMAX = 21;
	static class PhyscData{
		String name;
		int height;
		double vision;
		
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	static double aveHeight(PhyscData[] dat) {
		double sum =0;
		
		for (PhyscData physcData : dat) {
			sum += physcData.height;
		}
		return sum / dat.length;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner stdIn = new Scanner(System.in);
		
		PhyscData[] x = {
			new PhyscData("a2345678", 123, 1234.3),
			new PhyscData("b2345678", 163, 0.4),
			new PhyscData("ccc", 164, 0.5),
			new PhyscData("ddd", 165, 0.6),
			new PhyscData("eee", 166, 0.7),
		};
		
		int[] vdist = new int[VMAX];
		
		for (PhyscData physcData : x) {
			System.out.printf("%-8s%3d%5.1f\n",physcData.name,physcData.height,physcData.vision);
		}
		
	}

}
