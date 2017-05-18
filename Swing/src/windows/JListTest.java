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
		String[] fruits = new String[]{"���", "����", "����", "����", "���"};
		
		JList<String> list = new JList<String>(fruits);
		
		JPanel p1 = new JPanel();
		p1.add(list);
		
		
		//JList, SCrollPane
		String[] tea = new String[]{"�Ƹ޸�ī��", "ȫ��", "����", "ī���", "�׸�Ʈ��", "�ڸ�Ƽ"};
		
		JList<String> teaList = new JList<String>(tea);
		
		teaList.setVisibleRowCount(3);			//ǥ���� �׸� ��
		JScrollPane sp = new JScrollPane(teaList);
		
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		/*
		 * _AS_NEEDED : �ʿ��� �� ǥ��
		 * 
		 * _NEVER : ǥ�� ����
		 * 
		 * _ALWAYS : �׻� ǥ��		 * 
		 */
		

		//JComboBox
		String[] noodle = new String[]{"�Ŷ��", "źź��", "¥�İ�Ƽ", "�����", "��¥��", "�ʱ���"};
		
		JComboBox<String> cb = new JComboBox<String>(noodle);
		cb.addItem("�������");
		cb.setEditable(false);		//���� ���� ����	
		cb.setSelectedIndex(2);		//-1 : ���þ���, �迭 Index
		
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
