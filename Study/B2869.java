package test;

import java.io.*;
import java.util.StringTokenizer;

public class B2869 {

public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		 
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		int result = (V-A)/(A-B);
		
		if((V-A)%(A-B)==0) {
			System.out.println(result+1);
		}
		else {
			System.out.println(result+2);
		}
	}
}
