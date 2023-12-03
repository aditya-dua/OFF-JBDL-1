import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sql= "SELECT * FROM jbdl_1.user_jdbc;";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jbdl_1", "root", "password");
		
			System.out.println("Connection:"+con);
						
			Statement stmt = con.createStatement();
			
			System.out.println(sql);
			
			
			ResultSet rs = stmt.executeQuery(sql);
			
			System.out.println(rs);
			
			ResultSetMetaData rsmd = rs.getMetaData();
			
			System.out.println("Table Name:"+rsmd.getTableName(1)+" is having "+rsmd.getColumnCount()+" coulmns");
			
			
			System.out.println("Coulmn name for column 2:"+rsmd.getColumnLabel(2));
			
			
			while(rs.next()) {
				System.out.println("*******Next Row**********");
				System.out.println("User Name:"+rs.getString(2));
				System.out.println("User ID:"+rs.getInt(1));
				System.out.println("User Email:"+rs.getString("email"));
				System.out.println("*******End Row***********");
			}
			
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
