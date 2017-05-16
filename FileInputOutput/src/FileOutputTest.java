import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class FileOutputTest {

	public static final String FILEPATH = "D:/test/out.txt";
	public static final int SIZE = 100;
	public static FileOutputStream output;
	
	public static void createFile() throws IOException {
		
		output = new FileOutputStream(FILEPATH);
		
	}
	
	public static void writeFile() throws IOException {
		

		for(int i=0 ; i< SIZE ; i++) {
			
			String data = "010 - " + String.valueOf(createNumbers()) + " - " + String.valueOf(createNumbers()) +"\r\n";
			
			output.write(data.getBytes());
		}
	}
	
	public static int createNumbers() {
		
		int numbers = (int)(Math.random()*9999) + 1;
		if( numbers < 1000 ) {
			numbers = createNumbers();
		} 
		return numbers;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {	
			
			createFile();
			writeFile();
			output.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
