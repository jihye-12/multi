package ch8;

public class ExceptionTest {

	public static void main(String[] args) {
		//2개의 입력변수 필수
		try{
			int first = Integer.parseInt(args[0]);
			int second = Integer.parseInt(args[1]);
			System.out.println(second / first);
			
			//IllegalArgumentException e = new IllegalArgumentException();//예외객체생성
			//throw e; //e 참조예외객체강제발생
			
			throw new IllegalArgumentException("매개변수 잘못 지정");
			
			//3번 문장 중단-예외발생
			// new ArithmeticException() 자동 생성
			//catch 검사
		}

	
		catch(ArithmeticException e) { //자식예외먼저
			System.out.println("모든 예외 동일처리");
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("0이 아닌 값을 입력하세요");
		}
		/*catch(ArithmeticException e) {
			//first = (int)(Math.random()*100)+1;
			//args[0] = "100";
			//System.out.println("0이 아닌 값을 입력하세요");
			e.printStackTrace();//예외발생원인, 문장, 메소드 추적
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e) {
			System.out.println("정수 변환 가능 값을 입력하세요");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("입력값은 2개 이상이어야 합니다");
		}*/
		System.out.println("main실행완료");

	}

}
