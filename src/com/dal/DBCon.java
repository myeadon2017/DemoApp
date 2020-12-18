package com.dal;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBCon {
	
	Connection conn=null;
 public	DBCon(){
	try{
	Class.forName("org.h2.Driver");
	conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");

	
	}catch (Exception e) {
		 
	}
	

}
 
public Connection getConnection() {
	return conn;
}


}
