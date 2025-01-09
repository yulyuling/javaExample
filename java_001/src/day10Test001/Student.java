package day10Test001;

import java.util.Scanner;

public class Student {
		Scanner scan = new Scanner(System.in);
			
		
	public int stuNo;
	public String stuName;
	public String stuDept;
	public int age;
	public String gender;
	
		Student(String stuName, int stuNo){
			//(int stuNo, String stuName, String stuDept)
			this.stuNo = stuNo;
			this.stuName = stuName;
			//this(stuNo, stuName, "");
		}
		Student(String stuName, int stuNo, String stuDept){
			this.stuNo = stuNo;
			this.stuName = stuName;
			this.stuDept = stuDept;
		}
		
		public void setInfo(int age, String gender){
			this.age = age;
			this.gender = gender; //수정 전 scan.next();		
		}
		public int getAge() { //리턴타입이니까 리턴타입 int를 넣는다.
			return age; 
		}
		@Override
		public String toString() {
		return(stuName + "학생의 학번은 " + stuNo+ " 나이는 " + age);
		}
	} 

