package runner;

class MyThread1 implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		//System.out.println(Thread.currentThread().getPriority());
		for(int i = 1; i <= 100; i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("!");
			}
		}
	}

class MyThread2 extends Thread{
	public void run()  {
		System.out.println(Thread.currentThread().getName());
		for(int i = 1; i <= 100; i++) {
			System.out.print("#");
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		Thread tt1 = new Thread(t1);
		Thread tt2 = new Thread(t2);
		
		tt1.setPriority(1);
		tt2.setPriority(10);
		
		System.out.println("tt1의 우선 순위=" + tt1.getPriority());
		System.out.println("tt2의 우선 순위=" + tt2.getPriority());
		tt1.start();
		tt2.start();
		System.out.println("main 종료");

	}

}
