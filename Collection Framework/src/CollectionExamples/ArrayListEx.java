package CollectionExamples;

import java.util.ArrayList;

public class ArrayListEx 
{

	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(10);				//Adding Value
		al.add("Pratik");
		al.add("Nanavare");
		System.out.println(al);
		al.add(20);
		System.out.println(al);
		al.remove(2);			//Removing 2nd Index Element
		System.out.println(al);
		
		ArrayList al2 = new ArrayList();
		al2.add(50);
		al2.addAll(al);  		//Adding All The Element of Another Array
		System.out.println(al2);
	}

}
