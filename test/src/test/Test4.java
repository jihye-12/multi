package test;

public class Test4 {
	public static void main(String[] args) {
		char c = 'a';
		for(int i = 1; i < 10; i++){
			for(int j = 0; j < i; j++){
				System.out.print((char)(c + j));
			}
			System.out.println();
		}
	}
}
	