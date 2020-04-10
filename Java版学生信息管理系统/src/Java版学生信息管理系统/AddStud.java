package Java版学生信息管理系统;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//添加学生
public class AddStud {

	public void add(Student student) {
		Connection conn = DBConnection.getConnection();
		String sql = "insert into student values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, student.getXueyuan());
			ps.setString(2, student.getZhuanye());
			ps.setString(3, student.getGrade());
			ps.setString(4, student.getBanji());
			ps.setString(5, student.getName());
			ps.setString(6, student.getSex());
			ps.setString(7, student.getTel());
			ps.setString(8, student.getJiguan());
			ps.setString(9, student.getId());
			ps.setString(10, student.getMath());
			ps.setString(11, student.getEnglish());
			ps.setString(12, student.getC_language());
			ps.setString(13, student.getTeacher());
			ps.execute();
			System.out.println("成功添加一位学生");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBConnection.closeConnection(conn);
		}
	}
}
