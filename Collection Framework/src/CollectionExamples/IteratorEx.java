package CollectionExamples;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=1;i<=10;i++)
		{
			al.add(i);
		}
		System.out.println(al);
		
		Iterator<Integer> itr = al.iterator(); //creating iterator for arraylist
		while(itr.hasNext())
		{
			Integer i=(Integer)itr.next();  //Fetching the next data from the iterator
			if(i%2==0)
			{
				System.out.println(i);   //We are Printing Even no.
			}
			else
			{
				itr.remove(); ////We are Removing Odd no.
			}
		}
		System.out.println(al);
	}
}
