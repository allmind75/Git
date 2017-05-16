import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			byte[] buff = new byte[2048];

			FileInputStream input = new FileInputStream("D://test//test.txt");

			int readSize = input.read(buff);
			System.out.println("size : " + readSize);
			String s;
			int idx = 0;

			s = new String(buff, idx, readSize);

			System.out.println(s);

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
