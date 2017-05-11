package zoo;

public class Main {

	
	public static void main(String[] args) {
		
		IManageInfo[] zoo = new IManageInfo[]{
				new CMammal("레오", "사자", "유재석", 2, 123456),
				new CMammal("호돌이", "호랑이", "강호동", 1, 123456),
				new CBird("핑크", "홍학", "김연아", 3, "2016.12.26", 223457),
				new CBird("장금이", "앵무새", "이하늘", 0.5, "2016.12.27", 223458)};
		
		System.out.println("[이름\t" + "종류\t" + "관리인\t" + "나이\t" + "AI예방접종일\t" + "관리번호]" );
		
		for(IManageInfo z: zoo) {
			System.out.println(z.getName() + "\t" + z.getKind() + "\t" + z.getManagerName() + "\t"
					+ z.getAge() + "\t" + z.getAIPreventDay() + "\t" + z.getNum());
		}
	}
}
