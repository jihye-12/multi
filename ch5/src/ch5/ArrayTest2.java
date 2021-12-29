package ch5;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		int scores[][] = new int[3][5];
		System.out.println("총 학생수=" + scores[0].length); // 모든 인덱스의 길이가 같음
		System.out.println("총 과목수=" + scores.length);
		System.out.println("총 점수 갯수=" + scores.length * scores[0].length);
		
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j < scores[i].length; j++) { //2차원 배열은 중첩 반복문
			  System.out.print(scores[i][j] + "\t");
		}
		System.out.println();
	}
	for(int i = 0; i < scores.length; i++) {
		for(int j = 0; j < scores[i].length; j++) { //2차원 배열은 중첩 반복문
			scores[i][j] = (int)(Math.random() * 100)+ 1;
			System.out.print(scores[i][j] + "\t");
			
		}
		System.out.println();
		
	}
	char stars[][] = new char[5][];
	for(int i = 0; i < stars.length; i++) {
		stars[i] = new char[i+1];
		//System.out.println("총 라인수=" + stars[i].length);
		for(int j = 0; j < stars[i].length; j++) {
			stars[i][j] = '*';
			System.out.print(stars[i][j]);
	}
		System.out.println();
	}
	}
}

