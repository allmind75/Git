package zoo;

public class Main {

	
	public static void main(String[] args) {
		
		IManageInfo[] zoo = new IManageInfo[]{
				new CMammal("����", "����", "���缮", 2, 123456),
				new CMammal("ȣ����", "ȣ����", "��ȣ��", 1, 123456),
				new CBird("��ũ", "ȫ��", "�迬��", 3, "2016.12.26", 223457),
				new CBird("�����", "�޹���", "���ϴ�", 0.5, "2016.12.27", 223458)};
		
		System.out.println("[�̸�\t" + "����\t" + "������\t" + "����\t" + "AI����������\t" + "������ȣ]" );
		for(IManageInfo z: zoo) {
			System.out.println(z.getName() + "\t" + z.getKind() + "\t" + z.getManagerName() + "\t"
					+ z.getAge() + "\t" + z.getAIPreventDay() + "\t" + z.getNum());
		}
	}
}
