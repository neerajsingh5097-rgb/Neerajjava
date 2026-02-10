package Synchronized;


/*
class Database{
	private Database() {
		
	}
	
	private static Database intanse;
	
	public static Database getIntanse() {
		if(intanse == null) {
			intanse = new Database();
		}
		return intanse;
	}

}

public class SingletonSynchronized extends Thread {

	public void run() {
		for(int i=0;i<3;i++) {
			Database obj = Database.getIntanse();
			System.out.println(obj + "  ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingletonSynchronized t1 = new SingletonSynchronized();
		SingletonSynchronized t2 = new SingletonSynchronized();
		SingletonSynchronized t3 = new SingletonSynchronized();
		SingletonSynchronized t4 = new SingletonSynchronized();
		SingletonSynchronized t5 = new SingletonSynchronized();
		SingletonSynchronized t6 = new SingletonSynchronized();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();

	}

}
*/

/*
yah upr bale ka output he 

 Synchronized.Database@451f2553  
Synchronized.Database@451f2553  
Synchronized.Database@451f2553  
Synchronized.Database@451f2553  
Synchronized.Database@3089da7    isme yah alh aa rha he isme 2 thread ghus gye  he 
Synchronized.Database@451f2553  
Synchronized.Database@451f2553  
Synchronized.Database@451f2553  
Synchronized.Database@451f2553  
Synchronized.Database@451f2553  
Synchronized.Database@451f2553  
Synchronized.Database@451f2553  
Synchronized.Database@451f2553  
Synchronized.Database@451f2553  
Synchronized.Database@451f2553  
Synchronized.Database@451f2553  
Synchronized.Database@451f2553  
Synchronized.Database@451f2553 

*/

//Static Synchronized

class Database{
	private Database() {
		
	}
	
	private static Database instance;
	
	public static Database getInstance() {
		
		if(instance ==null) {
			synchronized (Database.class) {   //Static Synchronized bhi bolte he
				if(instance == null) {
					instance = new Database();   
				}
			}
			
		}
		return instance;
	}

}

public class SingletonSynchronized extends Thread {

	public void run() {
		for(int i=0;i<3;i++) {
			Database obj = Database.getInstance();
			System.out.println(obj + "  ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingletonSynchronized t1 = new SingletonSynchronized();
		SingletonSynchronized t2 = new SingletonSynchronized();
		SingletonSynchronized t3 = new SingletonSynchronized();
		SingletonSynchronized t4 = new SingletonSynchronized();
		SingletonSynchronized t5 = new SingletonSynchronized();
		SingletonSynchronized t6 = new SingletonSynchronized();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();

	}

}
