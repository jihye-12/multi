package ch8;

class Test{
	void ma(int i) throws ArithmeticException{
		System.out.println(100/i);
	}
	void mb() throws ArithmeticException{
		ma(0);
	}
}

public class ThrowsTest {

	public static void main(String[] args) {
		Test t = new Test();
		try {
			t.mb();
		}catch(ArithmeticException e) {
			System.out.println("0 나누기 불가");
		}

	}

}
