package collection;

import java.util.Iterator;
import java.util.Vector;

public class coll_Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vector<String> v = new Vector<String>();
		
		v.add("Rohan");  // yah method list ka he
		
		v.add("Radha");  // yah method list ka he
		v.add("Krishna");  // yah method list ka h
		
		v.add("Sudama");  // yah method list ka h
		
		v.addElement("Nerraj"); // yh medhod vector ka he 
		v.addElement(null);
		System.out.println(v);
		
		/*
		// inko chalana he to niche bale band krne he niche bale chalen he to upr bale band krne he
		///
		

		
		System.out.println(v);
		
//		removing first element using list
		v.removeFirst();
		System.out.println(v);
		
//		removing last element using list
		v.removeLast();
		System.out.println(v);
		
//		removing elements with index
		v.remove(1);  // using vector
		System.out.println(v);
		
//		removing elements 
		v.remove("Radha");  // using vector
		System.out.println(v);	
		
//		removing all elements 
		v.removeAllElements();  // using vector
		System.out.println(v);
		
//		clear all elements 
		v.clear();  // using vector
		System.out.println(v);
		
		*/
		
		
//		To get medhod
		
		String itr=v.firstElement(); // using vector
		System.out.println(itr);
		
		
		System.out.println(v);
		String itr1 =v.elementAt(1); // using vector
		System.out.println(itr1);
		System.out.println(v);

		
		String itr2 =v.get(2); // using vector
		System.out.println(itr2);
		System.out.println(v);
		
		
		String itr3 =v.lastElement(); // using vector
		System.out.println(itr3);
		System.out.println(v);
		
//		Other Method
		
		System.out.println(v.size());
		
		System.out.println(v.capacity());
		
		System.out.println(v.elements());
		
		
	}

}
