package CollectionExamples;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;

public class BookInfoUsingLIstIterator 
{

	public static void main(String[] args) 
	{
		/*
		USING LINKEDLIST
		
		LinkedList<String> l = new LinkedList<String>(); 
		l.add("C");
		l.add("CPP");
		l.add("JAVA");
		l.add("CORE JAVA");
		l.add("Advance Java");
		l.add("Python");
		l.add("PHP");
		l.add("Django");
		l.add(".net");
		l.add("English");
		
		System.out.println(l);
		
		ListIterator<String> itr = l.listIterator();
		while(itr.hasNext())
		{
			String s = (String)itr.next();
			if(s.equals("CORE JAVA"))
			{
				itr.set("DBMS");
			}
		}
		System.out.println(l);*/
		
		//USING HashMap
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1 , "C");					//Adding Key And Value
		map.put(2 , "CPP");
		map.put(3 , "JAVA");
		map.put(4 , "CORE JAVA");
		map.put(5 , "Advance Java");
		map.put(6 , "Python");
		map.put(7 , "PHP");
		map.put(8 , "Django");
		map.put(9 , ".net");
		map.put(10 , "English");  
		
		for(Map.Entry m: map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		map.replace(4,"XYZ");				//Replacing The 4th Key Value
		System.out.println("After Replacing The 4th Element");
		
		
		for(Map.Entry m: map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
