//to insert the record till the user presses n
package jdbc_ass1;


import java.io.*;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class question6 {

	public static void main(String[] args) {
		if(dbconnect.connection()==1) {
			  try {
				  System.out.println("connection stablished");
				  PreparedStatement ps = dbconnect.con.prepareStatement("insert into employee values(?,?,?,?,?,?,?,?);");
				  
				  BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
				  
				  do {
					  System.out.println("enter emp id:");  
					  int id=Integer.parseInt(br.readLine());  
					  
					  System.out.println("enter emp first name:");  
					  String fname=br.readLine();  
					  
					  System.out.println("enter emp last name:");  
					  String lname=br.readLine(); 
					  
					  System.out.println("enter salary:");  
					  int  salary=Integer.parseInt(br.readLine());
					  
					  System.out.println("Enter emp joining day :");
					  String  j_date=br.readLine();
						
					  System.out.println("Enter emp department :");
					  String	dept=br.readLine();
					  
					  System.out.println("Enter emp department number :");
						int dep_no=Integer.parseInt(br.readLine());
						
						System.out.println("Enter emp email :");
						 String email=br.readLine();
					  
						 ps.setInt(1,id);
						 ps.setString(2,fname);
						 ps.setString(3,lname);
						 ps.setInt(4,salary);
						 ps.setString(5,j_date);
						 ps.setString(6,dept);
						 ps.setInt(7,dep_no);
						 ps.setString(8,email);
						 
						 int c=ps.executeUpdate();  
						 System.out.println(c+" records affected");	 
						 
					  System.out.println("Enter y to continue or n to break :");
					  String ch = br.readLine();
					  if(ch.startsWith("n")) 
						  break;
					  else 
						  continue;
				  }while(true);
			  }
			  catch(Exception e) {
				  e.printStackTrace();
			  }
			  finally {
				  if(dbconnect.connDestroy()==1) {
						System.out.println("connection closed");
					}
					else {
						System.out.println("connection not closed");
					}
			  }
			
		}

	}

}
