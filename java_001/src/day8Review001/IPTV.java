package day8Review001;

public class IPTV extends ColorTV{ //캡슐화

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//결과 : 나의 IPTV는 192.1.1.2 주소의 32인치 2048컬러
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048); //"192.1.1.2" 주소에 32인치, 2048컬러
		iptv.printProperty();
	}
		
		public IPTV(String IP, int size, int color) {
			super(size, color);
			this.IP = IP;
	  
			
		
		}
	}

