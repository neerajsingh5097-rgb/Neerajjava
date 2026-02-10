package Exceptio_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Q2 {
//Q1 ka solustion he 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		
		try (Scanner sc = new Scanner(System.in);FileInputStream fin = new FileInputStream("abc.text");){
			
			System.out.println("Hello.......1");
			System.out.println("Hello........2");
			System.out.println(100/0);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
//		finally {
//			if (fin != null) {
//				try {
//					fin.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			
//			if (sc != null) {
//				sc.close();
//			}
//		}
		
		System.out.println("radhe radhe ji");
	}

}
