import java.sql.*;
public class Createorder {
public void create() {
		try {
			String url = "jdbc:mysql://127.0.0.1:3306/company";
			String username = "root";
			String password = "1234";
			String Query = "insert into Orders values(?,?)";
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement pst = con.prepareStatement(Query);
			pst.setInt(1, 102);
			pst.setString(2,"amazon");
			pst.setInt(1, 103);
			pst.setString(2,"flipkart");
			pst.executeUpdate();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Createorder obj = new Createorder();
		obj.create();
	}

}