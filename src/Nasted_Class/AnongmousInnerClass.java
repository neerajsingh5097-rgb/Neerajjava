package Nasted_Class;


interface Runner{
	void m1();
	
	void m2();
	
	void m3();
	void m4();
	
}

public class AnongmousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runner r = new Runner() {
			
			String name = " hii";
			static int id = 44;
			
			@Override
			public void m1() {
				System.out.println(" prin t1");
			}
			
			
			@Override
			public void m2() {
				// TODO Auto-generated method stub
				System.out.println(" prin t2");
			}
			
			@Override
			public void m3() {
				// TODO Auto-generated method stub
				System.out.println(" prin t3");	
			}
			
			@Override
			public void m4() {
				// TODO Auto-generated method stub
				System.out.println(" prin t4");
			}
		};
		
		
		r.m1();
		r.m2();
		r.m3();
		r.m4();
	}

}
