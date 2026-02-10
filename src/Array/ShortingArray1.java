package Array;


//Bubble Sort in array using incresing order like 10,40,60,20 => 10,20,40,60

public class ShortingArray1 {

	public static void main(String[] args) {

		int arr[]= {10,40,60,20};
		
//		Bubble sort
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if (arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		System.out.println("Sorted array ");
		for(int x:arr) {
			System.out.print(x + " ");
		}
	}

}
