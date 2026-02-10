package AutoBoxing;

public class autoBoxing {

	public static void main(String[] args) {

		/*
		int n=33;
		
		
		Integer i =new Integer(433);
		
		Integer i2 = n; // boxing 
		
		int n2 = i; // un-boxing
	
      // is kam ko krne ke liye kuch niche keyword use kiye

		*/
		
		/*
		
		int n=33;
		
		
		Integer i =new Integer(433);
		
		Integer i2 =Integer.valueOf(n); // boxing 
		
		int n2 = i.intValue(); // un-boxing
		
		*/
		
//		jb jdk 1.5 aaya to ye problem solve ho gyi
		

		int n=33;
		
		Integer i =new Integer(433);
		
		Integer i2 = n; // Auto boxing 
		
		int n2 = i; //Auto  un-boxing
	
		
		System.out.println(i);
		System.out.println(n);
		
	}

}
