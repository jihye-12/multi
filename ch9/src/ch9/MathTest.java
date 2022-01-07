package ch9;

import java.util.Random;

public class MathTest {

	public static void main(String[] args) {
		//Math m = new Math();//private생성자,final클래스, 객체생성불가능,상속불가능
		//모든 메소드 static
		System.out.println(Math.random()); // 0-1의 값 랜덤
		System.out.println(Math.abs(-123)); //절댓값
		System.out.println(Math.round(123.65)); //반올림
		
		//난수발생클래스
		int ran1 = (int)(Math.random()*100)+1;
		System.out.println(ran1);
		
		java.util.Random rd = new Random();
		int ran2 = rd.nextInt(); //int 난수 / int 최소값 ~ int 최대값
		System.out.println(ran2);
		
		int ran3 = rd.nextInt(101); //int 난수 / 0 ~ 100
		System.out.println(ran3);
		
		boolean r1 = Boolean.parseBoolean("TrUE");
		System.out.println(r1);
		System.out.println(Integer.toBinaryString(10)); //2진수로 변경,Hax 16진수
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		System.out.println(max);
		System.out.println(min);
	}

}
