package CollectionExamples;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx 
{

	public static void main(String[] args) 
	{
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(101, "Pratik");			//Adding Keys And Values
		map.put(102, "Abhi");
		map.put(103, "Mayur");
		map.put(103, "Mayur"); //Duplicate key is not allowed
		map.put(104, "Shantanu");   
		
		for(Map.Entry m: map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
