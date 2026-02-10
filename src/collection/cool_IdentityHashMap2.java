package collection;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class cool_IdentityHashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
//		yah to HashMap ke base pr tha 
		
		HashMap<Integer , String> map = new HashMap<>();
		
		Integer i1 = 127;
		Integer i2 = 127;
		
		Integer i3 = 222;
		Integer i4 = 222;
		
		map.put(i1, "Hello");
		map.put(i2, "hii");
		
		
		System.out.println(map);
		
		
		*/
		
//		ab ham IdentityHashMap pr krtehe tab dekho 
		
		IdentityHashMap<Integer , String> map = new IdentityHashMap<>();
		
		Integer i1 = 127;
		Integer i2 = 127;
		
		Integer i3 = 222;
		Integer i4 = 222;
		
		map.put(i3, "Hello");
		map.put(i4, "hii");
		
		
		System.out.println(map);
		
	}

}
