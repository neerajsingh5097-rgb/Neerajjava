package Thread_1;
// use of only Thread()
import java.util.Iterator;

/*
 interface Runnable{
    
    
    public void run();
 }
 
 class Thread implement Runnable{
 
 
          public void start();
  }        
 */


class  UserThread extends Thread{
	public UserThread(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Your thread " + Thread.currentThread().getName() + "  " + i);
			try {
				Thread.sleep(2000);  // ise likhane pr yah kudh
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserThread t1 =new UserThread("my task");
		t1.start();
		
		   System.err.println("Hello world");

	   System.err.println(Thread.currentThread().getName());

	}

}

