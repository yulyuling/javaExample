package day13;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame3 extends JFrame{
	//BorderLayout
	public MyFrame3(){
		
		Container c = getContentPane();
		c.setBackground(Color.cyan);
		GridLayout grid = new GridLayout(4,3);
		grid.setVgap(5);
		grid.setHgap(5);
		c.setLayout(grid);
		
		for(int i = 1; i<=9; i++) {
			c.add(new JButton("" + i));
		}		
		c.add(new JButton("+"));
		c.add(new JButton("0"));
		c.add(new JButton("="));
		
		
		//요 밑에 3개는 무조건 필수다!
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		MyFrame3 gui = new MyFrame3();
	}
	}


