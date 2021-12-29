package ch5;

public class ArrayTest1 {

	public static void main(String[] args) {
		
		String names[] = {"이학생", "최신입", "김대리", "박과장", "최부장"};
		System.out.println("학생수=" + names.length);
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		int scores[] = new int[names.length];
		
		for(int i = 0; i < scores.length; i++) {
			scores[i] = (int)(Math.random() * 100)+ 1;
			System.out.print(names[i] + ":" + scores[i] + ", ");
		
		}
		System.out.println();
		System.out.println("점수 총갯수=" + scores.length);
		int sum = 0;
		int avg;
		for(int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
		}
		avg = sum / scores.length;
		System.out.println("총점= " + sum);
		System.out.println("평균= " + avg);
		
		int max = 0;
		String maxName = "";
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] > max) {
				max = scores[i];
				maxName = names[i];
			}
		}
		System.out.println("1등 점수= " + maxName + ":" + max);
		
		int min = 101;
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] < min) {
				min = scores[i];
		}
	}
		System.out.println("꼴등 점수= " + min);
}
}