package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest {

   public static void main(String[] args) {
      try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection conn = 
      DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeesdb", "emp", "emp");
      System.out.println("mysql db 연결 성공");
      
      //emp_copy 테이블 안에 레코드 저장하기
      //employee_id:자동증가 first_name,salary,hire_date:current_date
      
      //명령행 매개변수 - args 단일 따옴표**
      String insertSQL2 = "insert into emp_copy values (null, '" + args[0] + "', " + args[1] + ", current_date)";
      
      //String insertSQL = "insert into emp_copy (SELECT EMPLOYEE_ID, FIRST_NAME, SALARY, HIRE_DATE FROM EMPLOYEES)";
      Statement st = conn.createStatement(); //sql저장해놨다가 전송해주고 실행결과를 가져온다
      int insertROW = st.executeUpdate(insertSQL2);//변화된 행의 갯수가 몇개인지
      System.out.println(insertROW + "개의 행 삽입 완료");
      
      
      conn.close(); 
      System.out.println("mysql db 연결 해제 성공");
      } 
      catch (ClassNotFoundException e) {
         System.out.println("mysql driver 미설치 또는 드라이버 이름 오류");
      }
      catch (SQLException e) {
         System.out.println("db 접속오류");
         e.printStackTrace();
      }
   }

}