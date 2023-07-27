package week8.OOPTask;

import java.util.ArrayList;

public class Order {

	private int id;

	private Cart cart;

	private double total;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public void placeOrder(Cart cart) {
		// set cart to order
		Order order = new Order();
		order.setCart(cart);

		System.out.println("Order Items");
		for (Product product : cart.getProducts()) {
			System.out.println("Product : " + product.toString());
			this.total += product.getPrice();
		}
		System.out.println("Total For This Order Is = " + this.total);
		// set cart empty after added it to user orders.
		cart = new Cart();

	}
}
