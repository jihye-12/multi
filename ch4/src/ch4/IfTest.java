package ch4;

public class IfTest {

	public static void main(String[] args) {
		String name = "이자바";
		//java, db, algorithm 시험점수 
		int java = 100;
		int db = 97;
		int algo = 96;
		int sum = java + db + algo;
		int avg = sum / 3;
		double avgDouble = (double)sum / 3;
		
		System.out.println(name + "학생의 자바점수=" + java + "db점수=" + db + "알고리즘 점수" + algo + "입니다.");
		System.out.println(name + "학생의 총점수=" + sum + "정수평균=" + avg + "실수평균=" + avgDouble + "입니다.");

		//avg : 90 이상 100점 이하 A부여
		//avg : 80 이상 90점 미만 B부여
		//avg : 70 이상 80점 미만 C부여
		//avg : 나머지 미수료 부여
		if(avg >= 90) {
			System.out.println("A등급");	
			//93점 이상이면 a+
			if(avg >=93)
				System.out.println("A+등급");		
		}
		else if(avg >= 80) { 
			System.out.println("B등급");
		}
		else if(avg >= 70) { 
			System.out.println("C등급");
		}
		else {
			System.out.println("미수료");
		}
	}

}
