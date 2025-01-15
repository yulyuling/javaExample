package day14;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;

public class ClickAndDoubleClickEx extends JFrame{
	public ClickAndDoubleClickEx() {
		setTitle("랜덤 색상");
		Container c = getContentPane();
		Random ran = new Random();
		
		c.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if(e.getClickCount() == 2) {
				int r = ran.nextInt(256);
				int g = ran.nextInt(256);
				int b = ran.nextInt(256);
			}

		}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClickAndDoubleClickEx();
	}

}
