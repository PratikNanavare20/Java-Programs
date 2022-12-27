package ClassFiles;

import java.util.Scanner;

public class StringMethod02 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st String :- ");
		String str1 = sc.next();
		
		System.out.println("Enter 2nd String :- ");
		String str2 = sc.next();
		
		//IS THERE STRING 1 IS EXIST IN STRING 2
		System.out.println(str1.contains(str2));
	}
}
