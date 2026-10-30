import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class Getorder {
	public void get() {
		try {
			String url = "jdbc:mysql://127.0.0.1:3306/college";
			String username = "root";
			String password = "1234";
			String Query = "select * from orders ";
			Connection con = DriverManager.getConnection(url, username, password);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(Query);
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
			}
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
