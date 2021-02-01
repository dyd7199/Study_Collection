package backjun;

import java.util.Scanner;

public class For_Ex01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int num1 = 0;
		int num2 = 0;
		
		int []result = new int[N];
		
		
		for(int i=0; i<N; i++) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			result[i] = num1 + num2;
		}
		
		for(int k : result) {
			System.out.println(k);
		}
		
		
	}
}
