/*
Question :- 
		WAP take the input of age from the user If the age is above
18 print "You are eligible to vote" else throw an exception that 
"age is not correct".
*/

package pack;

import java.io.IOException;
import java.util.Scanner;

public class VotingCriteria {

	public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age :- ");
		int age = sc.nextInt();
		if(age > 18)
		{
			System.out.println("You are eligible for vote");
		}
		else
		{
			throw new IOException(" Age is not correct "); //We are throwing an Exception
		}
	}
}
