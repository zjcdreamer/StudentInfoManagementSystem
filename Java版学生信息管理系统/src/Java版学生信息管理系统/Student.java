package Java版学生信息管理系统;

public class Student {
	
		// TODO Auto-generated method stub
		private String xueyuan;
		private String zhuanye;
		private String grade;
		private String banji;
		private String name;
		private String sex;
		private String tel;
		private String jiguan;
		private String id;
		private String math;
		private String english;
		private String c_language;
		private String teacher;
		
		
		public Student() {
			super();
		}


		public Student(String xueyuan, String zhuanye, String grade, String banji, String name, String sex, String tel,
				String jiguan, String id, String math, String english, String c_language, String teacher) {
			super();
			this.xueyuan = xueyuan;
			this.zhuanye = zhuanye;
			this.grade = grade;
			this.banji = banji;
			this.name = name;
			this.sex = sex;
			this.tel = tel;
			this.jiguan = jiguan;
			this.id = id;
			this.math = math;
			this.english = english;
			this.c_language = c_language;
			this.teacher = teacher;
		}


		public String getXueyuan() {
			return xueyuan;
		}


		public void setXueyuan(String xueyuan) {
			this.xueyuan = xueyuan;
		}


		public String getZhuanye() {
			return zhuanye;
		}


		public void setZhuanye(String zhuanye) {
			this.zhuanye = zhuanye;
		}


		public String getGrade() {
			return grade;
		}


		public void setGrade(String grade) {
			this.grade = grade;
		}


		public String getBanji() {
			return banji;
		}


		public void setBanji(String banji) {
			this.banji = banji;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getSex() {
			return sex;
		}


		public void setSex(String sex) {
			this.sex = sex;
		}


		public String getTel() {
			return tel;
		}


		public void setTel(String tel) {
			this.tel = tel;
		}


		public String getJiguan() {
			return jiguan;
		}


		public void setJiguan(String jiguan) {
			this.jiguan = jiguan;
		}


		public String getId() {
			return id;
		}


		public void setId(String id) {
			this.id = id;
		}


		public String getMath() {
			return math;
		}


		public void setMath(String math) {
			this.math = math;
		}


		public String getEnglish() {
			return english;
		}


		public void setEnglish(String english) {
			this.english = english;
		}


		public String getC_language() {
			return c_language;
		}


		public void setC_language(String c_language) {
			this.c_language = c_language;
		}


		public String getTeacher() {
			return teacher;
		}


		public void setTeacher(String teacher) {
			this.teacher = teacher;
		}
}
