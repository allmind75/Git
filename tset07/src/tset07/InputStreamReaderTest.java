package tset07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		/*
		 * ������� Ű���� �Է��� System.in
		 * 
		 * InputStreamReader�� �Է��� character�� ����
		 * 
		 * bufferedReader�� �����͸� ����ڰ� ��û�Ҷ�����
		 * �Ź� �о���� ���ٴ� ������ ������� �ѹ��� �о�� �� ���ۿ� ����
		 * �׸��� ����ڰ� �䱸�� �� ���ۿ��� �о�� 
		 * 
		 * InputStream - byte
		 * InputStreamReader - character
		 * BufferedReader - ���ڿ�
		 */
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(r);
		String userInput = b.readLine();
		System.out.println("user input : " + userInput);
	}

}
