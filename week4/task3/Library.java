package week4.task3;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private String name;
	private String code;
	private List<Book> books;

	public Library() {

	}

	public Library(String name, String code, List<Book> books) {
		this.setName(name);
		this.setCode(code);
		this.setBooks(books);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		// check validation of Name.
		if (name.isBlank() || name.isEmpty()) {
			System.out.println("Invalid Name");
			System.exit(0);
		}
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		// check validation of Code.
		if (code.isBlank() || code.isEmpty()) {
			System.out.println("Invalid Code");
			System.exit(0);
		}
		this.code = code;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	// This function will add a new book for library.
	// but the first i check if list of books are null or not.
	public void addNewBook(Book book) {
		if (this.books == null)
			this.books = new ArrayList<>();
		this.books.add(book);
		System.out.println("Book Addeed To Library Successed.");
	}

	// before removing any book from library i should make sure it is already exist.
	public void removeBook(Book book) {
		if (!this.books.contains(book)) {
			System.out.println("This Book Isn't in this library");
			System.exit(0);
		}
		this.books.remove(book);
		System.out.println("Removeed Successed...");
	}

	// we will loop in all books in the library and add any book that have status
	// avilability true and add it to avilable books.
	public List<Book> getAvilableBooksForLibray() {
		List<Book> avilableBooks = new ArrayList<>();
		for (Book book : this.getBooks()) {
			if (book.isAvailabilityStatus())
				avilableBooks.add(book);
		}
		return avilableBooks;
	}

	// we will loop in all books in the library and add any book that have status
	// avilability false and add it to borrowed books.
	public List<Book> getBorrowedBooks() {
		List<Book> borrowedBooks = new ArrayList<>();
		for (Book book : this.getBooks()) {
			if (!book.isAvailabilityStatus())
				borrowedBooks.add(book);
		}
		return borrowedBooks;
	}

	@Override
	public String toString() {
		return "Library [name=" + name + ", code=" + code + ", books=" + books + "]";
	}

}
