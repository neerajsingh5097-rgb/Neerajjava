package Thread_1;
/*
class Userthread6 extends Thread{
	
	public Userthread6(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}

	@Override
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println(" Your thread : " + Thread.currentThread().getName() + "  " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class thread_class_method {

	public static void main(String[] args) throws InterruptedException {  // isme throws ka use kiya he
		// TODO Auto-generated method stub

		Userthread6 u1 = new Userthread6("Radha-1");
		Userthread6 u2 = new Userthread6("Radha-2");
		Userthread6 u3 = new Userthread6("Radha-3");
		
		u1.start();
		u1.join(); // with using throws declerection
		
		u2.start();
		u2.join();
		
		u3.start();
		u3.join();
		
		System.out.println("hello world");
	}

}
*/
class Userthread6 extends Thread{
	
	public Userthread6(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}

	@Override
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println(" Your thread : " + Thread.currentThread().getName() + "  " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class thread_class_method {

	public static void main(String[] args)  {  
		// TODO Auto-generated method stub

		Userthread6 u1 = new Userthread6("Radha-1");
		Userthread6 u2 = new Userthread6("Radha-2");
		Userthread6 u3 = new Userthread6("Radha-3");
		
		u1.start();
		try {  // using the try catch delecleration
			u1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		u2.start();
		try {
			u2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		u3.start();
		try {
			u3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("hello world");
	}

}
