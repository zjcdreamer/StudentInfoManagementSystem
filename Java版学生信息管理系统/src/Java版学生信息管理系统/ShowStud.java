package Java��ѧ����Ϣ����ϵͳ;

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
				
				System.out.println("ѧԺ��"+student.getXueyuan()+
						"\nרҵ��"+student.getZhuanye()+
						"\n�꼶��"+student.getGrade()+
						"\n�༶��"+student.getBanji()+
						"\n������"+student.getName()+
						"\n�Ա�"+student.getSex()+
						"\n��ϵ��ʽ��"+student.getTel()+
						"\n���᣺"+student.getJiguan()+
						"\nѧ�ţ�"+student.getId()+
						"\n������"+student.getMath()+
						"\n��ѧӢ��"+student.getEnglish()+
						"\nC���Գ������"+student.getC_language()+
						"\n��ʦ��"+student.getTeacher());
			}else {
				System.out.println("���ݴ���");
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
