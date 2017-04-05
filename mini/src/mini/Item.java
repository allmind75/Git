package mini;

public class Item {
	private String name;
	private int length;
	private String value;	//10����Ʈ
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	public String raw() {
		
		StringBuffer padded = new StringBuffer(this.value);
		
		//�ѱ��� 2byte�̱� ������, byte�� �ٲ㼭 length Ȯ��
		while(padded.toString().getBytes().length < this.length) {
			padded.append(' ');
		}
		return padded.toString();
	}
	
	public static Item Create(String name, int length, String value) {
		Item item = new Item();
		item.setName(name);
		item.setLength(length);;
		item.setValue(value);
		return item;
	}
	
	public static void main(String[] args) {
		
		Packet packet = new Packet();
		
		Item item1 = Item.Create("�̸�", 10, "ȫ�浿");
		System.out.println("[" + item1.raw() + "]");
		
		Item item2 = Item.Create("��ȭ��ȣ", 11, "01099998888");
		
		packet.addItem(item1);
		packet.addItem(item2);
		
		System.out.println("[" + packet.raw() + "]");
		System.out.println("[" + packet.getItem("�̸�").raw() + "]");
		System.out.println("[" + packet.getItem("��ȭ��ȣ").raw() + "]");
		
		
		Packet recvPacket = new Packet();
		recvPacket.addItem(Item.Create("����", 8, null));
		recvPacket.addItem(Item.Create("�ּ�", 30, null));
		recvPacket.parse("19801515����� ���ı� ��ǵ� 123-3    ");
		
		System.out.println(recvPacket.getItem("����").raw());
	}
}
