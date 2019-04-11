import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/EMPDB";
	static final String DB_NAME = "EMPDB";
	static final String DB_TABLE_NAME = "EMPLOYEE_TABLE";

	// Database credentials
	static final String USER = "root";
	static final String PASS = "password";
	static Connection con = null;
	Statement stmt = null;
	int idCounter = 0;

	public DBConnection() {

		try {
			// STEP 2: Register JDBC driver
			Class.forName(JDBC_DRIVER);

			// STEP 3: Open a connection
			con = DriverManager.getConnection(DB_URL, USER, PASS);

		} catch (SQLException se) {
			System.out.println("JDBC failed");
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} // end try
	}

	public void createDatabase() {

		try {
			Statement s = con.createStatement();
			String newDatabaseString = "CREATE DATABASE IF NOT EXISTS " + DB_NAME;
// String newDatabaseString = "CREATE DATABASE " + dbName;
			s.executeUpdate(newDatabaseString);

			System.out.println("Created database " + DB_NAME);
		} catch (SQLException e) {
			printSQLException(e);
		}
	}

	public void createTable() throws SQLException {
		String createString = "create table if not exists " + DB_TABLE_NAME + " " + "(ID integer NOT NULL, "
				+ "NAME varchar(40) NOT NULL, " + "ADDRESS varchar(40) NOT NULL, " + "PHONE varchar(20) NOT NULL, "
				+ "PRIMARY KEY (ID))";
		Statement stmt = null;
		try {
			stmt = con.createStatement();
			stmt.executeUpdate(createString);
			System.out.println("Created table " + DB_TABLE_NAME);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				stmt.close();
			}
		}
	}

	public void dropTable() throws SQLException {
		Statement stmt = null;
		try {
			stmt = con.createStatement();
			System.out.println("Dropping table " + DB_TABLE_NAME + " from MySQL");
			stmt.executeUpdate("DROP TABLE IF EXISTS " + DB_TABLE_NAME);

		} catch (SQLException e) {
			printSQLException(e);
		} finally {
			if (stmt != null) {
				stmt.close();
			}
		}

	}

	public void insert(String name, String address, String phone) throws SQLException {
		try {
			stmt = con.createStatement();
			stmt.executeUpdate("insert into " + DB_TABLE_NAME + " " + "values(" + idCounter + ", '" + name + "', '"
					+ address + "', '" + phone + "')");
			idCounter++;
		} catch (SQLException e) {
			printSQLException(e);
		} finally {
			if (stmt != null) {
				stmt.close();
			}
		}
	}

	public static void closeConnection(Connection connArg) {
		System.out.println("Releasing all open resources ...");
		try {
			if (connArg != null) {
				connArg.close();
				connArg = null;
			}
		} catch (SQLException sqle) {
			printSQLException(sqle);
		}
	}

	public static void viewTable() throws SQLException {
		Statement stmt = null;
		String query = "select ID, NAME, ADDRESS, PHONE from " + DB_TABLE_NAME + " ORDER BY NAME";
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				int id = rs.getInt("ID");
				String empName = rs.getString("NAME");
				String empAddress = rs.getString("ADDRESS");
				String empPhone = rs.getString("PHONE");
				System.out.println(empName + "(" + id + "): " + empAddress + ", " + empPhone);
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
	}

	public static void printSQLException(SQLException ex) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				if (ignoreSQLException(((SQLException) e).getSQLState()) == false) {
					e.printStackTrace(System.err);
					System.err.println("SQLState: " + ((SQLException) e).getSQLState());
					System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
					System.err.println("Message: " + e.getMessage());
					Throwable t = ex.getCause();
					while (t != null) {
						System.out.println("Cause: " + t);
						t = t.getCause();
					}
				}
			}
		}
	}

	public static boolean ignoreSQLException(String sqlState) {
		if (sqlState == null) {
			System.out.println("The SQL state is not defined!");
			return false;
		}
		// X0Y32: Jar file already exists in schema
		if (sqlState.equalsIgnoreCase("X0Y32"))
			return true;
		// 42Y55: Table already exists in schema
		if (sqlState.equalsIgnoreCase("42Y55"))
			return true;
		return false;
	}

	public void remove(int id) {
		try {
			stmt = con.createStatement();
			stmt.executeUpdate("DELETE FROM " + DB_TABLE_NAME + " WHERE ID = " + id + ";");
			idCounter++;
		} catch (SQLException e) {
			printSQLException(e);
		}

	}

	public void update(int id, String name, String address, String phone) {
		try {
			stmt = con.createStatement();
			stmt.executeUpdate("UPDATE " + DB_TABLE_NAME + " SET name= '" + name + "', address = '" + address
					+ "', phone = '" + phone + "' WHERE ID = " + id + ";");

//			System.out.println("UPDATE " + DB_TABLE_NAME + " SET name = '" + name + "' WHERE ID = " + id + ";");
//			stmt = con.createStatement();
//			stmt.executeUpdate("UPDATE " + DB_TABLE_NAME + " SET name = '" + name + "' WHERE ID = " + id + ";");

		} catch (SQLException e) {
			printSQLException(e);
		}

	}

	public void search(String name) {
		// TODO Auto-generated method stub
		Statement stmt = null;

		String query = "select ID, NAME, ADDRESS, PHONE from " + DB_TABLE_NAME + " WHERE NAME='" + name + "';";
		System.out.println(query);
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				int id = rs.getInt("ID");
				String empName = rs.getString("NAME");
				String empAddress = rs.getString("ADDRESS");
				String empPhone = rs.getString("PHONE");
				System.out.println(empName + "(" + id + "): " + empAddress + ", " + empPhone);
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
	}
}
