package jdbc_ass1;

import java.sql.Statement;

public class question5 {

	public static void main(String[] args) {
		if(dbconnect.connection()==1) {
			  try {
				  System.out.println("connection stablished");
				  String query ="Delete from employee where salary < 20000 ";
				  Statement stmt = dbconnect.con.createStatement();
				  
				  int rs = stmt.executeUpdate(query);
				  System.out.println(rs+" rows affected");
				  
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
