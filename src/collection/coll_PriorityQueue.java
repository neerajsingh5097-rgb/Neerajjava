package collection;

import java.util.PriorityQueue;

public class coll_PriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(222);
		pq.add(22);
		pq.offer(2);  // offer bhi add ki trh kam krta he
		pq.add(122);
		pq.add(322);
		pq.add(52);
		pq.add(62);
		pq.add(12);
		pq.add(1);
		pq.add(2322);
		
		System.out.println(pq);

		
	}

}
