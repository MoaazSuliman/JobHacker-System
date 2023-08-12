package week8.OOPTask;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	private int id;

	private List<Product> products;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public String addProduct(Product product) {
		// if i'm using java 8 it will be an a problem if list is empty so i make that
		// if condition.
		if (products == null)
			products = new ArrayList<Product>();
		products.add(product);
		return "Product Added To Cart Successfully.";
	}

	public String deleteProduct(Product product) {
		return (products.remove(product) ? "Product Is Deleted From Cart Successfully..."
				: "This Product Not In Your Cart Don't Be Stupid.");
	}
}
