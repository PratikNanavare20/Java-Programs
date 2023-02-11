import java.util.Scanner;

//Creating A Salary Increment by 10% Program using Thread
class Employee extends Thread
{
	public void run()
	{
		//Accepting value using Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary of Employee :- ");
		int sal = sc.nextInt();
		System.out.println("Salary of the Employee is :- "+sal);
		
		//Calculating Increment
		int inc = sal/100 *10;
		System.out.println("Salary Increamented by 10% is  :- "+inc);
		
		//Total salary
		int fin_sal = sal + inc;
		System.out.println("After Adding Increamentation Salary is  :- "+fin_sal);
		
	}
}

public class UseEmployee 
{

	public static void main(String[] args) 
	{
		Employee e = new Employee();
		//It going to start Threading
		e.start();

	}

}
