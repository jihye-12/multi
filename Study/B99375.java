package test;

import java.util.HashMap;
import java.util.Scanner;

public class B99375 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in); 
    	
    	int Test = sc.nextInt(); 
    	
    	for(int i = 0; i < Test; i++) {
    		HashMap<String, Integer> Clothes = new HashMap<>(); 
    		int Num = sc.nextInt(); 
    		
    		for(int j = 0; j < Num; j++) { 
    			String Name = sc.next(); 
    			String Kind = sc.next(); 
    			
    			if(Clothes.containsKey(Kind)) { 
    				Clothes.put(Kind, Clothes.get(Kind) + 1); 
    				} else { 
    					Clothes.put(Kind, 1); 
    				} 
    		} 
    		int Result = 1; 
    		for(int val : Clothes.values()) { 
    			Result *= val + 1; 
    		} 
    		System.out.println(Result - 1); 
    		} 
    	} 
    }

