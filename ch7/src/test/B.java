package test; // 현재 클래스 저장 위치 설정
//다른 클래스의 패키지명 알려줌
import java.util.ArrayList;
import java.util.Date;

import multi.A;

public class B {

	public static void main(String[] args) {
		A a1 = new A();
		Date now = new Date();
		ArrayList list = new ArrayList();
		System.out.println("현재시각= " + now);
	}

}
