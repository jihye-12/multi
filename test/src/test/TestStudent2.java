package test;

public class TestStudent2 {
	public static void main(String[] args) {

		TestStudent1 e1 = new TestStudent1();
		
		e1.name = args[0];
		e1.aff = args[1];
		e1.pro = args[2];
		e1.edu = Integer.parseInt(args[3]);
		e1.add = Integer.parseInt(args[4]);
		
		
		if(e1.pro.equals("자바프로그래밍")) {
			e1.ref = e1.edu * 0.25 + e1.add;
			
		}
		else if(e1.pro.equals("JDBC프로그래밍")) {
			e1.ref = e1.edu * 0.2 + e1.add;
			
		}
		else if(e1.pro.equals("JSP프로그래밍")) {
			e1.ref = e1.edu * 0.15 + e1.add;
			
		}
		else {
			System.out.println("잘못 입력되었습니다.");
		}
		
		System.out.println("이름=" + e1.name + " 소속="+ e1.aff + " 과정명=" + e1.pro + 
				" 교육비=" + e1.edu + " 부가금=" + e1.edu + " 환급금=" + e1.ref );
	
	}

}
