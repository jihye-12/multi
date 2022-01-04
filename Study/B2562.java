package test;

import java.util.Scanner;

public class B2562 {
public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);
         
   int Max = 0;
   int Count = 0;
   
         int[] numbers = new int[9]; 
        
         for(int i=0; i<9; i++){       
        numbers[i]=   sc.nextInt();          
    
        if(numbers[i] > Max) {
        Max = numbers[i];
        Count = i+1;       
        }
  
   }
        sc.close();
 System.out.println(Max);
 System.out.println(Count);
   }
    
}
