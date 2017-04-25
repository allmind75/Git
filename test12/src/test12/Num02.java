package test12;

public class Num02 {

	/*
	 * ���α׷��Ӱ� �ð��� �����ϴ� ��ü�� ����ϱ� ���ؼ�
	 * Ŭ������ �����ϰ� �ִ�. Ŭ������ �Ʒ��� ���� �����Ϸ��� ��ȹ�� �ߴ�.
	 * 
	 * (1) Ŭ������ �ð�, ��, �ʸ� �����ϴ� �ʵ带 ������.
	 * (2) ���� �ð��� ����ϴ� �޼ҵ带 ������.
	 * (3) ��ü�� �ʱ�ȭ�ϴ� �����ڸ� ������.
	 * - �����ڴ� ��ü�� �����ϰ� ���� �ð�, ��, �ʸ� �����ؼ� ��ü �ʵ带 �ʱ�ȭ
	 * (4) ��ü�� ����� �ð��� �������� ���ϴ� �޼ҵ�
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Clock clock1 = new Clock(2, 10, 30);
		Clock clock2 = new Clock("2�� 10�� 30��");
		
		clock1.timePrint();
		clock2.timePrint();
		
		if(clock1.timeEquals(clock2) == true) {
			System.out.println("�ð� ����");
		} else {
			System.out.println("�ð� �ٸ�");
		}
		
		
	}
}

class Clock {
	
	int hour;
	int minute;
	int second;
	
	Clock(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	Clock(String str) {

		int[] time = strintToInt(str);
		
		this.hour = time[0];
		this.minute = time[1];
		this.second = time[2];
		
	}
	public void timePrint() {
		System.out.println("����ð� : " + this.hour + "�� " + this.minute + "�� " + this.second + "��");
	}
	
	public boolean timeEquals(Clock c) {
		
		if(this.hour == c.hour && this.minute == c.minute && this.second == c.second) {
			return true;
		} else {
			return false;
		}
	}
	
	public int[] strintToInt(String str) {
		
		String[] strTemp = str.split(" ");
		int[] time = new int[3];
		
		for(int i=0 ; i<strTemp.length ; i++) {
			
			String s;
			char[] temp = strTemp[i].toCharArray();

			temp[temp.length-1] = '\0';
			s = String.valueOf(temp);
			s = s.trim();
			time[i] = Integer.parseInt(s);
		}
		
		return time;
	}
	
		
}
