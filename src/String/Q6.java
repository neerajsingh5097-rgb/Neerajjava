package String;

//count total number of small words from the given string?

public class Q6 {

	public static void main(String[] args) {

		String str = "Hello java geeks HOW are YOU";
		
		int ctr=0;
		int totalNoOfLetters=0;
		int smlLetterCtr=0;
		int capLetterCtr=0;
		int smlWordCtr=0;
		int capWordCtr=0;
		
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
//			System.out.println(str.length()-1);
//			System.out.println(ch);
			
//			System.out.println(i ==str.length()-1);
//			System.out.println(ch == ' ');
			
			
			if(ch == ' ' || i ==str.length()-1) {
				if (totalNoOfLetters ==smlLetterCtr) {
					smlWordCtr++;
				}
				
				if (totalNoOfLetters==capLetterCtr) {
					capWordCtr++;
				}
				
				smlLetterCtr=0;
				capLetterCtr=0;
				totalNoOfLetters=0;
			}else {
				totalNoOfLetters++;
//				small
				if (ch>='a' && ch <='z') {
					smlLetterCtr++;
				}
				
//				capital
				if (ch>='A' && ch<='Z') {
					capLetterCtr++;
				}
			}
		}
		
		System.out.println("Rotal no of cap word; " + capWordCtr);
		System.out.println("Rotal no of small word; " + smlWordCtr);

	}

}
