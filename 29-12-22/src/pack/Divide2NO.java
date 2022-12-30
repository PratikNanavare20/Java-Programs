/*
Question :- 
		WAP where you take input of Two numbers (i,j) from the user and 
divide the first number with second number include Exception Handaling mechanism.
*/

package pack;

import java.util.Scanner;

public class Divide2NO 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("First Number Is :- ");
		int i = sc.nextInt();
		System.out.println("Second Number Is :- ");
		int j = sc.nextInt();
		try
		{
			System.out.println("The Quotient of Division is :- "+i/j);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}