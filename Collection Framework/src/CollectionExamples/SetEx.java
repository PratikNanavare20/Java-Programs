package CollectionExamples;

import java.util.TreeSet;

public class SetEx 
{

	public static void main(String[] args) 
	{
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("E");	//Adding Value
		ts.add("B");
		ts.add("A");
		ts.add("F");
		ts.add("C");
		ts.add("D");
		System.out.println(ts);
		
		System.out.println(ts.first()); // [A]
		System.out.println(ts.last()); // [F]
		System.out.println(ts.headSet("D")); // [A,B,C]
		System.out.println(ts.tailSet("D")); // [D,E,F]
		System.out.println(ts.subSet("B","E")); // [B,C,D]
	}

}
