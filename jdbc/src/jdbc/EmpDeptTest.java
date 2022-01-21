package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/*  employees 테이블에서 6월 입사자의 사번, 이름, 급여, 입사일을 조회하여
 * Employee 객체로 생성한 후에 ArrayList로 저장하고 출력하는 자바 프로그램을 구현하시오. */

public class EmpDeptTest {

	public static void main(String[] args) {
		EmpDeptTest t = new EmpDeptTest();
		try {
		ArrayList<Employee> list = t.selectEmp("06");
		for(Employee e : list) {
			System.out.println(e);
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}//main
	
	ArrayList<Employee> selectEmp(String month) throws ClassNotFoundException, SQLException{
		ArrayList<Employee> list = new ArrayList();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeesdb", "emp", "emp");
		System.out.println("mysql db 연결 성공");
		Statement st = conn.createStatement();
		String sql = "select employee_id, first_name, salary, hire_date from employees "
				+ "where substr(hire_date, 6, 2)='" + month + "'";
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			int id = rs.getInt("employee_id");
			String name = rs.getString("FIRST_NAME");
			double salary = rs.getDouble("salary");
			String hire = rs.getString("hire_date");
			//1개 레코드(컬럼들) - Employee 객체(인스턴스변수) 1개 매핑
			Employee e = new Employee(id, name, salary, hire);
			//ArrayList 저장 (테이블)
			list.add(e); //복사본
		}
		rs.close();
		st.close();
		conn.close();
		
		return list;
	}

}//EmpDeptTest end

class Employee{
	int employee_id;
	String first_name;
	double salary;
	String hire_date;
	
	public Employee(int employee_id, String first_name, double salary, String hire_date) {
		super();
		this.employee_id = employee_id;
		this.first_name = first_name;
		this.salary = salary;
		this.hire_date = hire_date;
	}

	@Override
	public String toString() {
		return employee_id + "\t" + first_name+ "\t" + salary + "\t" + hire_date;
	} 
	
	
	
	
	//String d = rs.getString("hire-date");
	//생성자 추가 , toString() 추가 , setter/getter 메소드
	
}