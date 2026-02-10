package Thread_1;

//using Thread (String name)

class UserThread2 extends Thread{
	public UserThread2(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}

	@Override
	public void run() {
		
		for(int i=1;i<=3;i++) {
		System.err.println("Krishna " + Thread.currentThread().getName()+"  "+ i);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
}
public class thread2 {

	public static void main(String[] args) {
		UserThread2 t1 = new UserThread2("My Radha");
		t1.start();

		System.out.println("Hello Radha rani");
		System.out.println(Thread.currentThread().getName());
	}

 }
