package project;

public class BookVO {
	private String code;
	private String title;
	private String author;
	private int price;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public BookVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookVO(String code, String title, String author, int price) {
		super();
		this.code = code;
		this.title = title;
		this.author = author;
		this.price = price;
	}
}
