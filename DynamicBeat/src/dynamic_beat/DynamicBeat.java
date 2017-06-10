package dynamic_beat;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DynamicBeat extends JFrame {

	private Image screenImage;
	private Graphics screenGraphic;
	
	private Image introBg = new ImageIcon("res/intro_bg.jpg").getImage();
	private Music introMusic = new Music("introMusic.mp3", true);
	
	private ImageIcon exitHoberButtonImg = new ImageIcon("res/exitHoverButton.png");
	private ImageIcon exitButtonImg = new ImageIcon("res/exitButton.png");
	
	private JLabel menuBar = new JLabel(new ImageIcon("res/menuBar.png"));
	private JButton exitButton = new JButton(exitButtonImg);
	

	
	private int mouseX, mouseY;
	
	public DynamicBeat() {
		
		super.setUndecorated(true);		//basic menu bar disable
		super.setTitle("Dynamic Beat");
		super.setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		super.setResizable(false);
		super.setLocationRelativeTo(null);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setVisible(true);
		super.setBackground(new Color(0, 0, 0, 0));
		super.setLayout(null);
		

		
		addExitButton();
		addMenuBar();
		introMusic.start();
	}
	
	@Override
	public void paint(Graphics g) {
		
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
	}
	
	public void screenDraw(Graphics g) {
		//double buffering
		g.drawImage(introBg, 0, 0, null);
		paintComponents(g);
		this.repaint();
	}
	
	public void addMenuBar() {
		
		menuBar.setBounds(0, 0, 1280, 30);		//position
		
		//mouse 클릭할 때 좌표 가져오기
		menuBar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
			}
		});
		
		menuBar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				
				setLocation(x - mouseX, y - mouseY);
				
			}
		});
		
		super.add(menuBar);
	}
	
	public void addExitButton() {
		
		exitButton.setBounds(1245,  4,  24, 24);
		exitButton.setBorderPainted(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setFocusPainted(false);
		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				exitButton.setIcon(exitHoberButtonImg);
				exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				exitButton.setIcon(exitButtonImg);
				exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0);
			}
		});
		
		super.add(exitButton);
	}
}
