import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		System.out.println("[Array]");
		// 1. ¹è¿­
		Info[] infoArr = new Info[5];

		for (int i = 0; i < infoArr.length; i++) {

			Info in = new Info();
			String str = String.valueOf(i);

			in.setId(str);
			in.setPass(str);
			in.setName(str);
			in.setPhone(str);
			in.setEmail(str);

			infoArr[i] = in;
		}

		for (int i = 0; i < infoArr.length; i++) {
			System.out.print(infoArr[i].getId() + " ");
			System.out.print(infoArr[i].getPass() + " ");
			System.out.print(infoArr[i].getName() + " ");
			System.out.print(infoArr[i].getPhone() + " ");
			System.out.println(infoArr[i].getEmail() + " ");
		}

		System.out.println("\n[ArrayLlist]");
		// 2. ArrayList
		ArrayList<Info> list = new ArrayList<Info>();

		for (int i = 0; i < 5; i++) {
			
			Info in2 = new Info();
			String str2 = String.valueOf(i);
			
			in2.setId(str2);
			in2.setPass(str2);
			in2.setName(str2);
			in2.setPhone(str2);
			in2.setEmail(str2);
			
			list.add(in2);			
		}
		
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.print(list.get(i).getId() + " ");
			System.out.print(list.get(i).getPass() + " ");
			System.out.print(list.get(i).getName() + " ");
			System.out.print(list.get(i).getPhone() + " ");
			System.out.println(list.get(i).getEmail() + " ");
		}

	}

}
