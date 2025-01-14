package day13;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

 class BtnEvent1 extends JFrame{
	
	public BtnEvent1(){
		setTitle("첫번째 GUI");
		Container c = getContentPane();
		c.setBackground(Color.cyan);
		
		c.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("Action");
		btn1.addActionListener(new MyEvent());//클래스로 만든 객체가 필요함		
		c.add(btn1);
		
		JButton btn2 = new JButton("Action");
		btn1.addActionListener(new MyEvent());//클래스로 만든 객체가 필요함		
		c.add(btn2);

		
		//요 밑에 3개는 무조건 필수다!
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		BtnEvent1 gui = new BtnEvent1();
	}
}
	 class MyEvent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton btn = (JButton)e.getSource();
			if(btn.getText().equals("Action")) {
				btn.setText("액션");
			} else {
				btn.setText("Action");
			
			}
		}

			
	}
		
