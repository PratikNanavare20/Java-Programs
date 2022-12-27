package ClassFiles;

import java.util.Scanner;

public class StringMethod03 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :- ");
		String str = sc.next();
		
		//CONVERT STRING IN REVERSE
		char[] res = str.toCharArray();  //Convert String to character string
		for(int i = res.length-1; i>=0; i--)		//iteration
		{
			System.out.print(res[i]);		//Printing reversed string
		}
		
		//CONVERT STRING IN UPPER CASE
		System.out.println("\nThe Upper Case of String is :- "+str.toUpperCase());

	}

}
