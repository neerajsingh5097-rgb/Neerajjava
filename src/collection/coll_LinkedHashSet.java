package collection;

import java.util.LinkedHashSet;

public class coll_LinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<Integer> lh= new LinkedHashSet<Integer>();
		
		lh.add(10);
		lh.add(30);
		lh.add(10);
		lh.add(50);  //isme oder bhi vesa rhta he jesa tum dete ho or data unique rhta he, dublicate nhi leta he
		lh.add(140);
		lh.add(5);
		lh.add(null);
		lh.add(null);
		
		System.out.println(lh);
	}

}
