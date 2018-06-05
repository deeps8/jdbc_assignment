package jdbc_ass1;

import java.sql.Statement;

public class question4 {

	public static void main(String[] args) {
		if(dbconnect.connection()==1) {
			  try {
				  System.out.println("connection stablished");
				  String query1=" insert into employee values('559','akash','badal','21000','2016-02-05','marketing','5','baadal@gmail.com'),"
				  		+ "('693','monty','sharma','11000','2018-05-09','HR','3','monty@gmail.com'),"
				  		+ "('971','bunty','ratwal','16000','2017-09-03','development','4','bunty@gmail.com')";
				  Statement stmt = dbconnect.con.createStatement();
				  
				  int rs = stmt.executeUpdate(query1);
				  System.out.println("3 Records added");
				  
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
