package test;

public class Test2 {
	public static void main(String[] args) {
		int cntOfBooks = 12;
		int cntOfStu = 12;
		
		if(cntOfBooks > cntOfStu){
			System.out.println("1명의 학생 당 : "+ cntOfBooks / cntOfStu + "권 씩 가질 수 있습니다.");
			System.out.println("남아있는 책은 "+ cntOfBooks % cntOfStu + "권 입니다.");
		}
		else if(cntOfBooks == cntOfStu) {
			System.out.println("1명의 학생 당 : 1권 씩 가질 수 있습니다.");
		}
		else{
			System.out.println("나눠줄 수 없습니다.");
		}
	}
}
