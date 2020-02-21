package group2;

import java.util.ArrayList;

public class Demo4 
{
	public static void main(String[] args) 
	{
		ArrayList  al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		int i=0;
		while(al.size()>i)
		{
			System.out.println(al.get(i));
			i++;
		}
	}

}
