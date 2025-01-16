package day14;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioBtn1 extends JFrame{
	public RadioBtn1() {
		setTitle("버튼 컴포넌트");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ButtonGroup gender = new ButtonGroup();
		JRadioButton radio1 = new JRadioButton("남");
		JRadioButton radio2 = new JRadioButton("여");
		//그룹으로 묶지 않으면 중복된다.
		
		gender.add(radio1);
		gender.add(radio2); // 그룹으로 묶어줘야 중복이 안 됨.
		
		c.add(radio1);
		c.add(radio2);
		
				
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadioBtn1 gui = new RadioBtn1();
	}

}
