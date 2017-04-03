package tset07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		/*
		 * 사용자의 키보드 입력은 System.in
		 * 
		 * InputStreamReader는 입력을 character로 읽음
		 * 
		 * bufferedReader는 데이터를 사용자가 요청할때마다
		 * 매번 읽어오기 보다는 일정량 사이즈로 한번에 읽어온 후 버퍼에 보관
		 * 그리고 사용자가 요구할 때 버퍼에서 읽어옴 
		 * 
		 * InputStream - byte
		 * InputStreamReader - character
		 * BufferedReader - 문자열
		 */
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(r);
		String userInput = b.readLine();
		System.out.println("user input : " + userInput);
	}

}
