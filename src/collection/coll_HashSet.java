package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class coll_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> s = new HashSet<String>();
		
//		s.add("UP");
//		s.add("MP");
//		s.add("HP");
//		s.add("MP");
//		s.add("GJ");
		
		s.add("ravi");
		s.add("vijay");
		s.add("ravi");
		s.add("ajay");
		
		
		System.out.println(s);
//		Traversing elements 
		for (String v : s) {
			System.out.println(v);
		}
		Iterator<String> itr =s.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(s);
		
		s.remove("ravi");
		System.out.println(s);
		
		HashSet<String> s1 = new HashSet<String>();
		s1.add("ajay");
		s1.add("gaurav");
		s1.addAll(s1);
		System.out.println(s1);
		s1.removeAll(s1);
		System.out.println(s1);
		
	}

}
