package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
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
 * The way to allow two or more statements to be grouped into a transaction is to disable the auto-commit mode. 
 * This is demonstrated in the following code, where con is an active connection:con.setAutoCommit(false);
 */


public class SolutionMySQL {

	public static void main(String[] args) {
		String dbName = "mydbname";
		String tableName = "student";
		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setURL("jdbc:mysql://localhost");
		dataSource.setPort(3306);
		dataSource.setUser("root");
		dataSource.setPassword("1234");
		dataSource.setServerName("localhost");
		dataSource.setDatabaseName(dbName);
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			System.out.println("database suceed");
			transaction(conn, dbName, tableName, "MONEY");
			
		} catch (SQLException e) {
			System.out.println("database connction fail");
			e.printStackTrace();
		} 
	}
	
	/**
	 * DDL commands
	 * standard method to create table 
	 * @param conn
	 * @param dbName
	 * @throws SQLException
	 */
	
	public static void createStudentTable(Connection conn ,String dbName) throws SQLException {
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			String createString =
			        "create table " + dbName +
			        ".STUDENT " +
			        "(STUDENT_ID integer NOT NULL, " +
			        "STUDENT_NAME varchar(40) NOT NULL, " +
			        "PRIMARY KEY (STUDENT_ID))";		
			stmt.executeUpdate(createString);
			System.out.println("student table create");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("student table fail");
		} finally {
			if (stmt != null) {
				stmt.close();
			}
		}	
	}
	
	public static void addColumnToTable(Connection conn, String dbName, String tableName, 
			String columnName, String type) throws SQLException {
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			String createString = 
					"alter table " + dbName +
					"." + tableName + " " + 
					"ADD " + columnName+ " " + type + "default 0";
			stmt.executeUpdate(createString);
			System.out.println(dbName+ " "+ tableName + "  add column " + columnName + " suceed.");			
		} catch (SQLException e) {		
			System.out.println(dbName+ " "+ tableName + "  add column " + columnName + " fail.");
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				stmt.close();
			}
		}
	}
	
	public static void removeColumnFromTable(Connection conn, String dbName, String tableName,
			String columnName ) throws SQLException {
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			String createString = 
					"alter table " + dbName +
					"." + tableName + " " + 
					"DROP COLUMN " + columnName;
			stmt.executeUpdate(createString);
			System.out.println(dbName+ " "+ tableName + "  drop column" + columnName + "suceed.");			
		} catch (SQLException e) {		
			System.out.println(dbName+ " "+ tableName + "  drop column" + columnName + "fail.");
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				stmt.close();
			}
		}
	}
	
	/**
	 * this method use prepare statement
	 * add student to table
	 * @param conn
	 * @param dbName
	 * @param id
	 * @param columnName
	 * @throws SQLException
	 */
	
	public static void addStudent(Connection conn, String dbName ,int id, String columnName) throws SQLException  {
		String sql = " insert into " + dbName+".STUDENT (STUDENT_ID, STUDENT_NAME)"
		        + " values (?, ?)";
		PreparedStatement stm = null;
		try {
			stm = conn.prepareStatement(sql);
			stm.setInt(1,id);
			stm.setString(2, columnName);
			stm.execute();
		} catch (SQLException e) {
			System.out.println("add " + columnName+ "to" + dbName + "fail");
			e.printStackTrace();
		} finally {
			if (stm != null) {
				stm.close();
			}
		}		
	}
	
	/**
	 * query the table 
	 * @param conn connection object form DriverManager
	 * @param dbName 
	 * @param tableName
	 * @param columName
	 */
	
	public static void querryRow(Connection conn, String dbName, String tableName , String columName) {
		Statement stm = null;
		try {
			stm = conn.createStatement();
			ResultSet rs = stm.executeQuery("SELECT " + columName+ " FROM " + dbName + "." + tableName);
			while (rs.next()) {
				System.out.println(rs.getString(1)+ "\t" + rs.getString(2) + "\t" + rs.getInt(3));			
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void transaction(Connection conn, String dbName, String tableName , String columName) throws SQLException {
	
		PreparedStatement stm1 = null; 
		PreparedStatement stm2 = null;
		try {
			String createString1 = "UPDATE " + dbName+ "." + 
					tableName + " SET " + "MONEY=500" + " WHERE STUDENT_NAME=\"John\"";
			String createString2 =  "UPDATE " + dbName+ "." + 
					tableName + " SET " + "MONEY=500" + " WHERE STUDENT_NAME=\"Merry\"";
			conn.setAutoCommit(false);
			stm1 = conn.prepareStatement(createString1);
			stm2 = conn.prepareStatement(createString2);
			stm1.executeUpdate();
			stm2.executeUpdate();		
			conn.commit();
			System.out.println("transaction seceed.");
		} catch (SQLException e) {
			System.out.println("transaction fail.");
			e.printStackTrace();
		} finally {
			if (stm1 != null) {
				stm1.close();
			}
			if (stm2 != null) {
				stm2.close();
			}
			conn.setAutoCommit(true);
		}
	}
} 
