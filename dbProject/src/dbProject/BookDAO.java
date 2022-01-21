package dbProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookDAO {

		public int insertBook(BookDTO bookDTO) {
			Connection conn = null;
			int rows = 0;
		      try {
		          Class.forName("com.mysql.cj.jdbc.Driver");
		          conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookstoredb", "emp", "emp");
		          
		          String insertSQL = "insert into book values(?, ?, ?, ?, ?, ?)";
		          
		          PreparedStatement pt = conn.prepareStatement(insertSQL);
		          pt.setString(1, bookDTO.getBookNo());
		          pt.setString(2, bookDTO.getBookTitle());
		          pt.setString(3, bookDTO.getBookAuthor());
		          pt.setInt(4, bookDTO.getBookYear());
		          pt.setInt(5, bookDTO.getBookPrice());
		          pt.setString(6, bookDTO.getBookPublisher());   
		          
		          rows = pt.executeUpdate(); 
		          conn.close(); 
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

static public void selectBook() {
	Connection conn = null;
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookstoredb", "emp", "emp");
          
          String selectSQL = "select * from book";
         
          PreparedStatement pt = conn.prepareStatement(selectSQL);

          ResultSet rs = pt.executeQuery(); 
          
          while(rs.next()) {
              BookDTO bookDTO = new BookDTO();
              bookDTO.setBookNo(rs.getString("BookNo"));
              bookDTO.setBookTitle(rs.getString("BookTitle"));
              bookDTO.setBookAuthor(rs.getString("BookAuthor"));
              bookDTO.setBookYear(rs.getInt("BookYear"));
              bookDTO.setBookPrice(rs.getInt("BookPrice"));
              bookDTO.setBookPublisher(rs.getString("BookPublisher"));
              
              System.out.println(bookDTO.getBookNo() + "\t" + bookDTO.getBookTitle() + "\t" + bookDTO.getBookAuthor() 
              + "\t" + bookDTO.getBookYear() + "\t" + bookDTO.getBookPrice() + "\t" + bookDTO.getBookPublisher());

          } 
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

