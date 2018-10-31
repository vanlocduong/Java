package bookstore;

public class Book {
	private String ID;
	private String name;
	private double price;
	public Book() {
		
	}
	public Book(String iD, String name, double price) {
		super();
		ID = iD;
		this.name = name;
		this.price = price;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
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
	public void showInfo() {
		System.out.println("Book Info");
		System.out.println("-ID   \t\t" + this.getID());
		System.out.println("-name  \t\t "+this.getName());
		System.out.println("-price \t\t" + this.getPrice());
	}
	

}
