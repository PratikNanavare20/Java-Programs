package CollectionExamples;

import java.util.LinkedList;
import java.util.ListIterator;


public class ListIteratorEx 
{

	public static void main(String[] args) 
	{
		LinkedList<String> l = new LinkedList<String>();
		l.add("Raj");		//Adding Value
		l.add("Pratik");
		l.add("Neha");
		l.add("Abhi");
		System.out.println(l);
		
		ListIterator<String> itr = l.listIterator();
		while(itr.hasNext())
		{
			String s = (String)itr.next();
			if(s.equals("Raj"))
			{
				itr.remove(); 			 //removing
			}
			else if(s.equals("Pratik"))
			{
				itr.add("Shantanu");	//Adding Value
			}
			else if(s.equals("Abhi"))
			{
				itr.set("Bhushan");		//Replacing Value
			}
		}
		System.out.println(l);
	}

}
