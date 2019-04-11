import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TaskBean {

	// Task[] taskList = new Task[100];

	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;

	public void connectToDB() throws Exception {
		try {
			// Step 1. This will load the MySQL driver. Each DB has its own driver.
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Step 2. Setup the connection with the DB
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password");
			readAllTasks();
			insertTask("Clean the Stove");
			insertTask("Walk the Dog");
			insertTask("Mow the Lawn");
			deleteTask("10");
			deleteTask("20");
			deleteTask("22");
			readAllTasks();
		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}
	}

	public void readAllTasks() throws Exception {
		try {
			// Step 3. Statements allows us to send SQL queries to the DB.
			statement = connect.createStatement();
			resultSet = statement.executeQuery("select * from notesdb.todo");
			writeResultSet(resultSet);

		} catch (Exception e) {
			throw e;
		}
	}

	public void deleteTask(String id) throws Exception {
		// do on your own
		try {
			// Use PreparedStatement when inserting with variables. It's very efficient.
			preparedStatement = connect.prepareStatement("delete from notesdb.todo where id=?");
			preparedStatement.setString(1, id);
			preparedStatement.executeUpdate();

		} catch (Exception e) {
			throw e;
		}
		// ;
	}

	private void writeMetaData(ResultSet resultSet) throws SQLException {
		System.out.println("The columns in this table are : ");
		System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
		for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
			System.out.println("Column " + i + " " + resultSet.getMetaData().getColumnName(i));
		}
	}

	public void insertTask(String task) throws Exception {
		try {
			// Use PreparedStatement when inserting with variables. It's very efficient.
			preparedStatement = connect.prepareStatement("insert into notesdb.todo values (default, ?)");
			preparedStatement.setString(1, task);
			preparedStatement.executeUpdate();

		} catch (Exception e) {
			throw e;
		}
	}

	private void writeResultSet(ResultSet resultSet) throws SQLException {
		// ResultSet holds our results. It
		System.out.println("---------------------------------");
		writeMetaData(resultSet);

		while (resultSet.next()) {
			String tDescription = resultSet.getString("description");
			String id = resultSet.getString("id");

			// Boot up the Task object

			System.out.print("ID : " + id);
			System.out.print("\t--> ");
			System.out.println("Description: " + tDescription);
		}
	}

	private void close() {
		try {
			if (connect != null) {
				connect.close();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) throws Exception {
		TaskBean taskBean = new TaskBean();
		taskBean.connectToDB();
	}
}