package Excutor_Api;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
	private String name;

	public Task(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {e.printStackTrace();	}
			System.out.println(name + "===" + i);
		}

	}
}

public class threadpool {

	public static void main(String[] args) {

				Runnable r1 = new Task("task 1");
				Runnable r2 = new Task("task 2");
				Runnable r3 = new Task("task 3");
				Runnable r4 = new Task("task 4");
				Runnable r5 = new Task("task 5");
				Runnable r6 = new Task("task 6");
				Runnable r7 = new Task("task 7");
				Runnable r8 = new Task("task 8");
				Runnable r9 = new Task("task 9");
				Runnable r10= new Task("task 10");
				Runnable r11= new Task("task 11");
				Runnable r12= new Task("task 12");
				Runnable r13= new Task("task 13");
				Runnable r14= new Task("task 14");
				Runnable r15= new Task("task 15");
				Runnable r16= new Task("task 16");
				Runnable r17= new Task("task 17");
				

				System.out.println("hello1");
				// threads as the fixed pool size(Step 2)
				ExecutorService pool = Executors.newFixedThreadPool(5);
				
				// passes the Task objects to the pool to execute (Step 3)
				pool.execute(r1);
				pool.execute(r2);
				pool.execute(r3);
				pool.execute(r4);
				pool.execute(r5);
				pool.execute(r6);
				pool.execute(r7);
				pool.execute(r8);
				pool.execute(r9);
				pool.execute(r10);
				pool.execute(r11);
				pool.execute(r12);
				pool.execute(r13);
				pool.execute(r14);
				pool.execute(r15);
				pool.execute(r16);
				pool.execute(r17);
				
				
				pool.shutdown();

				System.out.println("hello1");
		
	}

}
