package test04;

public class Hello {

	public int x;
	public String s = "Hello Class";
	public int y;
	public int z;
	
	public Hello(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//class�� ��������� �߰� �� ���, ���� �����ڸ� �����ϴ°� �ƴ�
	//���ο� ������ �߰��ϰ� this�� �̿��� ���� ������ ȣ��
	public Hello(int x, int y, int z) {
		this(x, y);	//�ٸ� ������ ȣ��
		this.z = z;
	}
}
