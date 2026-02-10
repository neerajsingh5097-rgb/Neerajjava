package Synchronized;

public class InterThreadComm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			AutoMobile autoMobile=new AutoMobile();
			
			Assemble assemble=new Assemble(autoMobile);
			SaleDepart sale=new SaleDepart(autoMobile);
			assemble.start();
			sale.start();

		
	}

}
