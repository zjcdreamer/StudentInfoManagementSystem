package Java��ѧ����Ϣ����ϵͳ;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		while(true) {

			System.out.println("��ѡ����Ҫ���еĲ���");
			System.out.println("1:���һ��ѧ����Ϣ");
			System.out.println("2:����һ��ѧ����Ϣ");
			System.out.println("3:�޸�һ��ѧ����Ϣ");
			System.out.println("4:ɾ��һ��ѧ����Ϣ");
			System.out.println("5:�˳�ϵͳ");
			
			String cz = sc.next();
			if(cz.equals("1")) {
				//���ѧ��
				AddStud as = new AddStud();
				
				System.out.println("������ѧԺ");
				student.setXueyuan(sc.next());
				
				System.out.println("������רҵ");
				student.setZhuanye(sc.next());
				
				System.out.println("�������꼶");
				student.setGrade(sc.next());
				
				System.out.println("������༶");
				student.setBanji(sc.next());
				
				System.out.println("����������");
				student.setName(sc.next());
				
				System.out.println("�������Ա�");
				student.setSex(sc.next());
				
				System.out.println("��������ϵ��ʽ");
				student.setTel(sc.next());
				
				System.out.println("�����뼮��");
				student.setJiguan(sc.next());
				
				System.out.println("������ѧ��");
				student.setId(sc.next());
				
				System.out.println("����������ɼ�");
				student.setMath(sc.next());
				
				System.out.println("�������ѧӢ��ɼ�");
				student.setEnglish(sc.next());
				
				System.out.println("������C���Գ�����Ƴɼ�");
				student.setC_language(sc.next());
				
				System.out.println("�����뵼ʦ����");
				student.setTeacher(sc.next());
				
				as.add(student);
			}
			
			if(cz.equals("2")) {
				//����ѧ��
				ShowStud ss = new ShowStud();
				System.out.println("������Ҫ��ѯѧ����������");
				String xm = sc.next();
				ss.Show(xm);
			}
			
			if(cz.equals("3")) {
				//�޸�ѧ����Ϣ�������
				UpdateStud us = new UpdateStud();
				
				System.out.println("��������Ҫ������Ϣ��ѧ��������");
				String name = sc.next();
				
				System.out.println("��ѡ����Ҫ�޸ĵ����ݵı��");
				System.out.println("1���޸�[ѧԺ]��Ϣ");
				System.out.println("2���޸�[רҵ]��Ϣ");
				System.out.println("3���޸�[�꼶]��Ϣ");
				System.out.println("4���޸�[�༶]��Ϣ");
				System.out.println("5���޸�[����]��Ϣ");
				System.out.println("6���޸�[�Ա�]��Ϣ");
				System.out.println("7���޸�[��ϵ��ʽ]��Ϣ");
				System.out.println("8���޸�[����]��Ϣ");
				System.out.println("9���޸�[ѧ��]��Ϣ");
				System.out.println("10���޸�[����]��Ϣ");
				System.out.println("11���޸�[��ѧӢ��]��Ϣ");
				System.out.println("12���޸�[C���Գ������]��Ϣ");
				System.out.println("13���޸�[��ʦ]��Ϣ");
				int up = sc.nextInt();
				
				System.out.println("���������������");
				String newer = sc.next();
				
				us.Update(name, up, newer);
				
			}
			
			if(cz.equals("4")) {
				//ɾ��ѧ����Ϣ
				DeleteStud ds = new DeleteStud();
				System.out.println("������Ҫɾ��ѧ����������");
				String name = sc.next();
				ds.Dele(name);
			}
			
			if(cz.equals("5")) {
				//�˳�ϵͳ
				System.out.println("���˳�ϵͳ");
				System.exit(0);
				
			}
			
		}

	}

}
