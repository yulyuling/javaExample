package day15;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxEx1 extends JFrame{

	public CheckBoxEx1() {
		setTitle("익명 클래스");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JCheckBox check1 = new JCheckBox("사과");
		JCheckBox check2 = new JCheckBox("배", true);
		ImageIcon icon1 = new ImageIcon("image/icon1.png");
		ImageIcon icon2 = new ImageIcon("image/icon2.png");
		JCheckBox check3 = new JCheckBox(icon1);
		
		check3.setBorderPainted(true);
		check3.setSelectedIcon(icon2);
		
		c.add(check1);
		c.add(check2);
		c.add(check3);
		
		
		
		
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}	
	
	public static void main(String[] args) {
		new CheckBoxEx1();
		

	}

}
