package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class coll_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			al.add(14+i);
		}
		
		System.out.println(al);
		
		Iterator<Integer> iterator =  al.iterator();
		
		while ( iterator.hasNext()) {
			Integer i =iterator.next();
			
			if (i % 2 ==0) {
				
				iterator.remove();
//				System.out.println(i);
			}
			
		}
		
		System.out.println(al);

	}

}
