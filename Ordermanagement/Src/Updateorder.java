import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Updateorder {
	public void update() {
		try {
			String url = "jdbc:mysql://127.0.0.1:3306/company";
			String username = "root";
			String password = "1234";
			String Query = "update orders set name = 'myntra' where id = 101";
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement pst = con.prepareStatement(Query);
			pst.executeUpdate();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Updateorder obj = new Updateorder();
		obj.update();
	}

}
