package pack1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
public class col {
public static void main(String[] args) {
			ArrayList<Integer> al=new ArrayList<Integer>();
			al.add(10);
			al.add(300);
			al.add(30);
			System.out.println(al);
			System.out.println(al.get(1)); //get()
			for(int i=0;i<al.size();i++)   //normal for loop
			{
				System.out.println(al.get(i));	
			}
			for(Integer a:al)  //for-each loop
			{
				System.out.println(a);
			}
			Iterator<Integer> it = al.iterator(); //Iterator //copy will be created
			while(it.hasNext())
					{
				      System.out.println(it.next());
					}
			//Iterator disadvantage-can't reverse, can't modify the coll using iterator
			ListIterator<Integer> i = al.listIterator();
			{
				System.out.println(i.hasNext());
				System.out.println(i.hasPrevious());
				while(i.hasNext())
				{
				System.out.println(i.next()); //10 300 30
				}
				while(i.hasPrevious())
				{
					System.out.println(i.previous());// 30 300 10
				}
			}
			System.out.println(al);//[10, 300, 30]
			Collections.sort(al);
			System.out.println(al);//[10, 30, 300]
			Collections.reverse(al);
			System.out.println(al);//[300, 30, 10]
			
			
			
	}
}


	

