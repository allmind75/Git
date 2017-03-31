package tset07;

public class TypeSize {

	public static void main(String[] args) {
		
		//메모리를 효욜적으로 사용하기 위해 다양한 자료형 사용
		
		//byte 1byte(8bit), -2^7 ~ 2^7 -1 : -128 ~ 127
		byte b1 = 127;
		
		//short 2byte(16bit), -2^15 ~ 2^15 -1 : -32768 ~ 32767
		short s1 = 32767;
		
		
		//int 4byte(32bit), -2^31 ~ 2^31 -1: -2147483648 ~ 2147483647
		int n1 = 2147483647;
		
		//long 8byte(64bit), -2^63 ~ 2^63 -1: .....매우큼
		long l1 = 1000000000000000000L;
		
		
		//실수 표현
		double d1 = 0.12301232;
		
		float f1 = 23.23232f;
		
		///e2 = 10^2, e-2 = 10^-2
		double d2 = 1.234e2;	//123.4
		double d3 = 1.234e-2;	//0.01234
		
		
		System.out.println("b1 = " + b1);
		System.out.println("s1 = " + s1);
		System.out.println("n1 = " + n1);
		System.out.println("l1 = " + l1);
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
		System.out.println("d3 = " + d3);
		System.out.println("f1 = " + f1);
		
		
		System.out.println("");
		
		
		
		//이진수, 1의보수, 2의보수
		int x = 9;
		int y = -9;
		String str = Integer.toBinaryString(x);
		
		for(int i = 0 ; i < Integer.numberOfLeadingZeros(x) ; i++) {
			str = "0" + str;
		} 
		
		System.out.println("x = " + x);
		System.out.println("x의 이진수   = " + str);
		
		int z = ~x;
		System.out.println("x의 1의 보수 = " + Integer.toBinaryString(z));
		System.out.println("x의 2의 보수 = " + Integer.toBinaryString(z+1));
		System.out.println("y의 이진수   = " + Integer.toBinaryString(y));
		
	}
}
