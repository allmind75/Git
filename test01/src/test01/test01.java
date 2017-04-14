package test01;

public class test01 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		int num2;
		int sum;
		int GCD;
		
		num1 = 5;
		num2 = 2;
		sum = num1 % num2;
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		System.out.println("num1 % num2 = " +sum);
			
		GCD = gcd(num1, num2);
		System.out.println("\nGCD : " + GCD);
		System.out.println("LCD : " + lcm(GCD, num1, num2));
		
		
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';	//유니코드
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		float n= 10 ;
		
		int uniCode = c1; //유니코드
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(uniCode);
		
		byte bNum = 10;
		byte bNum2 = 11;
		
		byte sum2;
		int sum3;
		//sum2 = bNum + bNum2;	//byte 덧셈의 결과는 int
		sum3 = bNum + bNum2;
		
		
		
		int v1 = 10;
		int v2 = ~v1;
		int v3 = v2 + 1;
		
		System.out.println(toBinaryString(v1));
		System.out.println(v2);
		System.out.println(v3);
		
		
		//Infinity NaN
		int x = 5;
		double y = 0.0;
		
		double z = x / y;
		
		System.out.println(Double.isInfinite(z));
		
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("잘못됨!!");
		}
	}
	
	
	
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length()<32) {
			str = '0' + str;
		}
		return str;
	}
	
	
	
	public static int gcd(int a, int b) {
		if(b == 0) return a;
		return gcd(b, a%b);
	}
	public static int lcm(int gcd, int a, int b) {
		return (a*b)/gcd;
	}
	
}
