package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class coll_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

				LinkedList<String> ll = new LinkedList<String>();
				ll.add("Ravi");
				ll.add("Vijay");
				ll.add("Ravi");
				ll.add("Ajay");
				
				System.out.println(ll);
				
				// Adding an element at the first position
				ll.addFirst("Lokesh");
				System.out.println(ll);

				// Adding an element at the last position
				ll.addLast("Harsh");
				System.out.println(ll);

				// Removing first element from the list
				ll.removeFirst();
				System.out.println(ll);

				// Removing last element from the list
				ll.removeLast();
				System.out.println(ll);

//				 Removing first occurrence of element from the list
				ll.removeFirstOccurrence("Ravi");
				System.out.println(ll);

				// Removing last occurrence of element from the list
				ll.removeLastOccurrence("Ravi");
				System.out.println(ll);


				Iterator<String> itr = ll.iterator();
				while (itr.hasNext()) {
					System.out.println(itr.next());
				}
				System.out.println("-----------------");
				// Traversing the list of elements in reverse order
				Iterator i = ll.descendingIterator();
				while (i.hasNext()) {
					System.out.println(i.next());
				}



	}

}
