package Review2025_01_12;

public class MyFriendDetaInfo extends MyFriendInfo{
	
	
	String addr;
	String phoneNum;
	
	MyFriendDetaInfo(String name, int age, String addr, String phoneNum){
		super(name, age);
		this.addr = addr;
		this.phoneNum = phoneNum;
	}
	void showFriendInfo() {
		FriendInfo();
		System.out.println("주소: " + addr);
		System.out.println("전화번호: " + phoneNum);
	}
}
