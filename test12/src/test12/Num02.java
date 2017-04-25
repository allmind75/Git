package test12;

public class Num02 {

	/*
	 * 프로그래머가 시간을 저장하는 객체를 사용하기 위해서
	 * 클래스를 설계하고 있다. 클래스는 아래와 같이 설계하러고 계획을 했다.
	 * 
	 * (1) 클래스는 시간, 분, 초를 저장하는 필드를 가진다.
	 * (2) 현재 시간을 출력하는 메소드를 가진다.
	 * (3) 객체를 초기화하는 생성자를 가진다.
	 * - 생성자는 객체에 저장하고 싶은 시간, 분, 초를 전달해서 객체 필드를 초기화
	 * (4) 객체에 저장된 시간이 같은지를 비교하는 메소드
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Clock clock1 = new Clock(2, 10, 30);
		Clock clock2 = new Clock("2시 10분 30초");
		
		clock1.timePrint();
		clock2.timePrint();
		
		if(clock1.timeEquals(clock2) == true) {
			System.out.println("시간 같음");
		} else {
			System.out.println("시간 다름");
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
		System.out.println("현재시간 : " + this.hour + "시 " + this.minute + "분 " + this.second + "초");
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
