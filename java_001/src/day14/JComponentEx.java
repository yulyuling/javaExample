package day14;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JComponentEx extends JFrame {
	public JComponentEx() {
		
		setTitle("버튼 컴포넌트");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("색상 버튼");
		JButton btn2 = new JButton("비활성 버튼");
		JButton btn3 = new JButton("버튼 활성화");
		
		btn1.setBackground(Color.gray);
		btn1.setForeground(Color.green);
		btn1.setFont(new Font("", Font.PLAIN, 30)); // 
		
		btn2.setEnabled(false);
		
//		btn3.remove(btn1);
		btn3.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				btn2.isEnabled();  //enabled ==활성화됬는지 안됬는지 확인
				btn2.setEnabled(!btn2.isEnabled());
//				btn1.setVisible(false);//1. 화면에서 보이지 않게함.
				c.remove(btn1); //삭제 되지 않음=내부적으로는 사라졌지만,
								//화면에서 갱신이 안 돼서 삭제가 안된 것처럼 보임.
				revalidate();//레이아웃 매니저에게 레이아웃을 다시 계산하도록 요청.
				repaint(); //컴포넌트의 그래픽을 다시 그리도록 요청
			}
		});
		
		
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JComponentEx();
		

	}

}
