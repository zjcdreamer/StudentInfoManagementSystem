package Java版学生信息管理系统;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		while(true) {

			System.out.println("请选择你要运行的操作");
			System.out.println("1:添加一个学生信息");
			System.out.println("2:查找一个学生信息");
			System.out.println("3:修改一个学生信息");
			System.out.println("4:删除一个学生信息");
			System.out.println("5:退出系统");
			
			String cz = sc.next();
			if(cz.equals("1")) {
				//添加学生
				AddStud as = new AddStud();
				
				System.out.println("请输入学院");
				student.setXueyuan(sc.next());
				
				System.out.println("请输入专业");
				student.setZhuanye(sc.next());
				
				System.out.println("请输入年级");
				student.setGrade(sc.next());
				
				System.out.println("请输入班级");
				student.setBanji(sc.next());
				
				System.out.println("请输入姓名");
				student.setName(sc.next());
				
				System.out.println("请输入性别");
				student.setSex(sc.next());
				
				System.out.println("请输入联系方式");
				student.setTel(sc.next());
				
				System.out.println("请输入籍贯");
				student.setJiguan(sc.next());
				
				System.out.println("请输入学号");
				student.setId(sc.next());
				
				System.out.println("请输入高数成绩");
				student.setMath(sc.next());
				
				System.out.println("请输入大学英语成绩");
				student.setEnglish(sc.next());
				
				System.out.println("请输入C语言程序设计成绩");
				student.setC_language(sc.next());
				
				System.out.println("请输入导师姓名");
				student.setTeacher(sc.next());
				
				as.add(student);
			}
			
			if(cz.equals("2")) {
				//查找学生
				ShowStud ss = new ShowStud();
				System.out.println("请输入要查询学生的姓名：");
				String xm = sc.next();
				ss.Show(xm);
			}
			
			if(cz.equals("3")) {
				//修改学生信息，待添加
				UpdateStud us = new UpdateStud();
				
				System.out.println("请输入需要更改信息的学生姓名：");
				String name = sc.next();
				
				System.out.println("请选择需要修改的内容的编号");
				System.out.println("1：修改[学院]信息");
				System.out.println("2：修改[专业]信息");
				System.out.println("3：修改[年级]信息");
				System.out.println("4：修改[班级]信息");
				System.out.println("5：修改[姓名]信息");
				System.out.println("6：修改[性别]信息");
				System.out.println("7：修改[联系方式]信息");
				System.out.println("8：修改[籍贯]信息");
				System.out.println("9：修改[学号]信息");
				System.out.println("10：修改[高数]信息");
				System.out.println("11：修改[大学英语]信息");
				System.out.println("12：修改[C语言程序设计]信息");
				System.out.println("13：修改[导师]信息");
				int up = sc.nextInt();
				
				System.out.println("请重新输入该内容");
				String newer = sc.next();
				
				us.Update(name, up, newer);
				
			}
			
			if(cz.equals("4")) {
				//删除学生信息
				DeleteStud ds = new DeleteStud();
				System.out.println("请输入要删除学生的姓名：");
				String name = sc.next();
				ds.Dele(name);
			}
			
			if(cz.equals("5")) {
				//退出系统
				System.out.println("已退出系统");
				System.exit(0);
				
			}
			
		}

	}

}
