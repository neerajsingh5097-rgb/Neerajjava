package Nasted_Class;

public class LocalInneerClass {

	public static void main(String[] args) {

		String name ="Hii";
		int id =44;
//		public static class Inner5{
	 class Inner5{
			String name2 ="Radha ";
			static int id2 = 121;
			
			public void func () {
				System.out.println(name);
				System.out.println(name2);
				System.out.println(id);

				System.out.println(id2);

			}
		}
		
		Inner5 iner = new Inner5();
		iner.func();
	}

}
