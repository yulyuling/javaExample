package day13;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame2 extends JFrame{
	//BorderLayout
	public MyFrame2(){
		
		Container c = getContentPane();
		c.setBackground(Color.cyan);
		c.setLayout(new BorderLayout(10, 10));
		
		JButton btn1 = new JButton("1번버튼"); //버튼 생성자의 역할=버튼의 이름
		JButton btn2 = new JButton("2번버튼"); //버튼 생성자의 역할=버튼의 이름
		JButton btn3 = new JButton("3번버튼"); //버튼 생성자의 역할=버튼의 이름
		JButton btn4 = new JButton("4번버튼"); //버튼 생성자의 역할=버튼의 이름
		JButton btn5 = new JButton("5번버튼"); //버튼 생성자의 역할=버튼의 이름
		
		c.add(btn1, BorderLayout.EAST);
		c.add(btn2, BorderLayout.WEST);
		c.add(btn3, BorderLayout.NORTH);
		c.add(btn4, BorderLayout.SOUTH);
		c.add(btn5, BorderLayout.CENTER);
		
		
		//요 밑에 3개는 무조건 필수다!
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		MyFrame2 gui = new MyFrame2();
	}
	}

