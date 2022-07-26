package by.epam.tr.main;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> books=new ArrayList<Book>();
		books.add(new Book (1,"Harry Potter","Rouling" ,"St. Mark’s Place",2001,450,"usual"));
		books.add(new Book (2,"Harry Potter2", "I'm", "somewhere",2003,452,"unusual"));
		books.add(new Book (3,"Harry Potter3", "He","my home",2005,600,"the best"));
		BookView view = new BookView();
	//	for(Book bk:books) {
	//		view.printBook(bk);
	//	}
		BookLogic logic = new BookLogic();
		List<Book> writers=logic.writeAuthor(books, "He");
		for(Book bk:writers) {
			view.printBook(bk);
		}
		List<Book> publishers = logic.publisher(books, "somewhere");
		for(Book bk:publishers) {
			view.printBook(bk);
		}
		List<Book> publicAfter= logic.publicAfterYear(books, 2001);
		for(Book bk:publicAfter) {
			view.printBook(bk);
		}
	}

}
