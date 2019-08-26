package pack1;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) {
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(20);
		t.add(10);
		t.add(3);
		t.add(10);//no duplicates
		System.out.println(t);//ascending order [3, 10, 20]
		System.out.println(t.descendingSet()); //descending order
		Iterator<Integer> des = t.descendingIterator();//iterating in decesnding
		while(des.hasNext())
		{
			System.out.println(des.next());
		}
	
	}

}
