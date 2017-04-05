package mini;

public class Item {
	private String name;
	private int length;
	private String value;	//10바이트
	
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
		
		//한글은 2byte이기 때문에, byte로 바꿔서 length 확인
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
		
		Item item1 = Item.Create("이름", 10, "홍길동");
		System.out.println("[" + item1.raw() + "]");
		
		Item item2 = Item.Create("전화번호", 11, "01099998888");
		
		packet.addItem(item1);
		packet.addItem(item2);
		
		System.out.println("[" + packet.raw() + "]");
		System.out.println("[" + packet.getItem("이름").raw() + "]");
		System.out.println("[" + packet.getItem("전화번호").raw() + "]");
		
		
		Packet recvPacket = new Packet();
		recvPacket.addItem(Item.Create("생일", 8, null));
		recvPacket.addItem(Item.Create("주소", 30, null));
		recvPacket.parse("19801515서울시 송파구 잠실동 123-3    ");
		
		System.out.println(recvPacket.getItem("생일").raw());
	}
}
