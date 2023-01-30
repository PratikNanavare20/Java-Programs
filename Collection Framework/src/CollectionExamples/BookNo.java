package CollectionExamples;

import java.util.HashMap;
import java.util.Map;

public class BookNo 
{

	public static void main(String[] args) 
	{
		HashMap<Integer,String> h = new HashMap<Integer,String>();
		h.put(101, "JAVA");				//Adding Key and value
		h.put(102, "C");
		h.put(103, "CPP");
		h.put(104, "Python");
		h.put(105, ".net");
		
		for(Map.Entry m: h.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		h.replace(103,"CORE JAVA");		//Replacing 103rd Key value
		System.out.println("After Replacing The 3rd Element");
		
		for(Map.Entry m: h.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
