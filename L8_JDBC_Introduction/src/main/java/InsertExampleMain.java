import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertExampleMain {

	public static void main(String[] args) {
		/**
		 * CREATE TABLE `jbdl_1`.`user` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `number` INT NULL,
  PRIMARY KEY (`id`));

		 */
		

		
		String sql= "INSERT INTO `user_jdbc`\n"
				+ "(`id`,\n"
				+ "`name`,\n"
				+ "`email`,\n"
				+ "`number`)\n"
				+ "VALUES\n"
				+ "(3,\n"
				+ "'TestUser',\n"
				+ "'Abc@gmail.com',\n"
				+ "100);\n"
				+ "";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jbdl_1", "root", "password");
		
			System.out.println("Connection:"+con);
						
			Statement stmt = con.createStatement();
			
			System.out.println(sql);
			int count = stmt.executeUpdate(sql);
			
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


