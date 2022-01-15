package javaProject2;

class Book{ 
	String bookNo, bookTitle, bookAuthor, bookPublisher;
	int bookYear, bookPrice;

	public Book(String bookNo, String bookTitle, String bookAuthor, int bookPrice, int bookYear, String bookPublisher) {
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPublisher = bookPublisher;
		this.bookYear = bookYear;
		this.bookPrice = bookPrice;
	}
	
	@Override
	public String toString() {
		return bookNo +"\t"+  bookTitle +"\t"+ bookAuthor + "\t" + 
	bookPrice +"\t"+ bookYear +"\t"+ bookPublisher ;
	}


	static class Magazine extends Book{
	int month;

	public Magazine(String bookNo, String bookTitle, String bookAuthor, int bookPrice, int bookYear,
			String bookPublisher, int month) {
		super(bookNo, bookTitle, bookAuthor, bookPrice, bookYear, bookPublisher);
		this.month = month;
	}
	
	@Override
	public String toString() {
		return bookNo +"\t"+  bookTitle +"\t"+ bookAuthor + "\t" + 
	bookPrice +"\t"+ bookYear +"\t"+ bookPublisher +"\t"+"   "+ month;
	}
}

public static class BookTest {

	public static void main(String[] args) {
	
		Book book1 = new Book("B001", "자바 프로그래밍","홍길동", 25000, 2021, "멀티출판사");
		Book book2 = new Book("B002", "자바스크립트","이몽룡", 30000, 2020, "서울출판사");
		Book book3 = new Book("B003", "HTML/CSS","성춘향", 18000, 2021, "강남출판사");
		
		Magazine book4 = new Magazine("M001", "자바 월드","홍길동", 25000, 2021, "멀티출판사", 5);
		Magazine book5 = new Magazine("M002", "웹 월드","이몽룡", 30000, 2020, "서울출판사", 7);
		Magazine book6 = new Magazine("M003", "게임 월드","성춘향", 18000, 2021, "강남출판사", 9);

		System.out.println("도서번호\t도서명\t        저자\t가격\t발행일\t출판사");
		System.out.println("--------------------------------------------------------");
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3.toString());
		System.out.println(" ");
		
		System.out.println("잡지번호\t잡지명\t발행인\t가격\t발행연도\t출판사\t발행월");
		System.out.println("--------------------------------------------------------");
		System.out.println(book4.toString());
		System.out.println(book5.toString());
		System.out.println(book6.toString());
		}
	}
}
