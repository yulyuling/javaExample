package day14;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEx extends JFrame {
	public ButtonEx() {
		
		// TODO Auto-generated method stub
		setTitle("버튼 컴포넌트");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon image1 = new ImageIcon("image/icon1.png");
		ImageIcon image2 = new ImageIcon("image/icon2.png");
		ImageIcon image3 = new ImageIcon("image/icon3.png");
		
		JButton btn = new JButton(image1);
		btn.setRolloverIcon(image2);
		btn.setPressedIcon(image3);
		c.add(btn);		
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new ButtonEx();
	}
}
