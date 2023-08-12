package week8.OOPTask;

public class Product {

	private int id;
	private String code;
	private String name;
	private double price;

	public Product() {

	}

	public Product(int id, String code, String name, double price) {
		super();
		this.id = id;
		this.code = code;
		// using setter and getter because i have some validations in attributes.
		setName(name);
		setPrice(price);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.isEmpty()) {
			System.out.println("Name Must Not Be Empty Or ...");
			System.exit(1);
		}
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price <= 0) {
			System.out.println("Price Must Be Greater Than Zero Pounds.");
			System.exit(0);
		}
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", code=" + code + ", name=" + name + ", price=" + price + "]";
	}

}
