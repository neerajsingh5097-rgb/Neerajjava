package collection;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

class Book implements Comparable<Book>{
	private int bookId,page;
	private String author , name;
	public Book(int bookId, int page, String author , String name) {
		super();
		this.bookId = bookId;
		this.page = page;
		this.author = author;
		this.name = name;
	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return this.bookId-o.bookId;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", page=" + page + ", author=" + author + ", name=" + name + "]";
	}
	

	
	
}

public class coll_comparable {
	
    public static void main(String[] args) {
    	
    	LinkedList<Book> list = new LinkedList<>();
    	Book b1 = new Book(1,433,"Anshu","JAVA");
    	
    	list.add(b1);
    	
    	list.add(new Book(4563, 333, "Anshu" , "C++"));
    	list.add(new Book(4563, 333, "Putin" , "HTML"));
    	list.add(new Book(63, 333, "Kabir" , "C"));
//    	list.add(new Book(3, 333, "Vinay" , "CSS"));
//    	list.add(new Book(41, 333, "Anshu" , "C++"));
//    	list.add(new Book(463, 333, "Anshu" , "C++"));
//    	list.add(new Book(13, 333, "Anshu" , "C++"));
    	System.out.println(list);
    	
    	// shorting the list
    	
    	Collections.sort(list);
    	System.out.println(list);
    	
	
   }
}
