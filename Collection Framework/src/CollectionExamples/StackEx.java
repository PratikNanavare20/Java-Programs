package CollectionExamples;

import java.util.Stack;

public class StackEx 
{

	public static void main(String[] args) 
	{
		Stack s = new Stack();
		s.push("Pratik"); 		//Adding The Data To The Stack
		s.push("Gangadhar");
		s.push("Nanavare");
		System.out.println(s);
		
	/*	s.pop();				//Removing Last Element of The Stack
		System.out.println(s);
		
		s.pop();				//Removing Last Element of The Stack
		System.out.println(s);
	*/
		
		System.out.println(s);
		System.out.println(s.search("Pratik"));	//We are Searching The Value In The Stack
		System.out.println(s.search("Gangadhar"));
		System.out.println(s.search("Nanavare"));
		
				//INDEXING IS IN REVERSE ORDER// 
		
	}

}
