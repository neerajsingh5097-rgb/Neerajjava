package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_1_ {
	
	/*
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();  // alll types data ko store kr leta he
		
		al.add(10);
		al.add(12.2);        
		al.add("Shiva");
		al.add('A');
		al.add(true);
		
		System.out.println(al);
	}
	
	*/
	
	/*
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();  // yah interger values ko store krti he 
	
	    al.add(10);
	    al.add(12);
	    al.add(null);
	    
	}
	
	*/
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated meth

				ArrayList<String> list = new ArrayList<>();// Creating arraylist
				list.add("Ravi");// Adding object in arraylist
				list.add("Vijay");
				list.add("Ruvi");
				list.add("Ajay");

				System.out.println(list);

				// changing the element
				list.set(1, "Dates");

				System.out.println(list);

				// Traversing list through for-each loop
				for (String n : list) {
					System.out.println(n);
				}

//				// Sorting the list
				Collections.sort(list);
				
				System.out.println(list);

//				// Removing specific element from arraylist
				list.remove("Ruvi");
				System.out.println(list);

//				// Removing element on the basis of specific position
				list.remove(0);
				System.out.println(list);

				ArrayList<String> al2 = new ArrayList<>();
				al2.add("Vikas");
				al2.add("Unnati");
				al2.add("Pragati");
				al2.add("Shanti");
				al2.add("Ravi");
//				// Adding new elements to arraylist
				list.addAll(al2);
				System.out.println(list);
//				// Removing all the new elements from arraylist
				list.removeAll(al2);
				System.out.println(list);
				list.clear();
				System.out.println(list);
				System.out.println(list.isEmpty()); // check empty

			

		
	}

	
	
	
}