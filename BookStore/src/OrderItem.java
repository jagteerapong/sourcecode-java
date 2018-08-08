
public class OrderItem {
	//Properties
	private int id;
	private Book book;
	private int quantity;
	
	public OrderItem(Book book, int quantity) {
		super();
		this.id = id;
		this.book = book;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public Book getBook() {
		return book;
	}

	public int getQuantity() {
		return quantity;
	}
}
