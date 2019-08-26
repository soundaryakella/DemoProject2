package unboxing;

public class W1 {

	public static void main(String[] args) {
		
		Integer i = 10 ; 
		System.out.println("i:" +i);
		int j = i ; //auto-unboxing 
		int k = i.intValue() ; // Object type is un-boxed to primitive 
		System.out.println("J :" +j );
		System.out.println("K : " + k );
	}
	
}