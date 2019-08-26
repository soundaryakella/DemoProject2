package pack1;

import java.util.ArrayList;
import java.util.ListIterator;

public class col1 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(80);
		al.add(40);
		
		ListIterator<Integer> i = al.listIterator();
		while(i.hasNext())
		{
			System.out.println(i.nextIndex());
		}

	}

}
