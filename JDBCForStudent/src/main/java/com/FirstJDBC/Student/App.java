package com.FirstJDBC.Student;

import java.util.Scanner;

import java.sql.*;


/**
 * Hello world!
 *
 */
public class App 
{
	//Using Method
	static void Insertion()
	{
		try
    	{
			//Establish Connection To SQL											(Database Name)(User Name)(Pass)
    		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info","root","Mysql");
    		if(con.isClosed())
    		{
    			System.out.println("The connection is close");
    		}
    		else
    		{
    			System.out.println("The connection is Established");
    		}
    		
    		System.out.println("Insert Your Data Into Table");
    		//Creating the Insert Statement
    		String q = "insert into student (stdid,stdname,age,phone_no,university) values(?,?,?,?,?)";
    		
			PreparedStatement pstm = con.prepareCall(q);
    		
    		//Insert Record Using Scanner
    		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter Id :- ");
    		int id = sc.nextInt();
    		System.out.println("Enter Name :- ");
    		String name = sc.next();
    		System.out.println("Enter age :- ");
    		int age = sc.nextInt();
    		System.out.println("Enter phone_no :- ");
    		int Phone_no = sc.nextInt();
    		System.out.println("Enter University name :- ");
    		String uni = sc.next();
    		
    		pstm.setInt(1,id);
    		pstm.setString(2,name);
    		pstm.setInt(3,age);
    		pstm.setInt(4,Phone_no);
    		pstm.setString(5,uni);
    		
    		//Executing the query
    		pstm.executeUpdate();
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
			//Establish Connection To SQL											(Database Name)(User Name)(Pass)
    		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info","root","Mysql");
    		if(con.isClosed())
    		{
    			System.out.println("The connection is close");
    		}
    		else
    		{
    			System.out.println("The connection is Established");
    		}
    		
    		System.out.println("Update Your Data Into Table");
			//Creating the Update Statement
			String q = "update student set stdname = ? , age = ? where stdid=?";
			PreparedStatement pstm = con.prepareCall(q);
	    	
			//Insert Record Using Scanner
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Name that you have to change :- ");
			String name = sc.next();
			System.out.println("Enter Age that you have to change :- ");
			int age = sc.nextInt();
			System.out.println("Enter Id where you have to change the Details:- ");
			int id = sc.nextInt();
			
			//Set Values
			pstm.setString(1, name);
			pstm.setInt(2, age);
			pstm.setInt(3, id);
			
			//Execute Update
			pstm.executeUpdate();
			System.out.println("Data Updaated Successfully....!");
			
			//Closing the connection
    		//con.close();
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
			//Establish Connection To SQL											(Database Name)(User Name)(Pass)
    		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info","root","Mysql");
    		if(con.isClosed())
    		{
    			System.out.println("The connection is close");
    		}
    		else
    		{
    			System.out.println("The connection is Established");
    		}
    		
    		System.out.println("Delete Your Data Into Table");
    		//Creating the Delete Statement
    		String q = "delete from student where stdid = ?";
    		PreparedStatement pstm = con.prepareCall(q);
        	
    		//Insert Record Using Scanner
    		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter Id tha you want to delete :- ");
    		int id = sc.nextInt();
    		
    		//Set Values
    		pstm.setInt(1, id);
    		
    		//Execute Update
    		pstm.executeUpdate();
    		System.out.println("Data Deleted Successfully....!");
    		
    		//Closing the connection
    		con.close();	
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
			//Establish Connection To SQL								(Database Name)(User Name)(Pass)			
    		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info","root","Mysql");
    		if(con.isClosed())
    		{
    			System.out.println("The connection is close");
    		}
    		else
    		{
    			System.out.println("The connection is Established");
    		}
    		
    		System.out.println("Display Your Data");
    		//Select Statement
        	String q = "select stdid,stdname,age,phone_no,university from student";
        	PreparedStatement psmt = con.prepareStatement(q);
        	ResultSet rset = psmt.executeQuery();
        	
        	while(rset.next())
        	{
        		int id = rset.getInt(1);
        		String name = rset.getString(2);
        		int age = rset.getInt(3);
        		int no = rset.getInt(4);
        		String Uni = rset.getString(5);
        		
        		System.out.println("Stdid : "+id+" Stdname: "+name+" age: "+age+" Phone_No: "+no +" University: "+Uni);
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
    	
    	
    	/*
        //System.out.println( "Hello World!" );
    	try
    	{
    		//Establish Connection To SQL
    		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info","root","Mysql");
    		if(con.isClosed())
    		{
    			System.out.println("The connection is close");
    		}
    		else
    		{
    			System.out.println("The connection is Established");
    		}
    		/*
    		//Creating the Insert Statement
    		String q = "insert into student (stdid,stdname,age,phone_no,university) values(?,?,?,?,?)";
    		PreparedStatement pstm = con.prepareCall(q);
    		
    		//Set the values for the query
    		
    		pstm.setInt(1,101);
    		pstm.setString(2,"Pratik");
    		pstm.setInt(3,22);
    		pstm.setInt(4,4231545);
    		pstm.setString(5,"Pune");
    		
    		pstm.setInt(1,102);
    		pstm.setString(2,"Shantanu");
    		pstm.setInt(3,21);
    		pstm.setInt(4,5231545);
    		pstm.setString(5,"Pune");
    		*/
    		/*
    		//Insert Record Using Scanner
    		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter Id :- ");
    		int id = sc.nextInt();
    		System.out.println("Enter Name :- ");
    		String name = sc.next();
    		System.out.println("Enter age :- ");
    		int age = sc.nextInt();
    		System.out.println("Enter phone_no :- ");
    		int Phone_no = sc.nextInt();
    		System.out.println("Enter University name :- ");
    		String uni = sc.next();
    		
    		pstm.setInt(1,id);
    		pstm.setString(2,name);
    		pstm.setInt(3,age);
    		pstm.setInt(4,Phone_no);
    		pstm.setString(5,uni);
    		
    		//Executing the query
    		pstm.executeUpdate();
    		System.out.println("The Data Is Inserted Successfully....!");
    		
    		//Closing the connection
    		con.close();
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    	
    	*/
    	/*
		//Creating the Update Statement
		String q = "update student set stdname = ? , age = ? where stdid=?";
		PreparedStatement pstm = con.prepareCall(q);
    	
		//Insert Record Using Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name that you have to change :- ");
		String name = sc.next();
		System.out.println("Enter Age that you have to change :- ");
		int age = sc.nextInt();
		System.out.println("Enter Id where you have to change the Details:- ");
		int id = sc.nextInt();
		
		//Set Values
		pstm.setString(1, name);
		pstm.setInt(2, age);
		pstm.setInt(3, id);
		
		//Execute Update
		pstm.executeUpdate();
		System.out.println("Data Updaated Successfully....!");
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    	*/
    	
    	/*
		//Creating the Delete Statement
		String q = "delete from student where stdid = ?";
		PreparedStatement pstm = con.prepareCall(q);
    	
		//Insert Record Using Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id tha you want to delete :- ");
		int id = sc.nextInt();
		
		//Set Values
		pstm.setInt(1, id);
		
		//Execute Update
		pstm.executeUpdate();
		System.out.println("Data Deleted Successfully....!");
		
		//Closing the connection
    		con.close();
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    	*/
    	/*
    	//Select Statement
    	String q = "select stdid,stdname,age,phone_no,university from student";
    	PreparedStatement psmt = con.prepareStatement(q);
    	ResultSet rset = psmt.executeQuery();
    	
    	while(rset.next())
    	{
    		int id = rset.getInt(1);
    		String name = rset.getString(2);
    		int age = rset.getInt(3);
    		int no = rset.getInt(4);
    		String Uni = rset.getString(5);
    		
    		System.out.println("Stdid : "+id+" Stdname: "+name+" age: "+age+" Phone_No: "+no +" University: "+Uni);
    	}
    	
    	//Closing the connection
		con.close();
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    	*/
    }
}
