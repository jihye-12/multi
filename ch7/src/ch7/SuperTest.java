package ch7;

class A extends Object{
	int i;
	A(String s){
		System.out.println("A생성자호출");
	    i = 10;
	}
}
class B extends A{
	int j;
	B(){
		super("전달");//생성자 첫문장 자동 정의
		System.out.println("B생성자호출");
	    j = 100;
	}
}
public class SuperTest {

	public static void main(String[] args) {
		B b1 = new B();
		System.out.println(b1.j);
		System.out.println(b1.i);
	}

}
