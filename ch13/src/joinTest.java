class JoinThread extends Thread{
	int i;
	public void run() {
		i = 10;
		System.out.println("JoinThread에서 i = "+ i);
	}
}
public class joinTest {

	public static void main(String[] args) {
		JoinThread jt = new JoinThread();
		jt.start();//스레드 대기 jt 대기중 main 실행중
		try {
			jt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}//main 일시중지 jt 실행중
		System.out.println("main에서 i = " + jt.i);
		System.out.println("main 종료");

	}

}
