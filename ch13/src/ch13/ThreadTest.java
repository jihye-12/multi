package ch13;

class MyThread1 extends Thread {
	MyThread1(String name){
		super(name); //Thread(String)->이름
	}
	@Override
	public void run() {
		System.out.println(getName());//thread 이름 출력
			for(int i = 1; i <= 10; i++) {
				try {
					Thread.sleep(1000); //1초쉬어라 멈추는 동안에 다른 스레드 출력
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
				System.out.print("!");
			}
		}
	}

class MyThread2 extends Thread{
	MyThread2(String name){
		super(name); //Thread(String)->이름
	}
	public void run()  {
		System.out.println(getName());
		for(int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("#");
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1("MyThread1");
		MyThread2 t2 = new MyThread2("MyThread2");
		t1.start();//t1.run()호출 - Thread-0이름 부여(자동) -> 사용자 부여 이름
		t2.start();
		System.out.println("main 종료");

	}

}
