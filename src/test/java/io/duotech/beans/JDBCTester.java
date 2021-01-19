package io.duotech.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTester {

	public static void main(String[] args) throws SQLException {
		
		String user = "duotech";
		String password = "duotech2020";
		String url = "jdbc:mysql://dtdatabase.c6qqyddfk30u.us-east-2.rds.amazonaws.com/employees";
		
		
		
		Connection connection = DriverManager.getConnection(url, user, password);
		
		System.out.println("Database connection has been established!");
		
		Statement statement = connection.createStatement();
		
		
		
		ResultSet rs = statement.executeQuery("SELECT * FROM employees limit 10");
		
		
		
		
		// statement.executeUpdate(sql) is used for writing /updating/deleting data from the database 
		
//		while(rs.next()) {
//		System.out.println(rs.getObject(1) + "\t"+ rs.getObject("first_name") + "\t" + rs.getObject("last_name"));
//		}
		
//		rs.first();
//		System.out.println(rs.getObject(1) + "\t"+ rs.getObject("first_name") + "\t" + rs.getObject("last_name"));
//		
//		rs.last();
//		
//		System.out.println(rs.getObject(1) + "\t"+ rs.getObject("first_name") + "\t" + rs.getObject("last_name"));
//
//		rs.absolute(5);
//		
//		System.out.println(rs.getObject(1) + "\t"+ rs.getObject("first_name") + "\t" + rs.getObject("last_name"));
//		
//		rs.absolute(100);
//		
//		System.out.println(rs.getObject(1) + "\t"+ rs.getObject("first_name") + "\t" + rs.getObject("last_name"));
		
		
		//To get the column count
		ResultSetMetaData metaData = rs.getMetaData();
		int columnCount = metaData.getColumnCount();
		
		
		
		//To get the number of rows:
		rs.last();
		int rowCount = rs.getRow();
		
		rs.beforeFirst();
		
		//rs.afterLast();();
		
		for (int i = 0; i <rowCount; i++) {
			rs.next();
			//rs.previous();
			
			for (int j = 1; j <= columnCount; j++) {
				System.out.print(rs.getObject(j) + "\t");
			}
			
			System.out.println();
			
		}
		
		
		rs.close();
		statement.close();
		connection.close();
		
		
		
		

	}

}
