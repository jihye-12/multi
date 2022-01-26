package test;

import java.io.BufferedReader;
import java.io.IOException; 
import java.io.InputStreamReader;

public class B2954 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String pw = br.readLine();
		String[] A = {"apa","epe","ipi","opo","upu"};
		String[] B = {"a","e","i","o","u"}; 
		
		for (int i = 0; i < 5; i++) 
			pw = pw.replaceAll(A[i], B[i]); 
		System.out.println(pw); 
		} 
	}


