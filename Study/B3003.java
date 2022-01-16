package test;

import java.util.Scanner;

public class B3003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] scan = new int[6];
		
		int[] origin = {1, 1, 2, 2, 2, 8};
		
		for (int i = 0; i < 6; i++) { 
			scan[i] = sc.nextInt(); }
		
		for( int i = 0; i < 6; i++) {
				System.out.println(origin[i]-scan[i]);
			}
		}
	}

