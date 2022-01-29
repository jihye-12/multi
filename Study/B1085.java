package test;

import java.util.Scanner;

public class B1085 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		int y = in.nextInt();
		int w = in.nextInt();
		int h = in.nextInt();
		
		int WM = (w-x) < x ? (w-x) : x;
		int HM = (h-y) < y ? (h-y) : y;
        
		if( WM < HM ) {
        	System.out.println( WM );
        }
        else {
        	System.out.println( HM );
        }
}
}
