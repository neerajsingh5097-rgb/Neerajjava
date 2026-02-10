package collection;

import java.util.TreeSet;

public class coll_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> ss = new TreeSet<Integer>();
		
		
		
		ss.add(10);
		ss.add(50);
		ss.add(5);
		ss.add(0);
		ss.add(11);
		ss.add(501);
		ss.add(53);
		ss.add(23);
		ss.add(111);
		ss.add(15);
		ss.add(56);
		ss.add(140);
		ss.add(105);
		ss.add(510);
		ss.add(59);
		ss.add(90);
		ss.add(121);
		ss.add(501);
		ss.add(53);
		ss.add(23);
		ss.add(1111);
		ss.add(153);
		ss.add(568);
		ss.add(140);
		System.out.println(ss);
		
		System.out.println(ss.descendingSet());
		
       System.out.println(ss.first());  // firt element dega
		
		System.out.println(ss.last());  // last elements dega
		
	   
	    System.out.println(ss.headSet(140));
	    
	    System.out.println(ss.tailSet(59));
	    
	    System.out.println(ss.subSet(15, 153));
	    
	    System.out.println(ss.comparator());
		

	}

}
