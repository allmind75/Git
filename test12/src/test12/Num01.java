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

		member1.memberNum = 1;
		member1.name = "���缮";
		member1.position = "�븮";
		member1.address = "���������� �߱�";

		member1.printInfo();
		System.out.println();
		member2.printInfo();

	}

}

class MemberInfo {

	//field - ��ü�� �Ӽ�(����)
	int memberNum;
	String name;
	String position;
	String address;

	
	/*
	 * ������(constructor) - ��ü�� �����ɶ� ����Ǵ� �޼ҵ�
	 * 1. Ŭ���� �̸��� ����
	 * 2. ��ȯ�� ����
	 * 3. �Լ� �����ε� ����
	 * 4. �����ڸ� �ϳ��� �����ϸ� �⺻������ �ڵ����� ���� �ȵ�! 
	 */
	
	//�⺻ ������
	MemberInfo() {}
	
	//�����ε��� ������
	MemberInfo(int memberNum, String name, String position, String address) {
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
	}

}
