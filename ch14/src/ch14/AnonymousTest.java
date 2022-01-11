package ch14;
/*
interface MyFunction {
	int max(int a, int b);
}

class MyFunctionChild implements MyFunction{
	public int max(int a, int b) {
		return a > b? a:b;
	}
}
public class AnonymousTest {

	public static void main(String[] args) {
		MyFunction c = new MyFunctionChild();
		int bigger = c.max(5, 3);
		System.out.println(bigger);

	}

}
*/
/*
interface MyFunction {
	int max(int a, int b);
}


public class AnonymousTest {

	public static void main(String[] args) {
		MyFunction c = new MyFunction() {
			public int max(int a, int b) {
				return a > b ? a : b; //수행할 문장이 리턴 하나면 밑의 형식으로 변경가능
		}
	};// 상속받고 객체까지 바로 생성 익명의 클래스 사용
		int bigger = c.max(10, 5);
		System.out.println(bigger);

	}

}
*/
interface MyFunction {
	int max(int a, int b);//1개 메소드, 함수형 인터페이스
}

interface MyFunction2{
	int mul(int a);
}

interface MyFunction3{
	String add(String s, int i);
}
public class AnonymousTest {

	public static void main(String[] args) {
		//MyFunction c = (int a, int b) ->  a > b ? a : b; //화살표 뒤에 한문장만 -> 리턴 필요 없음 //람다식 인터페이스 구조를 간단하게
		MyFunction c = (int a, int b) -> {System.out.println("{}생략불가");return a>b?a:b;};//람다 안에 두개의 문장은 블럭 생략 불가
		int bigger = c.max(10, 5);
		System.out.println(bigger);
		
		MyFunction2 c2 = (int a) -> {return a*a;}; //블럭은 리턴 
		System.out.println(c2.mul(10));
		MyFunction3 c3 = (s, i) -> s+i;
		System.out.println(c3.add("java", 100));
	}
}