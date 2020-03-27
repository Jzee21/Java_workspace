package test;

public class Tester {

	public static void main(String[] args) {
		/*
		 *	1. 구구단 출력
		 *	2 * 1 = 2  ..... 9 * 1 = 9
		 *	.....
		 *	2 * 9 = 18 ....
		 * 
		*/
		System.out.println("Q.01");
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.printf("%2d * %2d = %2d | ", j, i, j*i);
			}
			System.out.println();
		}
		
		
		/*
		 * 	2. 1/2 + 2/3 + 3/4 + ... + 9/10 = ?
		*/
		System.out.println("\nQ.02");
		double sum2 = 0.0;
		for (double i = 1.0; i < 10; i++) {
			sum2 += i / (i+1.0);
		}
		System.out.printf("result : %f\n", sum2);			// 7.071032
		System.out.printf("result : %.2f\n", sum2);			// 7.07
		
		
		/*
		 * 	3. 1 + (1+2) + (1+2+3) + ... + (1+2+3+4+5) = ?
		*/
		System.out.println("\nQ.03");
		int sum3 = 0;
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j <= i; j++) {
				sum3 += j;
			}
		}
		System.out.printf("result : %d\n", sum3);			// 35
		
	}

}
