package windows;

import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Windows extends JFrame{

	Button button = new Button("btn");
	
	public Windows() {
		
		//frame size
		setSize(500, 500);
		
		//frame ���̱�
		setVisible(true);
		
		//frame ��ġ
		setLocation(100, 100);
		
		//frame ����
		setTitle("�������α׷�");
		
		//x��ư Ŭ���� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//frmae
		add(button);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Windows win = new Windows();
		
	}

	
	@Override
	public void paint(Graphics g) {
		
		g.setColor(Color.blue);
		
		//���׸���
		g.drawOval(150, 70, 80, 80);
		g.fillOval(10, 50, 100, 100);
		
		//�簢��
		g.setColor(new Color(151, 0, 51));
		g.drawRect(400, 400, 50, 50);
		
		
		//�ﰢ��
		g.setColor(Color.red);
		g.drawLine(150, 150, 165, 180);
		g.drawLine(150, 150, 135, 180);
		g.drawLine(135, 180, 165, 180);
		
		int x[] = new int[]{300, 275, 325};
		int y[] = new int[]{300, 350, 350};
		g.drawPolygon(x, y, 3);
	}
}
