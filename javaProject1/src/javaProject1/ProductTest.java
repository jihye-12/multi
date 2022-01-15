package javaProject1;

class Product{
	int prdPrice, prdYear;
	String prdName, prdMaker, prdNo;
	
	public Product(String prdNo, String prdName, int prdPrice, int prdYear, String prdMaker) {
		this.prdNo = prdNo;
		this.prdPrice = prdPrice;
		this.prdYear = prdYear;
		this.prdName = prdName;
		this.prdMaker = prdMaker;
	}
		
	@Override
	public String toString() {
		return prdNo +"\t"+  prdName +"\t"+ prdPrice + "\t" + prdYear +"\t"+ prdMaker;
	}
}

public class ProductTest {

	public static void main(String[] args) {
		System.out.println("상품번호\t상품명\t가격\t연도\t제조사");
		System.out.println("-------------------------------------");
		Product a = new Product("001", "노트북", 1200000, 2021, "삼성");
		Product b = new Product("002", "모니터", 300000, 2021, "LG");
		Product c = new Product("003", "마우스", 30000, 2020, "로지텍");
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
		
	}
}
