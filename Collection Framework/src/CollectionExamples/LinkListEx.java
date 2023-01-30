package CollectionExamples;

import java.util.LinkedList;

public class LinkListEx 
{

	public static void main(String[] args) 
	{
		LinkedList l = new LinkedList();
		l.add(10);				 //Adding Element
		l.add("Pratik");		 //Adding Element
		l.add("Nanavare");		 //Adding Element
		System.out.println(l);
		
		l.addFirst("Shantanu");	 //Adding Element At First Place
		l.addLast(50); 			 //Adding Element At Last Place
		System.out.println(l);
		System.out.println(l.getFirst());	//Retrieving First element
		System.out.println(l.getLast());	//Retrieving First element
		
		l.add(2,"Heena");		//Adding The Data
		System.out.println(l);
		
		l.removeFirst();		//Removing First Element
		l.removeLast();			//Removing Last Element
		System.out.println(l);
		
		l.removeLastOccurrence(10);	//Removing Element Have occurrence at last 
		System.out.println(l);
	}

}
