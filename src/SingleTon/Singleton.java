package SingleTon;


class Database{
	public Database() {
		System.out.println("DATABASE");
	}
}
public class Singleton {
   public static void main(String[] args) {
	   
	Database d1 = new Database();
	Database d2 = new Database();
	Database d3 = new Database();
	Database d4 = new Database();
	
	System.out.println(d1);
	System.out.println(d2);
	System.out.println(d3);
	System.out.println(d4);
  }
}
