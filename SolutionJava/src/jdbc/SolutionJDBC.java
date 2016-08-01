package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.management.ReflectionException;
import javax.naming.Context;
import javax.naming.InitialContext;

/**
 * 
 * @author xenxui
 * 2016/7/27
 * Relation Database
 * 
 * Column means a relation
 * Row means a identical data
 * 
 * SELECT Statements
 * 
 * SELECT KEY1, KEY2
 * FROM TABLE
 * WHERE KEY2 IS NOT NULL
 * 
 * SELECT is the Statement to choose Columns KEY
 * FROM is for which table
 * WHERE means a value condition
 * 
 * eg WHERE KEY1 LIKE 'Bird%' get value begin with 'Bird'
 * eg WHERE KEY1 LIKE 'Bi_d'  get value Bird Biud Biyd ...
 * eg WHERE KEY1 = 12  get value 12
 * eg WHERE KEY1 > 12  get value greater than 12
 * eg WHERE KEY1 = 12 and KEY2 IS NOT NULL
 * 
 * Joins get data from more than one table in what is called a join
 * 
 * SELECT TABLE1.KEY1, TABLE2.KEY2
 * FROM TABLE1, TABLE2
 * WHERE TABLE1.KEY1 = 12 and TABLE2.KEY2 IS NOT NULL
 * 
 * Common SQL Commands
 * Data Manipulation Language (DML) commands and Data Definition Language (DDL) commands. 
 * DML commands deal with data, either retrieving it or modifying it to keep it up-to-date.
 * DDL commands create or change tables and other database objects such as views and indexes.
 *  
 * DML commands
 * SELECT used to query and display data from a database.
 * INSERT adds new rows to a table.
 * DELETE removes a specified row or set of rows from a table
 * UPDATE changes an existing value in a column or group of columns in a table
 * 
 * DDL commands
 * CREATE TABLE creates a table with the column names the user provides
 * DROP TABLE deletes all rows and removes the table definition from the database
 * ALTER TABLE adds or removes a column from a table
 * 
 * 
 * 
 */

public class SolutionJDBC {

	public static void main(String[] args) throws ClassNotFoundException {
		  try {
			Connection conn =
				       DriverManager.getConnection("jdbc:mysql://localhost:3306/?" +
				                                   "user=root&password=1234");
			System.out.println("Connected to database");
			
		} catch (SQLException e) {
			System.out.println("Connection fail");
			e.printStackTrace();
		}   
	}
}
