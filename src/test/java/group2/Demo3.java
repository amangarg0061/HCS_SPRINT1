package group2;

import java.util.ArrayList;

public class Demo3
{
	public static void main(String[] args) 
	{
		ArrayList  al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}

}
}
