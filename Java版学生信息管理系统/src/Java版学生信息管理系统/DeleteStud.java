package Java��ѧ����Ϣ����ϵͳ;
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
			System.out.println("��ѧ����Ϣ�ɹ�ɾ��");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBConnection.closeConnection(conn);
		}
	}
}
