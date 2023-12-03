import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TableCreationMain {
	
	
	public static void main(String[] args) {
		/**
		 * CREATE TABLE `jbdl_1`.`user` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `number` INT NULL,
  PRIMARY KEY (`id`));
		 */
		
		String sql= "CREATE TABLE `user_jdbc` (\n"
				+ "  `id` INT NOT NULL,\n"
				+ "  `name` VARCHAR(45) NULL,\n"
				+ "  `email` VARCHAR(45) NULL,\n"
				+ "  `number` INT NULL,\n"
				+ "  PRIMARY KEY (`id`));\n"
				+ "";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jbdl_1", "root", "password");
		
			System.out.println("Connection:"+con);
						
			Statement stmt = con.createStatement();
			
			 stmt.executeUpdate(sql);
			
			System.out.println("Table Creation success");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
