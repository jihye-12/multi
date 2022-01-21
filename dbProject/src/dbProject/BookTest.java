package dbProject;

public class BookTest {

	public static void main(String[] args) {
		
		BookDTO bookDTO = new BookDTO();
		BookDAO bookDAO = new BookDAO();
		bookDTO.setBookNo("B004");
		bookDTO.setBookTitle("자바스크립트");
		bookDTO.setBookAuthor("강길동");
		bookDTO.setBookYear(2020);
		bookDTO.setBookPrice(28000);
		bookDTO.setBookPublisher("서울출판사");
		
		bookDAO.insertBook(bookDTO);
		
		BookDAO.selectBook();
		
	}
}
