package test;

import java.util.Scanner;

public class B15964 {

	public static void main(String[] args) {
		//A＠B = (A+B)×(A-B)
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println((A+B)*(A-B));
	}
}
