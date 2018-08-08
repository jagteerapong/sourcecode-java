package com.wisesoft.testDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBase {
	
	void getData(String id) {
		String sql = "SELECT * FROM USER WHERE id=?";
		
		//try-resources-catch  (auto close to database)
		try(
				Connection connection = DriverManager.getConnection("");
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
		) {
			preparedStatement.setString(1, id);
		} catch (Exception e) {
			
		}
	}
}
