package ClassFiles;

import java.util.Scanner;

public class StringMethod {

	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st String :- ");
		String str1 = sc.next();
		
		System.out.println("Enter 2nd String :- ");
		String str2 = sc.next();
		
		//COMPAIR  STRING 1 TO STRING 2 
		System.out.println("If 0 then both string are same :- "+str1.compareToIgnoreCase(str2));
	}
}