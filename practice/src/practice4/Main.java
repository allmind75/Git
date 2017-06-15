package practice4;

public class Main {

	private CGameObject[] objs;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main m = new Main();

		m.objs = new CGameObject[] { new CHuman(true, "민스크"), new COrc(false, "대장오크"), new COrc(true, "오크"),
				new CElf(true, "엘프") };

		for (int j = 0; j < m.objs.length; j++) {
			for (int i = 0; i < m.objs.length; i++) {

				if (j != i && m.objs[i].isState() && m.objs[j].isState() && (m.objs[j].getTag() != m.objs[i].getTag())) {
					m.objs[j].attack(m.objs[i]);
				}
			}
		}

	}

}
