package test;

import java.util.Scanner;

public class B2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(H==0) {
			M = 24;
		}
		
		int sum = M + H * 60;
		int result = sum - 45;
		
		int Hour = result / 60;
		int Min = result % 60;
		
		
		if(Hour==24) {
			Hour = 0;
		}
		
		System.out.println(Hour + " " + Min);
		
	}
}