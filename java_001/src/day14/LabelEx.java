package day14;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelEx extends JFrame {
	public LabelEx() {
		
	setTitle("익명 클래스");
	Container c = getContentPane();
	c.setLayout(new FlowLayout());
	JLabel label = new JLabel("자바 재밌다");
	
	c.add(label);
	ImageIcon image1 = new ImageIcon("image/ff.jpg");
	Image image = image1.getImage();
    Image scaledImage = image.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
    ImageIcon scaledIcon = new ImageIcon(scaledImage);
	
	JLabel label2 = new JLabel(scaledIcon);
	c.add(label2);
	
	ImageIcon icon1 = new ImageIcon("image/icon1.png");
	JLabel label3 = new JLabel("자바 싫어!", icon1, SwingConstants.CENTER);
	c.add(label3);
	
	
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(1000, 1000);
	setVisible(true);
	
	

	}
	public static void main(String[] args) {
		LabelEx ex = new LabelEx();
	}

}
