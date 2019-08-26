package pack1;

public class W9 {
	
	
	static public void test(Integer o ) 
	{
		System.out.println("from test(Integer)");
	}
	
	static public void test(Object o ) 
	{
		System.out.println("from test(Object)");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			test(10 ) ;  // test( int ) 
	}

}