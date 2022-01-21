package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dto.Student2DTO;

public class Student2DAO {
//student2 테이블 crud기능 메소드 구현
	public int insertStudent2(Student2DTO dto) {
		Connection conn = null;
		int rows = 0;
	      try {
	          Class.forName("com.mysql.cj.jdbc.Driver");
	          conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeesdb", "emp", "emp");
	          
	          String insertSQL = "insert into students2 values(null, ?, ?, ?, ?, default, ?)";
	          
	          PreparedStatement pt = conn.prepareStatement(insertSQL);
	          pt.setString(1, dto.getName());
	          pt.setString(2, dto.getEmail());
	          pt.setString(3, dto.getPhone());
	          pt.setString(4, dto.getMajor());
	          pt.setDouble(5, dto.getScore());
	          
	          rows = pt.executeUpdate(); //실행결과리턴 
	          System.out.println(rows + " 개의 행 삽입 완료");         
	          
	          conn.close(); //db연결해제(파일, 소캣통신 close)
	          } 
	          catch (ClassNotFoundException e) {
	             System.out.println("mysql driver 미설치 또는 드라이버 이름 오류");
	          }
	          catch (SQLException e) {
	             System.out.println("db 접속오류");
	             e.printStackTrace();
	          }
	          finally {
	        	  try {
					conn.close();
				} catch (SQLException e) {
				}
	          }
	      
	          return rows;
	    
	       }
	public Student2DTO[] selectStudent2() {
		Connection conn = null;
		Student2DTO[]ar = new Student2DTO[10]; 
	      try {
	          Class.forName("com.mysql.cj.jdbc.Driver");
	          conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeesdb", "emp", "emp");
	          
	          String selectSQL = "select id, name, major from students2";
	          
	          PreparedStatement pt = conn.prepareStatement(selectSQL);
	          
	          ResultSet rs = pt.executeQuery(); //실행결과리턴 
	          int index = 0;
	          while(rs.next()) {
	        	  Student2DTO dto = new Student2DTO(rs.getInt("id"), rs.getNString("name"),rs.getNString("major"));
	        	  
	        	  ar[index++] = dto;
	          }
	          rs.close();
	          pt.close();
	          conn.close(); //db연결해제(파일, 소캣통신 close)
	          } 
	          catch (ClassNotFoundException e) {
	             System.out.println("mysql driver 미설치 또는 드라이버 이름 오류");
	          }
	          catch (SQLException e) {
	             System.out.println("db 접속오류");
	             e.printStackTrace();
	          }
	          finally {
	        	  try {
					conn.close();
				} catch (SQLException e) {
				}
	          }
	      
	          return ar;
	    
	}
	public void updateStudent2(String old, String new_word) {
		Connection conn = null;
	      try {
	          Class.forName("com.mysql.cj.jdbc.Driver");
	          conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeesdb", "emp", "emp");
	          
	          /*String updateSQL = "update students2 set major = ? where major like ? ";
	        		  
	          PreparedStatement pt = conn.prepareStatement(updateSQL);
	          pt.setString(1, "아이티");
	          pt.setString(2, "%" + old + "%");
	          */
	          
	          String updateSQL = 
	        		  "update students2 set major = insert(major, instr(major, ?), char_length(?), ?)" + 
		          		" where major like ?";
	          PreparedStatement pt = conn.prepareStatement(updateSQL);
	          
	          pt.setString(1, old);
	          pt.setString(2, old);
	          pt.setString(3, new_word);
	          pt.setString(4, "%" + old + "%");
	        		  
	          pt.executeUpdate(); 
	          pt.close();
	          conn.close(); //db연결해제(파일, 소캣통신 close)
	          } 
	          catch (ClassNotFoundException e) {
	             System.out.println("mysql driver 미설치 또는 드라이버 이름 오류");
	          }
	          catch (SQLException e) {
	             System.out.println("db 접속오류");
	             e.printStackTrace();
	          }
	          finally {
	        	  try {
					conn.close();
				} catch (SQLException e) {
				
	          }
	          }
	}
	        	  public void deleteStudent2(int id) {
	        			Connection conn = null;
	        		      try {
	        		          Class.forName("com.mysql.cj.jdbc.Driver");
	        		          conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeesdb", "emp", "emp");
	        		          
	        		          
	        		          String deleteSQL = "delete from students2 where id=?";	        		        		  
	        		          PreparedStatement pt = conn.prepareStatement(deleteSQL);
	        		          
	        		          pt.setInt(1, id);
	        		        		  
	        		          pt.executeUpdate(); 
	        		          pt.close();
	        		          conn.close(); //db연결해제(파일, 소캣통신 close)
	        		          } 
	        		          catch (ClassNotFoundException e) {
	        		             System.out.println("mysql driver 미설치 또는 드라이버 이름 오류");
	        		          }
	        		          catch (SQLException e) {
	        		             System.out.println("db 접속오류");
	        		             e.printStackTrace();
	        		          }
	        		          finally {
	        		        	  try {
	        						conn.close();
	        					} catch (SQLException e) {
	        					}
	        		          }
	        		  
	    
	       }
	}
