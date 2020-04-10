package Java版学生信息管理系统;
import java.sql.*;

public class DeleteStud {
	
	public void Dele(String name) {
		Connection conn = DBConnection.getConnection();
		PreparedStatement ps;
		String sql = "DELETE FROM student WHERE name = ?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.execute();
			System.out.println("该学生信息成功删除");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBConnection.closeConnection(conn);
		}
	}
}
