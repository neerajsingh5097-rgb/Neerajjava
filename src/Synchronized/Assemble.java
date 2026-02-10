package Synchronized;

public class Assemble extends Thread {

	AutoMobile autoMobile;

	Assemble(AutoMobile autoMobile) {
		this.autoMobile = autoMobile;
	}

	public void run() {
		int modelNo = 2000;
		while (true) {
			try {
				autoMobile.assemble(modelNo);
				Thread.sleep(2000);
			} catch (Exception e) {}
			modelNo++;
		}
	}
}
