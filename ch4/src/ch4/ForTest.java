package ch4;

public class ForTest {

	public static void main(String[] args) {
		// for
		int total = 0;
		for(int i = 1; i <= 10; i++) {
			total = total + i;
			System.out.println("i=" + i + "일 때, total=" + total);
		}
		System.out.println(total);
		
		// while
		int total2 = 0;
		int i2 = 101;
		while( i2 <= 100 ) {
			total2 = total2 +i2;
			System.out.println("i2=" + i2 + "일 때, total2=" + total2);
			i2++;
		}
		// do - while
		int total3 = 0;
		int i3 = 101;
		do{
			total3 = total3 +i3;
			System.out.println("i3=" + i3 + "일 때, total3=" + total3);
			i3++;
		}while( i3 <= 100 );
	}

}
