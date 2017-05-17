package windows;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameTest extends JFrame {


	public FrameTest() {

		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(600, 600);
		super.setTitle("swing Test");

		Container cp = super.getContentPane();
		
		
		// borderLayout(좌우여백, 상하여백)
		// addBorderLayout(20, 30);

		// flowLayout - 좌 -> 우
		// addFlowLayout(); //default hGap, vGap : 5
		// addFlowLayout(FlowLayout.LEFT, 30, 30);
		//addFlowLayout(FlowLayout.LEFT);
		
		//gridLayout - 바둑판
		//addGridLayout();
		//addGridLayout(5, 10);
		//addGridLayout(5, 10, 5, 5);
		
		//boxLayout - 수직(Y_AXIS), 수평(X_AXIS) 배치
		//addBoxLayout(cp, BoxLayout.X_AXIS);

		//null
		
		// 버튼추가
//		for (int i = 1; i <= 10; i++) {
//			
//			addButton(String.valueOf(i), "North");
//		}
		
		
		removeLayout();
		
		addButton("btn1", 50, 100, 100, 30);
		addButton("btn2", 200, 100);
	

		decoration();
		super.setVisible(true);
		
	}

	// 프레임 배경색설정
	public void decoration() {

		Container pane = getContentPane();
		pane.setBackground(Color.yellow);
	}

	public void addButton(String label) {

		JButton btn = new JButton(label);
		super.add(btn);
	}

	public void addButton(String label, String position) {

		JButton btn = new JButton(label);
		super.add(btn, position);
	}
	
	public void addButton(String label, int x, int y, int w, int h) {

		JButton btn = new JButton(label);	
		btn.setSize(w, h);
		btn.setLocation(x, y);
		super.add(btn);
	}
	
	public void addButton(String label, int x, int y) {

		JButton btn = new JButton(label);	
		Dimension d = btn.getPreferredSize();	//현재 컴포넌트의 적절한 크기 반환
		btn.setSize(d);
		btn.setLocation(x, y);
		super.add(btn);
	}
	
	public void addBorderLayout(int hGap, int vGap) {

		BorderLayout borderLayout = new BorderLayout(hGap, vGap);
		super.setLayout(borderLayout);

	}

	public void addFlowLayout() {

		// default : hGap, vGap - 5
		FlowLayout flowLayout = new FlowLayout();
		super.setLayout(flowLayout);
	}

	public void addFlowLayout(int align) {

		FlowLayout flowLayout = new FlowLayout(align);
		super.setLayout(flowLayout);
	}

	public void addFlowLayout(int align, int hGap, int vGap) {

		FlowLayout flowLayout = new FlowLayout(align, hGap, vGap);
		super.setLayout(flowLayout);
	}
	
	public void addGridLayout() {
		
		GridLayout gridLayout = new GridLayout();
		super.setLayout(gridLayout);
	}
	
	public void addGridLayout(int rows, int cols) {
		
		GridLayout gridLayout = new GridLayout(rows, cols);
		super.setLayout(gridLayout);
	}
	
	public void addGridLayout(int rows, int cols, int hGap, int vGap) {
		
		GridLayout gridLayout = new GridLayout(rows, cols, hGap, vGap);
		super.setLayout(gridLayout);
	}
	
	public void addBoxLayout(Container target, int axis) {
		
		BoxLayout boxLayout = new BoxLayout(target, axis);
		target.setLayout(boxLayout);
	}
	
	public void removeLayout() {
		
		super.setLayout(null);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FrameTest myFrame = new FrameTest();

	}

}
