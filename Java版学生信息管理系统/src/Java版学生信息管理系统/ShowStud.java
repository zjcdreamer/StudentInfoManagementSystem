package Java版学生信息管理系统;

import java.sql.*;


public class ShowStud {

	public void Show(String name) {
		
		Student student = new Student();
		Connection conn = DBConnection.getConnection();
		String sql = "SELECT * FROM student where name = ?";
		PreparedStatement ps;
		ResultSet rs;
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			rs = ps.executeQuery();
			if(rs.next()) {
				student.setXueyuan(rs.getString("xueyuan"));
				student.setZhuanye(rs.getString("zhuanye"));
				student.setGrade(rs.getString("grade"));
				student.setBanji(rs.getString("banji"));
				student.setName(rs.getString("name"));
				student.setSex(rs.getString("sex"));
				student.setTel(rs.getString("tel"));
				student.setJiguan(rs.getString("jiguan"));
				student.setId(rs.getString("id"));
				student.setMath(rs.getString("math"));
				student.setEnglish(rs.getString("english"));
				student.setC_language(rs.getString("c_language"));
				student.setTeacher(rs.getString("teacher"));
				
				System.out.println("学院："+student.getXueyuan()+
						"\n专业："+student.getZhuanye()+
						"\n年级："+student.getGrade()+
						"\n班级："+student.getBanji()+
						"\n姓名："+student.getName()+
						"\n性别："+student.getSex()+
						"\n联系方式："+student.getTel()+
						"\n籍贯："+student.getJiguan()+
						"\n学号："+student.getId()+
						"\n高数："+student.getMath()+
						"\n大学英语"+student.getEnglish()+
						"\nC语言程序设计"+student.getC_language()+
						"\n导师："+student.getTeacher());
			}else {
				System.out.println("数据错误");
			}
			rs.close();
			ps.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBConnection.closeConnection(conn);
		}

	}
}
