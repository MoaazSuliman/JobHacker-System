package week8.OOPTask;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product(1, "5215521455", "Tuna Pizza", 55);
		Product product2 = new Product(1, "5215521455", "Hot Tuna Pizza", 55);
		Product product3 = new Product(1, "5215521455", "Very Hot Tuna Pizza", 55);
		Product product4 = new Product(1, "5215521455", "Very Very Hot Tuna Pizza", 55);
		Product product5 = new Product(1, "5215521455", "Tuna Pizza Larger Than Any Pizza In This Life.", 55);
		Product product6 = new Product(1, "5215521455", "", 55);
		
		Cart cart = new Cart();
		cart.addProduct(product1);
		cart.addProduct(product2);
		cart.addProduct(product3);
		cart.addProduct(product4);
		cart.addProduct(product5);
		
		
		Order order = new Order();
		order.setCart(cart);
		
		
		order.placeOrder(cart);
	}
}
