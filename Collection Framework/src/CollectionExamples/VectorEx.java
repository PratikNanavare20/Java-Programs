package CollectionExamples;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx 
{

	public static <E> void main(String[] args) 
	{
		Vector<Integer> v = new Vector<Integer>();
		
		System.out.println(v.capacity());		//checking the current capacity of the vector 
		for(int i = 1;i<=10;i++)
		{
			v.addElement(i);					//Add the value to the vector
			System.out.println(i);
		}
		System.out.println(v);
		
		Enumeration<Integer> e = v.elements();
		while(e.hasMoreElements())
		{
			Integer i = (Integer)e.nextElement();
			if(i%2==0)
			{
				System.out.println(i);			//It's Even
			}
			else
			{
				v.remove(i);					//Remove Even No.
				System.out.println(i);			//It's Odd
			}
		}
		System.out.println(v);
	}

}
