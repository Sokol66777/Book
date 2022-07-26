package by.epam.tr.main;

import java.util.ArrayList;
import java.util.List;

public class BookLogic {

	public List<Book> writeAuthor(List<Book> bks,String nameWriter){
		List<Book> books =new ArrayList<Book>();
		for(Book bk:bks) {
			if(bk.getAuthor().equals(nameWriter)) {
				books.add(bk);
			}
		}
		return books;
	}
	
	public List<Book> publisher(List<Book> bks,String namePublisher){
		List<Book> publisher = new ArrayList<Book>();
		for(Book bk:bks) {
			if(bk.getPublishingHouse().equals(namePublisher)) {
				publisher.add(bk);
			}
		}
		return publisher;
	}
	public List<Book> publicAfterYear(List<Book> bks, int year){
		List<Book> publicAfter =new ArrayList<Book>();
		for(Book bk:bks) {
			if(bk.getYear()>year) {
				publicAfter.add(bk);
			}
		}
		return publicAfter;
	}
	
}

