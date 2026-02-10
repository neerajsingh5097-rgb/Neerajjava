package Thread_1;

//stopping a Thread

class Userthread2 implements Runnable{
	

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
public class thread5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Userthread2 u = new Userthread2();
		Thread t = new Thread(u,"My Radha");
//		t.stop();
		t.start();
		t.start();
		
//		Userthread2 u1 = new Userthread2();
//		Thread t1 = new Thread(u1,"my Krishna");
//		t1.start();
//		
		
		System.out.println("Hello Radha");
		System.err.println(Thread.currentThread().getName());
	}

}
