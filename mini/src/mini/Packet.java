package mini;

import java.util.ArrayList;
import java.util.HashMap;

public class Packet {
	
	private ArrayList<Item> items = new ArrayList<Item>();
	private HashMap<String, Item> nameAccess = new HashMap<String, Item>();
	
	
	public void addItem(Item item) {
		this.items.add(item);
		/*
		 * Item�� ������ �̸��� ������� ���ϰ�
		 * nameAccess�� Key���� �ߺ����� �ʰ�
		 * ������ Key����(Item �̸��� �������) RuntimeExceptoin �߻�
		 */
		if(nameAccess.containsKey(item.getName())) {
			throw new RuntimeException("Duplicated item name : [" + item.getName() + "]");
		}
		nameAccess.put(item.getName(), item);
	}
	
	public Item getItem(String name) {
		//return this.items.get(index);
		return nameAccess.get(name);
	}
	
	public String raw()	{
		StringBuffer result = new StringBuffer();
		for(Item item: items) {
			result.append(item.raw());
		}
		return result.toString();
	}
	
	public void parse(String data) {
		byte[] bdata = data.getBytes();
		int pos = 0;
		for(Item item: items) {
			byte[] temp = new byte[item.getLength()];
			/*
			 * System.arraycopy(�ҽ�, �ҽ�������ġ, ���, ��������ġ, �����ұ���);
			 */
			System.arraycopy(bdata, pos, temp, 0, item.getLength());
			pos += item.getLength();
			item.setValue(new String(temp));
		}
	}
	
	public static void main(String[] args) {
		
		Packet packet = new Packet();
		
		Item item1 = Item.Create("�̸�", 10, "ȫ�浿");
		System.out.println("[" + item1.raw() + "]");
		Item item2 = Item.Create("��ȭ��ȣ", 11, "01099998888");
		
		packet.addItem(item1);
		packet.addItem(item2);
		
		System.out.println(packet.getItem("�̸�").raw());
		System.out.println(packet.getItem("��ȭ��ȣ").raw());
		
		System.out.println("[" + packet.raw() + "]");
		
		Packet recvPacket = new Packet();
		recvPacket.addItem(Item.Create("����", 8, null));
		recvPacket.addItem(Item.Create("�ּ�", 30, null));
		recvPacket.parse("19801515����� ���ı� ��ǵ� 123-3    ");
		
		System.out.println(recvPacket.getItem("����").raw());
	}
}
