package test;

import java.util.Scanner;

public class B17496 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        System.out.println((A-1) / B * C * D);
    }
}
