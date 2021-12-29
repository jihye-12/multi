package ch2;

public class VaribleTest {

	public static void main(String[] args) {
		//선언 + 값 할당 
		int kor = 100;
		int eng = 50;
		int mat = 75;
		
		//선
		int sum;
		int avgInt;
		double avgDouble;
		
		System.out.println("국어 점수는=" + kor); //String + 정수 실수, String + String 여러가지 요소들을 결합해서 출
		System.out.println(kor+eng+mat); // 정수, 실수 + 정수, 실수 -> 산술연산 덧
		System.out.println("영어 점수는=" + eng);
		System.out.println("수학 점수는=" + mat);
		
		eng = eng * 2;
		sum = kor + eng + mat;
		avgInt = sum / 3;
		avgDouble = sum / 3.0;
		
		System.out.println(sum);
		System.out.println(avgInt);
		System.out.println(avgDouble);
		
		boolean flag = true;
		System.out.println(flag);
		flag = false;
		System.out.println(flag);
		
		char c1 = '이';
		char c2 = '학';
		char c3 = '생';
		char c4 = '\n'; // 엔터키, \t 탭키
		System.out.print(c1+"\n"); 
		System.out.print(c2);
		System.out.println(c3);
		//System.out.println((char)c1 + "" + (char)c2 + (char)c3);
		//기본 제공 데이터타입 여러 문자 묶어서 선언 불가능
		//사용자 데이터타입 정의 사용 가능 = (1. 자바 라이브러리 쓰자 2. 사용자 정의)
		String name = "이학생"; // string 문자열
		System.out.println(name);
	}
}
