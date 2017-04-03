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
	
	//class에 멤버변수가 추가 된 경우, 기존 생성자를 수정하는게 아닌
	//새로운 생성자 추가하고 this를 이용해 기존 생성자 호출
	public Hello(int x, int y, int z) {
		this(x, y);	//다른 생성자 호출
		this.z = z;
	}
}
