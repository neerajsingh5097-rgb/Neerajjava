package Synchronized;

public class AutoMobile {

	int model;
	boolean b=false;
	synchronized public void assemble(int model) throws InterruptedException
	{
		if(b)
		{
			System.out.println("Sorry Sorry Sorry Sale ko chalao.........");
			wait();
		}
		this.model=model;
		System.out.println("Car Assembled : "+this.model);
		b=true;
		notify();
	}

	synchronized public void sale() throws InterruptedException
	{
		if(!b)
		{
			System.out.println("Sorry Sorry Sorry Assemble ko chalao.........");
			wait();
		}
		System.out.println("Sale : "+this.model);
		b=false;
		notify();
	}
}
