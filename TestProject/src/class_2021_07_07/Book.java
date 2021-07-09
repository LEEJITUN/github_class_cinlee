package class_2021_07_07;

public class Book {
	String title;
	String author;
	int ISBN;
	
	public Book(String title, String author,int ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
}
