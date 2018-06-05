package jdbc_ass1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbconnect {
  public static  Connection con;
  
  public static int connection() {
	  try {
			Class.forName("com.mysql.jdbc.Driver");
			 con= DriverManager.getConnection("jdbc:mysql://localhost:3306/xyzcompany", "root","");
			 //System.out.println("connection stablished");
			 return 1;
	}
	catch(Exception e){
		e.printStackTrace();
		return 0;
  }
  }	
  
  public static int connDestroy() {
	  try {
			con.close();
			//System.out.println("connection destroyed");
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
   }

	public static void main(String[] args) {
//		System.out.println(connection());
//		System.out.println(connDestroy());
 }
}
	
