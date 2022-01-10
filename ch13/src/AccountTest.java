class Account{
	String name;
	int total;
	
	Account(String name){
		this.name = name;
	}
	
    synchronized void deposit(int money, String loc) {
		total += money;
		System.out.println("[" + loc + "]" + money + " 입금후 [ 총액 : " + total + "]");
	}
}
class CustomerThread extends Thread{
	Account ac;
	CustomerThread(Account ac, String name){
		super(name);
		this.ac = ac;
	}
	public void run() {
		int money = (int)(Math.random()* 1000);
		ac.deposit(money, getName());
	}
}
public class AccountTest {

	public static void main(String[] args) {
		Account acc = new Account("인터넷 쇼핑몰");
		CustomerThread [] ct = new CustomerThread[5];
		ct[0] = new CustomerThread(acc, "강남고객");
		ct[0].start();
		ct[1] = new CustomerThread(acc, "구로고객");
		ct[1].start();
		ct[2] = new CustomerThread(acc, "인천고객");
		ct[2].start();
		ct[3] = new CustomerThread(acc, "마포고객");
		ct[3].start();
		ct[4] = new CustomerThread(acc, "제주고객");
		ct[4].start();

	}

}
