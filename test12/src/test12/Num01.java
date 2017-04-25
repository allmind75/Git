package test12;

public class Num01 {

	/*
	 * ȸ���� ȸ��� ����
	 * 
	 * �����ȣ �̸� ��å ������ �ּ� 1 ���缮 �븮 ���������� �߱� 2 �ڸ�� ���� ���������� ����
	 * 
	 * (1) ���� ��� ������ �����ϴ� Ŭ���� ���� ��� ���� Ŭ������ �����ȣ, �̸�, ��å, ������ �ʵ带 ������ ����
	 * 
	 * (2) (1)���� ������ Ŭ������ �̿��ؼ� ���� ǥ�� �ִ� ��������� ���� ��ü 2���� ����
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberInfo member1 = new MemberInfo();
		MemberInfo member2 = new MemberInfo(2, "�ڸ��", "����", "���������� �߱�");
		MemberInfo member3 = new MemberInfo("������");
		MemberInfo[] staff = new MemberInfo[]{new MemberInfo(), new MemberInfo()};
		
		
		member1.memberNum = 1;
		member1.name = "���缮";
		member1.position = "�븮";
		member1.address = "���������� �߱�";

		member1.printInfo();
		System.out.println();
		member2.printInfo();
		System.out.println();
		member3.printInfo();
		System.out.println();

		for(MemberInfo m: staff) {
			m.printInfo();
		}
		
	}

}

class MemberInfo {

	//Ŭ���� ����
	public static int memberCnt = 0;
	
	//field - ��ü�� �Ӽ�(����)
	int memberNum;
	String name;
	String position;
	String address;
	
	
	/*
	 * ������(constructor) - ��ü�� �����ɶ� ����Ǵ� �޼ҵ�
	 * 1. Ŭ���� �̸��� ����
	 * 2. ��ȯ�� ����
	 * 3. �ߺ� ���� ����, �޼ҵ� �����ε� ����
	 * 4. �����ڸ� �ϳ��� �����ϸ� �⺻������ �ڵ����� ���� �ȵ�! 
	 * 5. �����ڴ� �������� ����
	 */
	
	//�⺻ ������
	MemberInfo() {
		this.memberNum = 0;
		this.name = "����";
		this.position = "���";
		this.address = "����";
		MemberInfo.memberCnt++;
	}
	
	//this ������ - ���� Ŭ�������� �ٸ� ������ ȣ��
	MemberInfo(String name) {
		this();
		this.name = name;
	}
	
	//�����ε��� ������
	MemberInfo(int memberNum, String name, String position, String address) {
		this();
		this.memberNum = memberNum;
		this.name = name;
		this.position = position;
		this.address = address;
	}
	
	//��¸޼ҵ�
	public void printInfo() {
		System.out.println("�����ȣ : " + this.memberNum);
		System.out.println("�̸� : " + this.name);
		System.out.println("���� : " + this.position);
		System.out.println("�������ּ� : " + this.address);
		System.out.println("���� �� : " + MemberInfo.memberCnt);
	}

}
