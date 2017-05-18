package windows;

import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class JListTest extends JFrame{

	public JListTest() {
		
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setTitle("JList Test");
		super.setSize(300, 200);
		
		addList();
		
		
		super.setVisible(true);
	}

	public void addList() {
		
		//JList
		String[] fruits = new String[]{"사과", "수박", "포도", "딸기", "멜론"};
		
		JList<String> list = new JList<String>(fruits);
		
		JPanel p1 = new JPanel();
		p1.add(list);
		
		
		//JList, SCrollPane
		String[] tea = new String[]{"아메리카노", "홍차", "녹차", "카페라떼", "그린트라떼", "자몽티"};
		
		JList<String> teaList = new JList<String>(tea);
		
		teaList.setVisibleRowCount(3);			//표시할 항목 수
		JScrollPane sp = new JScrollPane(teaList);
		
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		/*
		 * _AS_NEEDED : 필요할 때 표시
		 * 
		 * _NEVER : 표시 안함
		 * 
		 * _ALWAYS : 항상 표시		 * 
		 */
		

		//JComboBox
		String[] noodle = new String[]{"신라면", "탄탄면", "짜파게티", "진라면", "진짜장", "너구리"};
		
		JComboBox<String> cb = new JComboBox<String>(noodle);
		cb.addItem("참깨라면");
		cb.setEditable(false);		//수정 가능 여부	
		cb.setSelectedIndex(2);		//-1 : 선택안함, 배열 Index
		
		JPanel p2 = new JPanel();
		p2.add(sp);
		p2.add(cb);
		
		JPanel p = new JPanel(new GridLayout(0,2));
		p.add(p1);
		p.add(p2);
		
		super.add(p);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JListTest();
	}

}
