package Synchronized;

public class SaleDepart extends Thread {

	AutoMobile autoMobile;
	SaleDepart(AutoMobile autoMobile) {
		this.autoMobile = autoMobile;
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				autoMobile.sale();
				Thread.sleep(2000);
			} catch (Exception e) {
			}
		}
	}
	
}
