package tset07;

import java.util.Scanner;

public class StringToken {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		String str = "0123456";
		int length;
		char chr;
		
//		str = sc.nextLine();
//		length = str.length();			//���ڿ� ����
//		chr = str.charAt(0);			//index ��° ����
//		str2 = str.substring(0, 3);		//index ������ŭ ���ڿ� �ڸ���
//		
//		System.out.println("���ڿ� ���� : " + length);
//		System.out.println("0�� ° ���� : " + chr);
//		System.out.println("0~3 sub string : " + str2);
//		while(sc.hasNext()) {
//			System.out.println(sc.nextLine());
//		}
		
		
//		String str2 = "���̺긮����/������������";
//		int index;
//		int len;
//		String sub1, sub2;
//		
//		len = str2.length();
//		index = str2.indexOf('/');
//		
//		sub1 = str2.substring(0, index);
//		sub2 = str2.substring(index+1, len);
//		
//		System.out.println("str2�� ���ڿ��� ���� : " + len);
//		System.out.println("'/'������ �ε��� ��ȣ : " +index);
//		
//		System.out.println("sub1 : " + sub1);
//		System.out.println("sub2 : " + sub2);
		
		
		
		
		//phoneNumber();
		
		stringIndex();
		//calc();
		
		
		
		sc.close();
	}
	
	
	//next, nextline
	public static void address() {
		//����
		/*
		 * �����ȣ, �ּ�, ���ּҸ� ���� �Է¹ް�
		 * �Է¹��� �����ȣ �ּ� ���ּҸ�
		 * �ϳ��� ���ڿ��� �����ؼ�  ����Ͻÿ�
		 */
		
		String zipCode;
		String addr1;
		String addr2;
		String addr3;
		
		
		
		System.out.println("---�����ȣ, �ּ�, ���ַθ� �Է��ϼ���----");
		System.out.print("�����ȣ �Է� : ");
		
		zipCode = sc.next();	//�ܾ��Է�(�������), ���� ���๮��(\n)�� ����
		sc.nextLine(); // \n ó��
		
		//sc.skip("[\\r\\n'+");	//���๮�� skip
		
		System.out.print("\n�ּ� �Է� :");
		addr1 = sc.nextLine();
		
		System.out.print("���ּ� �Է� :");
		addr2 = sc.nextLine();
		
		addr3 = "("+zipCode+ ")" + " " + addr1 + " " + addr2;
		System.out.println("��ü�ּҴ� : " + addr3);
		
		System.out.println("----���α׷� ����----");
	}

	
	public static void phoneNumber() {
		//����
		//��ȭ��ȣ �Է¹ް� �и�
		//�Է� '-' ���� �޴��� ��ȣ �Է�
		//��� '-' �߰��ؼ� ���
		
		String phoneNumber;
		//	      01034377184
		//index   01234576789
		
		System.out.println("----�޴��� ��ȣ �Է�('-' �����ϰ� �Է�)----");
		System.out.print("�޴�����ȣ �Է�> ");
		phoneNumber = sc.nextLine();
		
		//substring(0,3) -> 0��° index���� 3��° index ������ // ��� : 010
		System.out.println("�޴�����ȣ : " + phoneNumber.substring(0, 3) + " - " + phoneNumber.substring(3, 7) + " - " + phoneNumber.substring(7, 11));
		
	}

	public static void stringIndex() {
		
		/*
		 * ����
		 * �Է� : ���� + ����
		 * ��� : ù��° ���� + ��ȣ + �ι�° ����
		 */
		
		String str;
		int len;
		int index;
		String sub1, sub2, sub3;
		char symbol;
		int sum = 0;
	
		System.out.println("----�������� + �������� �Է��ϼ���----");
		System.out.print("�Է�> ");
		
		str = sc.nextLine();		//�Է� : 100+32
		
		len = str.length();			//�Է¹��� ���ڿ� ����
		index = str.indexOf('+');	//���ڿ����� '+' index

		sub1 = str.substring(0, index);		//100
		sub2 = str.substring(index+1, len);	//32   str.substring(index+1)�� �ص� ��, index+1 ���� str ���������� �߶���
		sub3 = str.substring(index, index+1);
		symbol = str.charAt(index);			//+
			
		
		
		
		//System.out.println("equals(+) : " + sub3.equals("+"));
		
		if(sub3.equals("+")) {
			
			int num1, num2;
			double dNum1, dNum2;
			
			num1 = Integer.parseInt(sub1);
			num2 = Integer.parseInt(sub2);
			
			dNum1 = Double.parseDouble(sub1);
			dNum2 = Double.parseDouble(sub2);
			
			sum =  num1 + num2;	//Integer.parseIng(string);���ڿ��� ������ ��ȯ�ؼ� ���
			
			System.out.println("double, sum = " + (dNum1 + dNum2));
		}
		
		System.out.println("\n1.1 �Է¹��ڿ����� ù��° ����> " + sub1);
		System.out.println("1.2 �Է¹��ڿ����� ��ȣ> " + symbol);
		System.out.println("1.3 �Է¹��ڿ����� �ι�° ���� ���> " + sub2);
		System.out.println("2.0 ���ڷ� �Էµ� ���ڸ� ������ ��ȯ�ؼ� ���� ��� ���> " + sum);
		
		System.out.println("\n----���α׷� ����----\n");
		
	}
	
	public static void calc() {
		/*
		 * ����
		 * �Է� : ���� + - * / ����
		 * ��� : ù��° ���� + ��ȣ + �ι�° ����
		 */
		
		String str;
		int len;
		int index = 0;
		String sub1, sub2;
		char symbol;
		int result = 0;
		
		System.out.println("----�������� '+ - * / ' �������� �Է��ϼ���----");
		System.out.print("�Է�> ");
		str = sc.nextLine();
		
		len = str.length();
		
		if(str.indexOf('+') != -1) {
			index = str.indexOf('+');
			
		} else if(str.indexOf('-') != -1) {
			index = str.indexOf('-');
			
		} else if(str.indexOf('*') != -1) {
			index = str.indexOf('*');
			
		} else if(str.indexOf('/') != -1) {
			index = str.indexOf('/');
			
		}
		
		sub1 = str.substring(0, index);		
		sub2 = str.substring(index+1, len);
		symbol = str.charAt(index);
				
		System.out.println("1.1 �Է¹��ڿ����� ù��° ����> " + sub1);
		System.out.println("1.2 �Է¹��ڿ����� ��ȣ> " + symbol);
		System.out.println("1.3 �Է¹��ڿ����� �ι�° ���� ���> " + sub2);

		switch(symbol) {
		
		case '+':
			result = Integer.parseInt(sub1) + Integer.parseInt(sub2);
			break;
		case '-':
			result = Integer.parseInt(sub1) - Integer.parseInt(sub2);
			break;
		case '*':
			result = Integer.parseInt(sub1) * Integer.parseInt(sub2);
			break;
		case '/':
			result = Integer.parseInt(sub1) / Integer.parseInt(sub2);
			break;
		}
		
		System.out.println("���> " + result);
		
		System.out.println("\n----���α׷� ����----\n");
	}
}
