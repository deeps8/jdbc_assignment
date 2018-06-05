package jdbc_ass1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Statement;

public class question1 {

	public static void main(String[] args) {
		if(dbconnect.connection()==1) {
			try {
				System.out.println("connection stablished");
				InputStreamReader r = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(r);
				
				 int emp_no,salary,dep_no;
				 String fname,lname,j_date,dept,email;
				 System.out.println("enter the 10 employee :");
				 
				for(int i=0;i<10;i++) {
					
					System.out.println("Enter emp id :");
					emp_no=Integer.parseInt(br.readLine());
					
					System.out.println("Enter emp first name :");
					fname=br.readLine();
					
					System.out.println("Enter emp last name :");
					lname=br.readLine();
				
					System.out.println("Enter emp salary :");
					salary=Integer.parseInt(br.readLine());
					
					System.out.println("Enter emp joining day :");
					j_date=br.readLine();
					
					System.out.println("Enter emp department :");
					dept=br.readLine();
					
					System.out.println("Enter emp department number :");
					dep_no=Integer.parseInt(br.readLine());
					
					System.out.println("Enter emp email :");
					email=br.readLine();
					String query ="insert into employee values('"+emp_no+"','"+fname+"','"+lname+"','"+salary+"','"+j_date+"','"+dept+"','"+dep_no+"','"+email+"');";
					System.out.println(query);
					Statement stmt =  dbconnect.con.createStatement();
					
					int c= stmt.executeUpdate(query);
					System.out.println(c+" record added");
					
					
				}
				
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
