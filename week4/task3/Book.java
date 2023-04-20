package week4.task3;

public class Book {
	private int bookId;
	private String bookTitle;
	private String authorName;
	private String bookVersion;
	private boolean availabilityStatus;

	public Book(int bookId, String bookTitle, String authorName, String bookVersion, boolean availabilityStatus) {
		super();
		this.setBookId(bookId);
		this.setBookTitle(bookTitle);
		this.setAuthorName(authorName);
		this.setBookVersion(bookVersion);
		this.setAvailabilityStatus(availabilityStatus);
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		if (bookId <= 0) {
			System.out.println("This Is Not Valid Id " + bookId);
			System.exit(0);
		}
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		// check validation of book title
		if (bookTitle.isBlank() || bookTitle.isEmpty()) {
			System.out.println("This is invalid book title.");
			System.exit(0);
		}
		this.bookTitle = bookTitle;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		// check validation of author name.
		if (authorName.isBlank() || authorName.isEmpty()) {
			System.out.println("This is invalid book title.");
			System.exit(0);
		}
		this.authorName = authorName;

	}

	public String getBookVersion() {
		return bookVersion;
	}

	public void setBookVersion(String bookVersion) {
		// check validation of book version
		if (bookVersion.isBlank() || bookVersion.isEmpty()) {
			System.out.println("This is invalid book title.");
			System.exit(0);
		}
		this.bookVersion = bookVersion;
	}

	public boolean isAvailabilityStatus() {
		return availabilityStatus;
	}

	public void setAvailabilityStatus(boolean availabilityStatus) {
		this.availabilityStatus = availabilityStatus;
	}

	public String checkout() {
		return toString();
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookTitle=" + bookTitle + ", authorName=" + authorName + ", bookVersion="
				+ bookVersion + ", availabilityStatus=" + availabilityStatus + "]";
	}

}
