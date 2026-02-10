package Exceptio_1;

public class Ecep_4 {
	
//	isme Exception all type ke exception ko handle kr skta he

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String str =null;
		int arr[]= {1,2};
		try {
		System.out.println("Hello...................1");
		System.out.println("Hello...................2");
//		System.out.println(100/0);
//		System.out.println(str.length());
		System.out.println(arr[5]);
		
		System.out.println("Hello...................3");
		System.out.println("Hello...................4");

		}catch(Exception kuchbhi) {  // yah all types ki error ko handle kr skta he
			System.out.println("parent Exceptio");
			kuchbhi.printStackTrace();
		}
		
		System.out.println("Radha rani");
		System.out.println("Krishna ki jay");
	}

}
