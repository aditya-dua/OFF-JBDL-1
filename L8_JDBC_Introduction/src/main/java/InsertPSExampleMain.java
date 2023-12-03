import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertPSExampleMain {

	public static void main(String[] args) {
		/**
		 * CREATE TABLE `jbdl_1`.`user` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `number` INT NULL,
  PRIMARY KEY (`id`));

		 */
		

		
		String sql= "INSERT INTO `user_jdbc`"
				+ "(`id`,"
				+ "`name`,"
				+ "`email`,"
				+ "`number`) "
				+ "VALUES "
				+ "(?,"
				+ "?,"
				+ "?,"
				+ "?);"
				+ "";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jbdl_1", "root", "password");
		
			System.out.println("SQL Query:"+sql);
			
			System.out.println("Connection:"+con);
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1, 4);
			ps.setString(2, "Geeks for geeks");
			ps.setString(3, "gfg@example.com");
			ps.setInt(4,35);
			
			int count = ps.executeUpdate();
			
			System.out.println("Insert Success"+count);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


