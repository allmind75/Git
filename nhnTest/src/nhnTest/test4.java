package nhnTest;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Scanner;

public class test4 {

	private static Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal = Calendar.getInstance();
		
		String yearPath = File.separator + cal.get(Calendar.YEAR);
		String monthPath = yearPath + File.separator + new DecimalFormat("00").format(cal.get(Calendar.MONTH) + 1);
		String datePath = monthPath + File.separator + new DecimalFormat("00").format(cal.get(Calendar.DATE));
		
		String path = "C:\\upload";
		
		System.out.println(monthPath);
		System.out.println(datePath);
		
		System.out.println(new File(path + datePath).exists());
		
		
	}

	public static void solution() {
		
		
	}
}
