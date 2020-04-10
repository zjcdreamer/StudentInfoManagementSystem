/**
 * �������ݿ�
 */

package Java��ѧ����Ϣ����ϵͳ;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DBConnection {

	public static Connection getConnection() {
		
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/db1?serverTimezone=UTC";
		String UserName = "root";
		String UserPassword = "root";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,UserName,UserPassword);
			System.out.println("���ݿ����ӳɹ�");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
		return conn;
	}
	
	
	public static void closeConnection(Connection conn) {
		if(conn != null) {
			try {
				conn.close();
				conn = null;	
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
	}

	public static void main(String[] args) {
		getConnection();
	}
}
