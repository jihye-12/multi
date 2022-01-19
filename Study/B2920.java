package test;

import java.util.Arrays;
import java.util.Scanner;

public class B2920 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[]scan = new int[8];
		int [] asend = {1,2,3,4,5,6,7,8};
		int []descend = {8,7,6,5,4,3,2,1};
		
		for(int i = 0; i < 8; i++) {
			scan[i] = sc.nextInt();
		}
			if(Arrays.equals(scan, asend)) {
				System.out.println("ascending");
			}
			else if(Arrays.equals(scan, descend)) {
				System.out.println("descending");
			}
			else {
				System.out.println("mixed");
			}
		}	
	}
