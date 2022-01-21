package main;

import dao.Student2DAO;
import dto.Student2DTO;

public class Student2Main {

	public static void main(String[] args) {
		//명령형 매개변수 입력
		// 박자바 park@c.com 01012345678 it공학 4.5 (id auto_incerment, regdate default)
		//Student2DTO dto = new Student2DTO(args[0], args[1], args[2], args[3],
		//		Double.parseDouble(args[4]));
		Student2DAO dao = new Student2DAO();
		//int insertrows = dao.insertStudent2(dto);
		//System.out.println(insertrows + "삽입 종료");
		
	    //dao.updateStudent2("교육", "edu");
		dao.deleteStudent2(5);
		
		Student2DTO[] arr = dao.selectStudent2();
	    
	    for(Student2DTO dto : arr) {
	    	if(dto != null) {
    	System.out.println(dto);
	    	}
    }
		


	}

}
