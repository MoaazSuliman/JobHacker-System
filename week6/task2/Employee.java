package week6.task2;

public class Employee {

	private int id;
	private String firstName;
	private String lastName;
	private String sex;
	private int age;
	private String address;
	private String phoneNumber;
	private int vactionBalance;

	public Employee() {
		this.vactionBalance = 30;
	}

	public Employee(int id, String firstName, String lastName, String sex, int age, String address, String phoneNumber,
			int vactionBalance) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.sex = sex;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.vactionBalance = vactionBalance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getVactionBalance() {
		return vactionBalance;
	}

	public void setVactionBalance(int vactionBalance) {
		this.vactionBalance = vactionBalance;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", sex=" + sex + ", age="
				+ age + ", address=" + address + ", phoneNumber=" + phoneNumber + ", vactionBalance=" + vactionBalance
				+ "]";
	}

}
