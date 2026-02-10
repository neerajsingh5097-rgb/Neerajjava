package String;

public class StringMethod {

	public static void main(String[] args) {

		String str = new String("   Hello GUYS diwali on the way   ");
		String str2 = new String("Hello guys diwali on the way");
		
		String str3="Hello radha rani";
		String str4="Hello radha rani";

		
		System.out.println(str.length());
		System.out.println(str.charAt(6));
		
		System.out.println();
		
		System.out.println("yah string aage piche ke space ko hata deta he :- "+str.trim());
		System.out.println("yah space ke sath prin krta he " + str);
		
		System.out.println("both are string equals :-" + str.equals(str2));
		
		System.out.println();
		
		System.out.println("jan method case ko ignore kr deyta he -;" + str.equalsIgnoreCase(str2));
		
		System.out.println(str3==str4);
		
		System.out.println(str.substring(8));
		System.out.println(str.substring(14, 21));
		
		System.out.println(str.contains("on the"));
		
		System.out.println(str.toUpperCase());
		
		System.out.println(str.toLowerCase());
	}

}
