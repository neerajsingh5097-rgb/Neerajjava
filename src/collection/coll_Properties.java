package collection;

import java.util.Properties;

public class coll_Properties {
	
  public static void main(String[] args) {
	
	Properties ps = new Properties();
	
	ps.put("URL", "jdbc : mysql://localhost:3306/mydb");
	ps.put("USENAME", "root");
	ps.put("PASSWORD", "root");
  
	
	System.out.println(ps);
  }
}
