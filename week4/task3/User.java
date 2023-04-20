package week4.task3;

import java.util.ArrayList;
import java.util.List;

public class User {

	private int userId;
	private String username;
	private List<Book> borrowedBooks;

	public User() {

	}

	public User(int userId, String username, List<Book> borrowedBooks) {
		this.setUserId(userId);
		this.setUsername(username);
		this.setBorrowedBooks(borrowedBooks);
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		// check invalid id.
		if (userId <= 0) {
			System.out.println("Invalid userId");
			System.exit(0);
		}
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		// check invalid username.
		if (username.isEmpty() || username.isBlank()) {
			System.out.println("Invalid username ");
			System.exit(0);
		}
		this.username = username;
	}

	public List<Book> getBorrowedBooks() {
		return borrowedBooks;
	}

	public void setBorrowedBooks(List<Book> borrowedBooks) {
		this.borrowedBooks = borrowedBooks;
	}

	public void borrowBook(Book book) {
		if (this.borrowedBooks == null)
			this.borrowedBooks = new ArrayList<>();
		// check is book are avilable or not at first.
		if (!book.isAvailabilityStatus()) {
			System.out.println("This Book Isn't avilable .");
			System.exit(0);
		}
		// book are free to borrowing , we will update it and add it to user.
		updateBookAfterBorrowingIt(book);// to tell the library this book isn't avilable after now.
		this.borrowedBooks.add(book);
	}

	// after borrow any book we should set his status equal to false;
	private void updateBookAfterBorrowingIt(Book book) {
		book.setAvailabilityStatus(false);
	}

}
