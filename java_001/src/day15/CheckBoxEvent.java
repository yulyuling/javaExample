package day15;

import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxEvent extends JFrame{
	public CheckBoxEvent() {
			
		
	setTitle("컴포넌트");
	Container c = getContentPane();
	c.setLayout(new FlowLayout());
//	JLabel label = new JLabel("사과 1000원, 배 200원, 체리 3000원");
	
	JLabel Label = new JLabel("사과 1000원, 배 200원, 체리 3000원");
	JLabel result = new JLabel("현재 0원 입니다.");

	String [] names = {"사과", "배", "체리"};
	setTitle("사과 배 체리 선택");

	c.add(Label);

	for(int i=0; i<names.length; i++) {
		JCheckBox fruit = new JCheckBox(names[i]);
		fruit.setBorderPainted(true);
		fruit.addItemListener(new ItemListener() {
			
	
			public int sum = 0;						//0으로 초기화되고 있어서 계속 누를때마다 0이 됨.
			@Override
			public void itemStateChanged(ItemEvent e) { //itemStateChanged -동작할때 실행됨
				JCheckBox fruit = (JCheckBox) e.getItem();
				if(e.getStateChange() == ItemEvent.SELECTED) {
					if(fruit.getText().equals("사과")) {							
						sum += 1000;
					} else if(fruit.getText().equals("배")) {
						sum += 200;
					} else {
						sum += 3000;
					}
					
					System.out.println(fruit.getText() + "가 선택되었음"); //e.getItem을 하면 객체가 나온다
				} else {
					if(fruit.getText().equals("사과")) {	
						sum -= 1000;
					} else if(fruit.getText().equals("배")) {
						sum -= 200;
					} else {
						sum -= 3000;
					}				
					System.out.println(fruit.getText() + "가 해제되었음");
				}
				result.setText("현재" + sum + "원 입니다.");
			}
		});
		c.add(fruit);
	}
	
	c.add(result);
	
	
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(250, 200);
	setVisible(true);
		
}
	public static void main(String[] args) {
		// TODO Auto-generated met	public static void main(String[] args) {
		new CheckBoxEvent();

	}

}
