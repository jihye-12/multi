package ch4;

public class SwitchTest {

	public static void main(String[] args) {
		String name = "이자바";
		//java, db, algorithm 시험점수 
		int java = (int)(Math.random()*100)+1;//1-100 난수 저장 
		int db = (int)(Math.random()*100)+1;
		int algo = (int)(Math.random()*100)+1;
		int sum = java + db + algo;
		int avg = sum / 3;
		double avgDouble = (double)sum / 3;
		
		System.out.println(name + "학생의 자바점수=" + java + ", db점수=" + db + ", 알고리즘 점수=" + algo + "입니다.");
		System.out.println(name + "학생의 총점수=" + sum + ", 정수평균=" + avg + ", 실수평균=" + avgDouble + "입니다.");

		//avg : 90 A부여
		//avg : 80 B부여
		//avg : 70 C부여
		//avg : 나머지 기타등급 부여
		int avg10 = avg /10; //나머지 사라짐
		switch(avg10) {
		case 10:
		case 9:
			System.out.println("A등급");	
			break;
		case 8:
			System.out.println("B등급");	
			break;
	    case 7:
			System.out.println("B등급");
			break;
		default: 
			System.out.println("기타등급");
		}
		/*switch(avg) {
		case 90:
			System.out.println("A등급");	
			break;
		case 80:
			System.out.println("B등급");	
			break;
	    case 70:
			System.out.println("B등급");
			break;
		default: 
			System.out.println("기타등급");
		}
		*/
	}

}
