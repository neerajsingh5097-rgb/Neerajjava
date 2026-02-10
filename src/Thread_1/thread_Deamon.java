package Thread_1;

class DemonThread extends  Thread{
	@Override
	public void run() {
		System.out.println("demon running .......");
	}
}
public class thread_Deamon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemonThread d1 = new DemonThread();
		d1.setDaemon(true);
		d1.start();

	}

}
