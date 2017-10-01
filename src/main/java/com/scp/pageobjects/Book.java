package com.scp.pageobjects;

public class Book {

	private int bookId;
	private int bookPrice;
	private String bookName;
	private String authorName;
	
	
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public Book(int bookId, int bookPrice, String bookName, String authorName) {
		super();
		this.bookId = bookId;
		this.bookPrice = bookPrice;
		this.bookName = bookName;
		this.authorName = authorName;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookPrice=" + bookPrice
				+ ", bookName=" + bookName + ", authorName=" + authorName + "] \n\n";
	}
	
	
	
	
}
