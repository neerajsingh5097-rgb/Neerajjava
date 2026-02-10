package collection;

import java.util.Enumeration;
import java.util.Vector;

public class coll_Enumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v = new Vector<>();
		
		for (int i = 0; i < 10; i++) {
			v.add(14+i);
		}
		
		System.out.println(v);
		
		Enumeration<Integer> e = v.elements();
		
		while (e.hasMoreElements()) {
			Integer i = (Integer) e.nextElement();
			
			if(i % 2 ==0)
			System.out.println(i);
		}

	}

}
