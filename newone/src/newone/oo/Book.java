package newone.oo;

public class Book {
	 private int bookId;
	    private String title;
	    private String description;
	    private String author;
	    private int availableQuantity;
	    private int totalQuantity;
	    private double price;
	    private double rentPerDay;
	    
		public Book(int bookId, String title, String description, String author, int availableQuantity,
				int totalQuantity, double price, double rentPerDay) {
			this.bookId = bookId;
			this.title = title;
			this.description = description;
			this.author = author;
			this.availableQuantity = availableQuantity;
			this.totalQuantity = totalQuantity;
			this.price = price;
			this.rentPerDay = rentPerDay;
		}
		public int getBookId() {
			return bookId;
		}
		public void setBookId(int bookId) {
			this.bookId = bookId;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public int getAvailableQuantity() {
			return availableQuantity;
		}
		public void setAvailableQuantity(int availableQuantity) {
			this.availableQuantity = availableQuantity;
		}
		public int getTotalQuantity() {
			return totalQuantity;
		}
		public void setTotalQuantity(int totalQuantity) {
			this.totalQuantity = totalQuantity;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public double getRentPerDay() {
			return rentPerDay;
		}
		public void setRentPerDay(double rentPerDay) {
			this.rentPerDay = rentPerDay;
		}
		@Override
		public String toString() {
			return "Book [bookId=" + bookId + ", title=" + title + ", description=" + description + ", author=" + author
					+ ", availableQuantity=" + availableQuantity + ", totalQuantity=" + totalQuantity + ", price="
					+ price + ", rentPerDay=" + rentPerDay + "]";
		}
	    
}
