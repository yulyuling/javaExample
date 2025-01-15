package day14;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BtnEvent1 extends JFrame{

	public BtnEvent1() {
		setTitle("익명 클래스");

		Container c = getContentPane();
		c.setBackground(Color.cyan);

		c.setLayout(new FlowLayout());
		JButton btn1 = new JButton("Action");
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton btn = (JButton) e.getSource();
				if(btn.getText().equals("Action")) {
					btn.setText("액션");
				} else {
					btn.setText("Action");
				}
			}
		});
		c.add(btn1);


		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BtnEvent1 gui = new BtnEvent1();
	}
}
