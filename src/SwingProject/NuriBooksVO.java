package SwingProject;

public class NuriBooksVO {
	private int isbn;
	private String bookName;
	private String author;
	private String publish;
	private String bookPosition;
	private boolean toLend;
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublish() {
		return publish;
	}
	public void setPublish(String publish) {
		this.publish = publish;
	}
	public String getBookPosition() {
		return bookPosition;
	}
	public void setBookPosition(String bookPosition) {
		this.bookPosition = bookPosition;
	}
	public boolean isToLend() {
		return toLend;
	}
	public void setToLend(boolean toLend) {
		this.toLend = toLend;
	}
	@Override
	public String toString() {
		return "NuriBooksVO [isbn=" + isbn + ", bookName=" + bookName + ", author=" + author + ", publish=" + publish
				+ ", bookPosition=" + bookPosition + ", toLend=" + toLend + "]";
	}
	
}
