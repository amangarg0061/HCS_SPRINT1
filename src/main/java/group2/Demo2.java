package group2;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo2 
{
	public static void main(String[] args) 
	{
		ArrayList  al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
