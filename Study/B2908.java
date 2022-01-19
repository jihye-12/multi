package test;

import java.util.Scanner;

public class B2908 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		i = (i % 10) * 100 + (i % 100) - (i % 10) + (i / 100);
		j = (j % 10) * 100 + (j % 100) - (j % 10) + (j / 100);
		if(i>j) {
			System.out.println(i);
		}
		else {
			System.out.println(j);
		}

	}

}
