class A{ 
	int ia = 10;
	void ma() {
		System.out.println(ia);
	}
}
class B extends A{ 
	int ib = 20;
	void mb() {
		System.out.println(ib);
	}
}
class C extends A{ 
	int ic = 30;
	void mc() {
		System.out.println(ic);
	}
}
class D extends C{
	int id = 40;
	void md() {
		System.out.println(id);
	}
}

public class CastingTest {

	public static void main(String[] args) {
		A a1 = new A(); //object객체+A객체
		A a2 = new B(); //object객체+A객체+B
		A a3 = new C(); //object객체+A객체+C
		A a4 = new D(); //object객체+A객체+C+D
		/*System.out.println(a1.ia);
		a1.ma();
		System.out.println(a2.ia);
		a2.ma();
		System.out.println(a3.ia);
		a3.ma();
		System.out.println(a4.ia);
		a4.ma();*/
		
		//System.out.println(a1.ib); //오류. 메모리 ib변수 포함 객체 없다
		//System.out.println(a2.ib); //오류. 메모리 ib변수 포함 객체 생성되었으나 접근 불가능
		B b2 = (B)a2; //명시적형변환 - B타입 
		System.out.println(b2.ib); //20
		
		//System.out.println(a3.ic); //오류. 메모리 ic변수 포함 객체 생성되었으나 접근 불가능
		C c3 = (C)a3; //명시적형변환 - C타입 
		System.out.println(c3.ic); //30
		
		//System.out.println(a4.id); //오류. 메모리 id변수 포함 객체 생성되었으나 접근 불가능
		D d4 = (D)a4; //명시적형변환 - D타입 
		System.out.println(d4.id); //40
		
		//자동형변환 필요 경우 - 변수타입 통일 - 여러가지 객체 1개 배열 선언
		A array[] = new A[4];
		array[0] = new D();
		array[1] = new C();
		array[2] = new B();
		array[3] = new A();
		
		for(int i = 0; i < array.length; i++) {
			//=new D() 객체 생성했다면
			if(array[i] instanceof D) { //D타입으로 명시적형변환 가능하니
			D d1 = (D)array[i];
			System.out.println(i +"번째 인덱스일 때 " + d1.id);
			}
		}
	}

}
