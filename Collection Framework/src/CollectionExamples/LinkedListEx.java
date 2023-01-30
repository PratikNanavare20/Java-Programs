package CollectionExamples;

import java.util.LinkedList;

public class LinkedListEx 
{

	public static void main(String[] args) 
	{
		LinkedList l = new LinkedList();
		l.add("Pratik");			//Adding Element
		l.add("Gangadhar");
		l.add("Nanavare");
		System.out.println(l);
		
		l.addFirst(01);				//Adding Element At First Place
		l.addLast(10);				//Adding Element At Last Place
		System.out.println(l);
		
		l.add("Shantanu");
		l.add(5);
		System.out.println(l);
		
		l.removeFirst();		//Removing First Element	
		l.removeLast();			//Removing Last Element
		System.out.println(l);
		
		l.removeLastOccurrence(10);	//Removing Last Occurence
		System.out.println(l);
	}

}
