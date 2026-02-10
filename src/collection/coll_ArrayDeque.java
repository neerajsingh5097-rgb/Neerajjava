package collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class coll_ArrayDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Deque<String> deque = new LinkedList<String>();
		Deque<String> deque = new ArrayDeque<String>();

		
		deque.offer("arvind");
		deque.offer("vimal");
		deque.add("rama");
		
		System.out.println(deque);
		
		deque.offerFirst("jai");
		
		
		System.out.println(deque);
		
		deque.addLast("radhe");  // .offerLast bhi aise hi kam krega
		System.out.println(deque);
		
		System.out.println("After offerFist Traversal.........");
		for (String s : deque) {
			System.out.println(s);
		}
		
		System.out.println(".................................");
		deque.poll();  // pollFirst(); same as poll
		System.out.println(deque);
		
		deque.pollLast();
		System.out.println(deque);
		
		System.out.println("Peak elerment ; " + deque.peek());
		System.out.println("Peak first elerment ; " + deque.peekFirst());
		System.out.println("Peak last elerment ; " + deque.peekLast());

		

	}

}
