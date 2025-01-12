package Review2025_01_12;

public class MyFriendInfo{

	String name;
	int age;
	
	MyFriendInfo(String name, int age){
		this.name = name;
		this.age = age;
	}
	void FriendInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
}
