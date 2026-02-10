package String;

//Coun  total number of char from the given string?
//isme space include nhi hoga
public class Q1 {

	public static void main(String[] args) {
 
		String st = "Hello sir";
		
		System.out.println("total lambai string ki " + st.length());
//		System.out.println(st.substring(0,5));
		
		String str="123";
//		int num = Integer.parseInt(str);
	    System.out.println(str);
		
		int count=0;
//		loop he puri string length
	 for(int i=0;i<st.length();i++) {
//		space na aaye iske liye 
		
		if (st.charAt(i)!=' ') {
			count++;
		}
	}
	 
	 System.out.println("total char in string " + count);

}}
