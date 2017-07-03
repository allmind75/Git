package tset07;

import java.util.regex.Pattern;

public class PatternTest {

	/*
	 * ����ǥ����
	 * [] 		: �Ѱ��� ����
	 * [abc]	: a,b,c �� �ϳ��� ����
	 * [^abc]	: a,b,c, �̿��� �ϳ��� ����
	 * [a-zA-Z] : a~z, A~Z �� �ϳ��� ����
	 * 
	 * \d 		: �Ѱ��� ����, [0-9]�� ����
	 * \s		: ����
	 * \w		: �� ���� ���ĺ� �Ǵ� �� ���� ����, [a-zA-Z_0-9]�� ����
	 * ?		: ���� �Ǵ� �� ��
	 * *		: ���� �Ǵ� �� �� �̻�
	 * +		: �� �� �̻�
	 * {n}		: n��
	 * {n,}		: �ּ��� n��
	 * {n,m}	: n���������� m�� ����
	 * ()		: �׷�
	 * 
	 */
	public static void main(String[] args) {
		
		/*
		 * (02|010) : 02 �Ǵ� 010
		 * -		: - ����
		 * \d		: �� ���� ����, [0-9]�� ����
		 * \d{3,4}  : 3�ڸ� �Ǵ� 4�ڸ� ����
		 * \d{4}	: 4�ڸ� ����
		 */
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-1234-567";
		boolean result = Pattern.matches(regExp, data);
		
		if(result) {
			System.out.println("���Խİ� ��ġ");
		} else {
			System.out.println("���Խİ� ����ġ");
		}
		
		/*
		 * \w+ : �� �� �̻��� ���ĺ� �Ǵ� ����, [a-zA-Z_0-9]�� ����
		 * @   : @
		 * \.  : .
		 * (\.\w+)? : \.\w+ �� ���ų� �� �� �� �� �� ����
		 */
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "allg@tistory.com.com";
		result = Pattern.matches(regExp, data);
		
		if(result) {
			System.out.println("���Խİ� ��ġ");
		} else {
			System.out.println("���Խİ� ����ġ");
		}
	}

}
