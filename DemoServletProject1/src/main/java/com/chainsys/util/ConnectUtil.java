package com.chainsys.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectUtil {

	public static Connection getConnection() throws ClassNotFoundException, SQLException{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Stock_Management","root","1234");
			
			System.out.println(connection);
			return connection;
		}
}
