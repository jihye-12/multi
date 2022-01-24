package day1;

public class Test2 {

	public static void main(String[] args) {
		/*
		정삼각형 별 출력
		5 입력
		        *
		       ***
		      *****
		     *******
		    *********
		
		1번줄  공백 4개 별 1개
		2번줄 공백 3개 별 3개
		3번 공백 2개 별 5개
		4번 공백 1개 별 7
		5번 공백 0 별 9
		
		i번 공백 ==> 5-i  별 ==> 2*i-1
		
		*/
		int w = 10;
		for(int line = 1 ; line <= w; line++) {//라인수만큼 반복
			//1개라인에 공백 반복
			for(int space = w-line; space >= 1; space--) {
				System.out.print(" ");
			}
			//1개라인에 * 반복
			for(int star = 1; star <= 2*line-1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	


}
