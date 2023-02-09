package com.LibraryManagement.JDBCProjectForLibraryMang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	static void Insertion()
	{
		
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management", "root", "Mysql");
			if(con.isClosed())
			{
				System.out.println("The connection is closed");
			}
			else
			{
				System.out.println("The connection is Established");
			}
			
			System.out.println("Inserting Your Data");
			//Creating the Insert Statement
    		String q = "insert into books (Book_Id,Book_Name,Book_Prize) values(?,?,?)";
    		
			PreparedStatement pt = con.prepareCall(q);
    		
    		//Insert Record Using Scanner
    		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter Book Id :- ");
    		int id = sc.nextInt();
    		System.out.println("Enter Book Name :- ");
    		String name = sc.next();
    		System.out.println("Enter Book Prize :- ");
    		int prize = sc.nextInt();
    		
    		pt.setInt(1,id);
    		pt.setString(2,name);
    		pt.setInt(3,prize);
    		
    		//Executing the query
    		pt.executeUpdate();
    		System.out.println("The Data Is Inserted Successfully....!");
    		
    		//Closing the connection
    		con.close();	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	static void Updation()
	{
		
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management", "root", "Mysql");
			if(con.isClosed())
			{
				System.out.println("The connection is closed");
			}
			else
			{
				System.out.println("The connection is Established");
			}
			
			System.out.println("Updating Your Data");
			//Creating the Insert Statement
    		String q = "update Books set Book_Name = ? , Book_Prize = ? where Book_Id=?";
    		
			PreparedStatement pt = con.prepareCall(q);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Book Name That you Want to change :- ");
			String name = sc.next();
			System.out.println("Enter Book Prize That you want to change :- ");
			int prize = sc.nextInt();
			System.out.println("Enter Book Id where you want to change info :- ");
			int id = sc.nextInt();
			
			pt.setString(1,name);
			pt.setInt(2, prize);
			pt.setInt(3, id);
			
			pt.executeUpdate();
			System.out.println("The Data Is Updated Successfully....!");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	static void Deletion()
	{
		
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management", "root", "Mysql");
			if(con.isClosed())
			{
				System.out.println("The connection is closed");
			}
			else
			{
				System.out.println("The connection is Established");
			}
			
			System.out.println("Deleting Your Data");
			//Creating the Insert Statement
    		String q = "delete from Books where Book_Id = ?";
    		
			PreparedStatement pt = con.prepareCall(q);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Book Id the you want to delete :- ");
			int id = sc.nextInt();
			
			pt.setInt(1, id);
			
			pt.executeUpdate();
			System.out.println("The Data Is Deleted Successfully....!");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	static void Display()
	{
		
		try
    	{
			//Establish Connection To SQL											 (Database Name)    (User Name) (Pass)
    		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","Mysql");
    		if(con.isClosed())
    		{
    			System.out.println("The connection is close");
    		}
    		else
    		{
    			System.out.println("The connection is Established");
    		}
    		
    		System.out.println("Displaying Your Data");
    		//Select Statement
        	String q = "select Book_Id,Book_Name,Book_Prize from Books";
        	PreparedStatement pt = con.prepareStatement(q);
        	ResultSet rset = pt.executeQuery();
        	
        	while(rset.next())
        	{
        		int id = rset.getInt(1);
        		String name = rset.getString(2);
        		int prize = rset.getInt(3);
        	
        		
        		System.out.println("Book Id : "+id+" Book Name: "+name+" Book_Prize: "+prize);
        	}
        	
        	//Closing the connection
    		con.close();
        }
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
	}
	
	static void operation()
	{	
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your Choise :-  1 : Insertion, 2 : Updation, 3 : Deletion, 4 : Display ");
			int c = sc.nextInt();
			
			switch(c)
			{
				case 1: Insertion();
				break;
				
				case 2: Updation();
				break;
				
				case 3: Deletion();
				break;
				
				case 4: Display();
				break;
				
				default:System.out.println("Invalid Choice");
				break;
			}
	}
	
    public static void main( String[] args )
    {
    	operation();
        //System.out.println( "Hello World!" );
    }
}
