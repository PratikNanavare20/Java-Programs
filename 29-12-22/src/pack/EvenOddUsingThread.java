/*
Question :- 
		Create Thread to find if the number is Even or odd.
*/

package pack;

import java.util.Scanner;

public class EvenOddUsingThread 
{

	public static void main(String[] args) 
	{
		MyThread m=new MyThread();
		m.start();
	}
}
class MyThread extends Thread
{
	public void run() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int no=sc.nextInt();
		if(no%2==0)
		{
			System.out.println("The "+no+" Number is Even");
		}
		else
		{
			System.out.println("The "+no+" Number is Odd");
		}
	}
}