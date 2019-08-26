package pack1;

public class W7 {
	
	static public void test(int o ) 
	{
		System.out.println("from test(int)");
	}
	
	static public void test(float o ) 
	{
		System.out.println("from test(float)");
	}
	
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
			test(10 ) ; 
	}

}