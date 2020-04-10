package Java版学生信息管理系统;
import java.sql.*;

public class UpdateStud {
	public void Update(String name, int up, String newer) {
		Connection conn = DBConnection.getConnection();
		PreparedStatement ps;
		String sql;

		if(up == 1) {
			sql = "UPDATE student SET xueyuan = ? WHERE name = ?";
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, newer);
				ps.setString(2, name);
				ps.execute();
				System.out.println("修改信息成功");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("修改信息失败");
			}finally {
				DBConnection.closeConnection(conn);
			}
		}
		if(up == 2) {
			sql = "UPDATE student SET zhuanye = ? WHERE name = ?";
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, newer);
				ps.setString(2, name);
				ps.execute();
				System.out.println("修改信息成功");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("修改信息失败");
			}finally {
				DBConnection.closeConnection(conn);
			}
		}
		if(up == 3) {
			sql = "UPDATE student SET grade = ? WHERE name = ?";
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, newer);
				ps.setString(2, name);
				ps.execute();
				System.out.println("修改信息成功");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("修改信息失败");
			}finally {
				DBConnection.closeConnection(conn);
			}
		}
		if(up == 4) {
			sql = "UPDATE student SET banji = ? WHERE name = ?";
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, newer);
				ps.setString(2, name);
				ps.execute();
				System.out.println("修改信息成功");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("修改信息失败");
			}finally {
				DBConnection.closeConnection(conn);
			}
		}
		if(up == 5) {
			sql = "UPDATE student SET name = ? WHERE name = ?";
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, newer);
				ps.setString(2, name);
				ps.execute();
				System.out.println("修改信息成功");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("修改信息失败");
			}finally {
				DBConnection.closeConnection(conn);
			}
		}
		if(up == 6) {
			sql = "UPDATE student SET sex = ? WHERE name = ?";
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, newer);
				ps.setString(2, name);
				ps.execute();
				System.out.println("修改信息成功");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("修改信息失败");
			}finally {
				DBConnection.closeConnection(conn);
			}
		}
		if(up == 7) {
			sql = "UPDATE student SET tel = ? WHERE name = ?";
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, newer);
				ps.setString(2, name);
				ps.execute();
				System.out.println("修改信息成功");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("修改信息失败");
			}finally {
				DBConnection.closeConnection(conn);
			}
		}
		if(up == 8) {
			sql = "UPDATE student SET jiguan = ? WHERE name = ?";
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, newer);
				ps.setString(2, name);
				ps.execute();
				System.out.println("修改信息成功");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				DBConnection.closeConnection(conn);
			}
		}
		if(up == 9) {
			sql = "UPDATE student SET id = ? WHERE name = ?";
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, newer);
				ps.setString(2, name);
				ps.execute();
				System.out.println("修改信息成功");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("修改信息失败");
			}finally {
				DBConnection.closeConnection(conn);
			}
		}
		if(up == 10) {
			sql = "UPDATE student SET math = ? WHERE name = ?";
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, newer);
				ps.setString(2, name);
				ps.execute();
				System.out.println("修改信息成功");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("修改信息失败");
			}finally {
				DBConnection.closeConnection(conn);
			}
		}
		if(up == 11) {
			sql = "UPDATE student SET english = ? WHERE name = ?";
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, newer);
				ps.setString(2, name);
				ps.execute();
				System.out.println("修改信息成功");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("修改信息失败");
			}finally {
				DBConnection.closeConnection(conn);
			}
		}
		if(up == 12) {
			sql = "UPDATE student SET c_language = ? WHERE name = ?";
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, newer);
				ps.setString(2, name);
				ps.execute();
				System.out.println("修改信息成功");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("修改信息失败");
			}finally {
				DBConnection.closeConnection(conn);
			}
		}
		if(up == 13) {
			sql = "UPDATE student SET teacher = ? WHERE name = ?";
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, newer);
				ps.setString(2, name);
				ps.execute();
				System.out.println("修改信息成功");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("修改信息失败");
			}finally {
				DBConnection.closeConnection(conn);
			}
		}	
	}
}
