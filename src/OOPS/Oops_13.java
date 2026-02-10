package OOPS;

//abstraction use 
//abstraction class

/*
abstract class Carr{
	public abstract void trunOnEnghine();
	 
	public abstract void trunOffEnghine() ;
	
	public void print() {                // is me abstract non abstract  mathod bhi ho jate he
		System.out.println("My carr");	
	}

}

class Farari extends Carr{
	@Override
	public void trunOnEnghine() {
		System.out.println("trun On Engine");
		
	}
	
	@Override
	public void trunOffEnghine() {
		System.out.println("trun On Engine");		
	}
}

public class Oops_13 {

	public static void main(String[] args) {

		Farari f1 = new Farari();
		
		f1.trunOnEnghine();
		f1.trunOffEnghine();
		f1.print();
	}

}

*/

//interfaces

interface Carr{
	public abstract void trunOnEngine();   // ise niche likha he us tarike se likh skte  he
//	 void trunOnEngine();   // by defolt usne abstract kr diya he 
	
	void trunOffEngine();
	
	
	
	
	final int a = 10;
	
	 String NAME_BOY = "Kana";   // isme hamne na hi public static na hi final lagaya he 
	 public static final String NAME_GIRL = "Radha rani";       // kyoki by defoult sab  le liya he isne 
		
	
}

interface Farari extends Carr{      // one interface ko dusare interface ki properties ko lena he to eextends key word ka use krte he 
	void device();
	
}


//jab class ko interface ki properties ko lena he to ham implements key word ka us kthe he

class SUV implements Carr,Farari{
	@Override
	public void trunOnEngine() {
		System.out.println("Trun on engine");
	}
	
	@Override
	public void trunOffEngine() {
		// TODO Auto-generated method stub
		System.out.println("Trun Off engine");

	}
	
	@Override
	public void device() {
  
		System.out.println("many fuction are abvalible he ");

	}
}

public class Oops_13 {

	public static void main(String[] args) {

		SUV s1=new SUV();
		s1.trunOnEngine();
		s1.trunOffEngine();
		s1.device();
		System.out.println(Carr.a);
		System.out.println(Carr.NAME_BOY);
		System.out.println(Carr.NAME_GIRL);
		
	}

}
