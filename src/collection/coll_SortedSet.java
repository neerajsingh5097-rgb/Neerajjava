package collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class coll_SortedSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	SortedSet<Integer> ss = new SortedSet<Integer>(); // aisa nhi hota he 
		SortedSet<Integer> ss = new TreeSet<Integer>();
		
//		ss.add(null); // isme phle null add kr skte he , or koi element na ho bas bad me kiya to NullPointException dete he
		ss.add(100);
//		ss.add(null); // run time pr dega NullPointException
		ss.add(99);
		ss.add(58);
		ss.add(120);    // yah sort kr deta he 
		ss.add(125);
		
		System.out.println(ss);
		
		
		
		System.out.println(ss.first());  // firt element dega
		
		System.out.println(ss.last());  // last elements dega
		
	   
	    System.out.println(ss.headSet(120));
	    
	    System.out.println(ss.tailSet(99));
	    
	    System.out.println(ss.subSet(99, 125));
	    
	    System.out.println(ss.comparator());
	}

}
