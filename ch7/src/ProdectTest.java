
class Prodect {
	private int code;
	private String name;
	private double price;
	private int amount;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}

class ProductTest{
	public static void main(String args[]) {
		Prodect p = new Prodect();
		System.out.println(p.getCode());
		p.setCode(200);
		System.out.println(p.getCode());
		p.setName("상품명");
		p.setPrice(12390.5);
		p.setAmount(100);
		System.out.println(p.getName());
		System.out.println(p.getPrice());
		System.out.println(p.getAmount());
	}
}