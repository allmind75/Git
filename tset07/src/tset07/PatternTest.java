package tset07;

import java.util.regex.Pattern;

public class PatternTest {

	/*
	 * 정규표현식
	 * [] 		: 한개의 문자
	 * [abc]	: a,b,c 중 하나의 문자
	 * [^abc]	: a,b,c, 이외의 하나의 문자
	 * [a-zA-Z] : a~z, A~Z 중 하나의 문자
	 * 
	 * \d 		: 한개의 숫자, [0-9]와 같음
	 * \s		: 공백
	 * \w		: 한 개의 알파벳 또는 한 개의 숫자, [a-zA-Z_0-9]와 동일
	 * ?		: 없음 또는 한 개
	 * *		: 없음 또는 한 개 이상
	 * +		: 한 개 이상
	 * {n}		: n개
	 * {n,}		: 최소한 n개
	 * {n,m}	: n개에서부터 m개 까지
	 * ()		: 그룹
	 * 
	 */
	public static void main(String[] args) {
		
		/*
		 * (02|010) : 02 또는 010
		 * -		: - 포함
		 * \d		: 한 개의 숫자, [0-9]와 동일
		 * \d{3,4}  : 3자리 또는 4자리 숫자
		 * \d{4}	: 4자리 숫자
		 */
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-1234-567";
		boolean result = Pattern.matches(regExp, data);
		
		if(result) {
			System.out.println("정규식과 일치");
		} else {
			System.out.println("정규식과 불일치");
		}
		
		/*
		 * \w+ : 한 개 이상의 알파벳 또는 숫자, [a-zA-Z_0-9]와 동일
		 * @   : @
		 * \.  : .
		 * (\.\w+)? : \.\w+ 이 없거나 한 번 더 올 수 있음
		 */
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "allg@tistory.com.com";
		result = Pattern.matches(regExp, data);
		
		if(result) {
			System.out.println("정규식과 일치");
		} else {
			System.out.println("정규식과 불일치");
		}
	}

}
