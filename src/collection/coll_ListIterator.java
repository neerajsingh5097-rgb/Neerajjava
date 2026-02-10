package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class coll_ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			al.add(14+i);
		}
		
		System.out.println(al);
		
		
		ListIterator<Integer> LI = al.listIterator();
		
		while(LI.hasNext()) {
			Integer i = LI.next();
			if (i % 2==0) {
				LI.remove();
				
				
			}else {
				LI.set(i+2);
			}
		}

		System.out.println(al);
	}

}
