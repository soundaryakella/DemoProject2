package pack1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class set {

	public static void main(String[] args) {
		Set<Integer> s=new HashSet<Integer>();
		s.add(20);
		s.add(60);
		s.add(10);
		s.add(20);
		System.out.println(s);
		for(Integer f:s)//for - each to access
		{
			System.out.println(f);
		}
		Iterator<Integer> i = s.iterator();//iterator to access 
		{
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
		}
		//no sorting
		//how removes duplicates bcoz equals & hashcode
		//no index
		

	}

}
