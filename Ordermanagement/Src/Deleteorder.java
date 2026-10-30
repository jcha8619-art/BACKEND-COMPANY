import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Deleteorder {
	public void delete() {
		try {
			String url = "jdbc:mysql://127.0.0.1:3306/company";
			String username = "root";
			String password = "1234";
			String Query = "delete from orders where id = 101";
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement pst = con.prepareStatement(Query);
			pst.executeUpdate();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Deleteorder obj = new Deleteorder();
		obj.delete();
	}

}


