package users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class employee {
   public static void main(String[] args) {
	
	   try {
		   Class.forName("com.mysql.cj.jdbc.Driver"); //1.loading Driver class C should be capital.
		   //mysql Driver name com.mysql.cj.jdbc.Driver.
		   Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root","root","Mysql@123");
		 //get connection(null => go to my sql and click on local instance copy jdbc string and paste in "",null => mysql username,null=> mysql password)

		   String  name = "create database emp";

		   PreparedStatement pmst = conn.prepareStatement(name);
		   int i = pmst.executeUpdate();
			
			if (i>0) {
				System.out.println("data base created");
			}
			else {
				System.out.println("not created");
	}
			conn.close();
			pmst.close();


	   } catch (Exception e) {
	     e.printStackTrace();
	}
}
}
