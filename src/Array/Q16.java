package Array;
// ise kro ye complete nhi he
//WAP to find prime no, in SDA elements size 8
public class Q16 {

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;}
			
			for(int i=0;i<=n/2;i++) {
				if (n % i == 0) 
					return false;
				
		}
			return true;
	}
	public static void main(String[] args) {
/*
		int arr[]= {1,3,4,5,6,2};
		int cout=0;
		for(int i =0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		

		
		for(int i =0; i<arr.length;i++) {
		int num = arr[i];
		boolean isPrime = true;
	

		
		if (num <=1) {
			isPrime=false;
			
		} else {
           for(int j=2; j<=num/2;j++) {
        	   if(num % j ==0) {
        		   isPrime = false;
        		   
        		   break;
        	   }
           }
		}
		
		if(isPrime) {
			System.out.println(num);
//			System.out.println(cout);
//			cout++;

		}
		}
		
	
//		System.out.println(cout);

		*/
		int arr[] = {10,3,5,20,7,9,11,15};
		
		System.out.println("Prime number in array");
		
		for(int num :arr) {
			if(isPrime(num)) {
				System.out.println(num + " ");
			}
		
		}

	}

}
