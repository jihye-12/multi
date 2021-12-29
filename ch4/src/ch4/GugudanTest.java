package ch4;

public class GugudanTest {

	public static void main(String[] args) {
		
		for(int i=1; i<=9; i++) {
			for(int dan=2; dan <=9; dan++) {
				if(dan == 5) {
					//continue;//5일 때만 반복 수행 무시
					break;//5 이후로 반복 중지 
				}
				System.out.print(dan + "*" + i + "=" + dan*i + "\t");
			}
			System.out.print("\n");//=()
		}
	}
}

