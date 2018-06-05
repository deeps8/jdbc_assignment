//to delete the table department
package jdbc_ass1;

import java.sql.Statement;

public class question7 {

	public static void main(String[] args) {
		if(dbconnect.connection()==1) {
			  try {
				  System.out.println("connection stablished");
				  String fkquery ="ALTER TABLE employee DROP foreign key fk_1";
				  String dropquery="DROP TABLE department";
				  Statement stmt = dbconnect.con.createStatement();
				  
				  int rs = stmt.executeUpdate(fkquery);
				  int rs2 = stmt.executeUpdate(dropquery);
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
