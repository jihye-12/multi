package ch2;

public class Stringtest {

	public static void main(String[] args) {
		String s1 ="Java";
		char c1 = 'j';
		int i1 = 100;
		
		System.out.println(s1);
		System.out.println(c1);
		System.out.println(s1+ c1); //Javaj
		System.out.println(s1+ i1); //Java100
		System.out.println(c1+ i1); //206
		// + - 1. 숫자 덧셈 - 정수/실수 + 정수/실수, 단일 문자 ucicode
		// + - 2. 문자열 결합 - String + 다른타입, 다른타입 + String, String + String
		
		byte b1 = 127; //1byte정수=8bit / [부호1bit][값7bit] -> -2^7 ~ 2^7
		int b2 = 1280000000; //4BYTE
		
		int i2 = 127;// 127(4byte)
		byte b3 = (byte)i2; // int를 byte로 형변환 127(1byte)
		
		int i3 = 97;
		System.out.println(i3);//97
		System.out.println((char)i3);//a 97의 unicode 값
		//'A' 출력 
		System.out.println((char)(i3-32));
	}

}
