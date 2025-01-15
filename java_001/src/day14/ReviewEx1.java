
	package day14;

	import java.awt.Container;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.util.Random;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;

	public class ReviewEx1 extends JFrame{
		private int checkNum = 1;
		
		private double startTime;
		private double endTime;
		private JLabel label;
		
		
		
		public ReviewEx1(){
			setTitle("랜덤 버튼 배치");
			Container c = getContentPane();
			c.setLayout(null);
			Random ran = new Random();
			
			
			for(int i=1; i<=10; i++) {
				JButton btn = new JButton(i + "");
				btn.setSize(50, 50);
				int x = ran.nextInt(700);
				int y = ran.nextInt(700);
				btn.setLocation(x,y);
				btn.addActionListener(new ActionListener() {
										//actionlistener 은 인터페이스; 오브젝트를 리턴.
										//그래서 JButton으로 다운캐스팅해줘야함.
					@Override
					public void actionPerformed(ActionEvent e) { //e에는 정보가있음
						// TODO Auto-generated method stub
						JButton btn = (JButton) e.getSource(); //e의 소스안에 버튼의 정보가 있다.
						//
						//"1" => 1
						int btnNum = Integer.parseInt(btn.getText());//텍스트안에 있는 글자를 가져온다.
						if(btnNum == checkNum) {
							btn.setVisible(false); //사라진 것 처럼 보이는
							checkNum++;
							if(checkNum == 2) {
								startTime = System.currentTimeMillis(); //시간을 가져올때씀.
							}
							if(checkNum == 11) {
								endTime = System.currentTimeMillis();
								double time = (endTime - startTime) / 1000;
								System.out.println(time + "초");
							}
						}
						
					}
				});
				c.add(btn);
			}
			
			
				
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(800, 800);
			setVisible(true);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ReviewEx1 myFrame = new ReviewEx1();
		
		}
	}


