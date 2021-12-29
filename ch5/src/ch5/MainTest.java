package ch5;

public class MainTest {

	public static void main(String[] args) {
		System.out.println("입력 갯수= " + args.length);
		System.out.println("내용");
		
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println(args[0]+ args[1]);
		//자바 형변환은 기본형만 가능, String 불가능
		//String -- int 형변환 메소
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		System.out.println(first + second);
		//String -- double 형변환
		Double.parseDouble(args[0]);
	}

}
