package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Map_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(1,"Vikash","Male", 20, 43530);
		Employee e2 = new Employee(55,"Lokesh","Male", 20, 43530);
		Employee e3 = new Employee(101,"Abhi","Male", 20, 43530);
		Employee e4 = new Employee(31,"Anoop","Male", 20, 43530);
		Employee e5 = new Employee(61,"Vinay","Male", 20, 43530);
		Employee e6 = new Employee(1,"Vikash","Male", 20, 900000);


		
//		Map<Integer,Employee> mapOfEmps = new HashMap<Integer, Employee>();
		
//		ham jis oder me dal rhe he us order me nhi mil rha he to is liye LInkedHashMap
		
//		Map<Integer,Employee> mapOfEmps = new LinkedHashMap<Integer, Employee>();
		
//		hame sort order me dalana he tab SortedMap ka use kre ya fir TreeMap ka
		
		Map<Integer,Employee> mapOfEmps = new TreeMap<Integer, Employee>();
		                   // or
//		SortedMap<Integer,Employee> mapOfEmps = new TreeMap<Integer, Employee>();
		
		mapOfEmps.put(e1.getId() ,e1 );
		mapOfEmps.put(e2.getId() ,e2 );
		mapOfEmps.put(e3.getId() ,e3 );
		mapOfEmps.put(e4.getId() ,e4 );
		mapOfEmps.put(e5.getId() ,e5 );
		mapOfEmps.put(e6.getId() ,e6 );
		
		System.out.println(mapOfEmps);
		
		System.out.println(mapOfEmps.get(55));
		
		mapOfEmps.remove(55);
	   System.out.println(mapOfEmps);
	}

}
