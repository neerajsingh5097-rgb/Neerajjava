package Thread_1;
//using Thread(Runnable r)

class Userthread implements Runnable{
	


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

public class thread3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Userthread u = new Userthread();
		Thread t = new Thread(u);
		t.start();
		
//		Userthread u1 = new Userthread();
//		Thread t1 = new Thread(u1);
//		t1.start();
		
		System.out.println("Hello Radha");
		System.err.println(Thread.currentThread().getName());
		

	}

}
