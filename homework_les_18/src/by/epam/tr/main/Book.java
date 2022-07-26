package by.epam.tr.main;

import java.util.Objects;

public class Book {
	private int id;
	private String name;
	private String author;
	private String PublishingHouse;
	private int year;
	private int pageCount;
	private String  bindingBook;
	public Book() {
		id=0;
		name="";
		author="";
		PublishingHouse="";
		year=0;
		pageCount=0;
		bindingBook="";
	}
	public Book(int id,String name, String author, String PublishingHouse,int year, int pageCount,String bindingBook) {
		this.id=id;
		this.name=name;
		this.author=author;
		this.PublishingHouse=PublishingHouse;
		this.year=year;
		this.pageCount=pageCount;
		this.bindingBook=bindingBook;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublishingHouse() {
		return PublishingHouse;
	}
	public void setPublishingHouse(String publishingHouse) {
		PublishingHouse = publishingHouse;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public String getBindingBook() {
		return bindingBook;
	}
	public void setBindingBook(String bindingBook) {
		this.bindingBook = bindingBook;
	}
	@Override
	public int hashCode() {
		return Objects.hash(PublishingHouse, author, bindingBook, id, name, pageCount, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(PublishingHouse, other.PublishingHouse) && Objects.equals(author, other.author)
				&& Objects.equals(bindingBook, other.bindingBook) && id == other.id && Objects.equals(name, other.name)
				&& pageCount == other.pageCount && year == other.year;
	}
	
}
