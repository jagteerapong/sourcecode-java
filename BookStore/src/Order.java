import java.util.Date;

class Order2 {
	private int id;
	private double totalPrice;
	private double discountPrice;
	private double netPrice;
	private OrderItem[] items = new OrderItem[2];
	private Date orderDate;
	private int counter;
	
	public void addItem(OrderItem orderItem1) {
		items[counter++] = orderItem1;
	}
	
	public void caculateTotalPrice() {
		for (OrderItem orderItem : this.items) {
			this.totalPrice += orderItem.getBook().getPrice();
		}
	}
	
	public void caculateNetPrice() {
		for (OrderItem orderItem : this.items) {
			this.netPrice += orderItem.getBook().getPrice();
		}
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public double getDiscountPrice() {
		return discountPrice;
	}

	public double getNetPrice() {
		return netPrice;
	}
	
}

public class Order {
	public static void main(String[] args) {
		
		Book book1 = new Book("First book", 8);
		Book book2 = new Book("Second book", 8);
		
		OrderItem orderItem1 = new OrderItem(book1, 1);
		OrderItem orderItem2 = new OrderItem(book2, 1);
		
		Order2 order2 = new Order2();
		order2.addItem(orderItem1);
		order2.addItem(orderItem2);
		order2.caculateTotalPrice();
		order2.caculateNetPrice();
		
		System.out.println(order2.getTotalPrice());
		System.out.println(order2.getDiscountPrice());
		System.out.println(order2.getNetPrice());
		
	}
}
