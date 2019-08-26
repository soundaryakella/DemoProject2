package pack1;

import javax.crypto.AEADBadTagException;

public class W6 {
	
	
	static public void test(int i ) {
		// TODO Auto-generated method stub
		System.out.println("from test(int) ");
	}
	
	static public void test(Integer i ) {
		// TODO Auto-generated method stub
		System.out.println("from test(Integer) ");
	}
	
	public static void main(String[] args) {
		
		test(   Integer.valueOf(10)   ) ; 
		
	}

}


