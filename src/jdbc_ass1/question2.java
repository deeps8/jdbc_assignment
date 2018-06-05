package jdbc_ass1;

import java.sql.ResultSet;
import java.sql.Statement;

public class question2 {

	public static void main(String[] args) {
		if(dbconnect.connection()==1) {
			  try {
				  System.out.println("connection stablished");
				  String query=" select distinct * from employee e,department d where salary = (select distinct salary from employee order by salary desc limit 2,1) and e.dep_no=d.dep_no order by salary desc;";
				  Statement stmt = dbconnect.con.createStatement();
				  
				  ResultSet rs = stmt.executeQuery(query);
				  while(rs.next()) {
					  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getInt(7)+" "+rs.getString(8)+" "+rs.getString(11));
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
