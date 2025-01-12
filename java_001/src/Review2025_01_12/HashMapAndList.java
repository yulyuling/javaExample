package Review2025_01_12;

	
	import java.util.ArrayList; // ArrayList 사용을 위한 import
	import java.util.HashMap;  // HashMap 사용을 위한 import
	import java.util.Scanner;  // 사용자 입력을 받기 위한 Scanner import

	public class HashMapAndList { // 클래스 정의
	
	    Scanner scan = new Scanner(System.in); // 사용자 입력을 받는 Scanner 객체 생성

	    
	    //ArrayList = 여러사람의 정보를 관리하기 위해 사용
	    //리스트의 각 요소는 한 사람의 정보(HashMap)
	    //HashMap은 키-값 한 쌍으로 데이터를 저장함.
	    // 1.name: 2.이름 == name(키), 이름(값) <String, Object>
	    ArrayList<HashMap<String, Object>> list = new ArrayList<>();
	    // 사람 정보를 저장할 리스트 (ArrayList로 여러 사람의 정보를 관리
	    
	    void start() {
	    // 무한 반복문으로 메뉴를 계속 표시
	    while (true) {
	        // 사용자에게 메뉴를 출력
	        System.out.println("[ (1) 추가 (2) 확인 (3) 종료 ] ==> ");
	        int menu = scan.nextInt(); // 사용자가 입력한 메뉴 번호를 읽음

	        // (1) 추가: 새 사람 정보를 입력받아 저장
	        if (menu == 1) {
	            HashMap<String, Object> map = new HashMap<>(); // 한 사람의 정보를 담을 HashMap 생성
	            System.out.println("이름: ");
	            map.put("name", scan.next()); // 이름 입력받아 HashMap에 저장
	            System.out.println("나이: ");
	            map.put("age", scan.next()); // 나이 입력받아 HashMap에 저장
	            System.out.println("주소: ");
	            map.put("addr", scan.next()); // 주소 입력받아 HashMap에 저장
	            list.add(map); // 완성된 HashMap(사람 정보)을 리스트에 추가

	        // (2) 확인: 저장된 모든 사람 정보를 출력
	        } else if (menu == 2) {
	            for (int i = 0; i < list.size(); i++) { // 리스트의 크기만큼 반복
	                System.out.println((i + 1) + ". "); // 사람 번호 출력 (1부터 시작)
	                System.out.println("이름: " + list.get(i).get("name") + ", "); // 이름 출력
	                System.out.println("나이: " + list.get(i).get("age") + ", "); // 나이 출력
	                System.out.println("주소: " + list.get(i).get("addr")); // 주소 출력
	            }

	        // (3) 종료: 프로그램을 종료
	        } else if (menu == 3) {
	            System.out.println("종료되었습니다."); // 종료 메시지 출력
	            break; // 무한 반복문 종료

	        // (기타) 1~3 이외의 숫자를 입력한 경우
	        } else {
	            System.out.println("1~3번 중에 선택하세요."); // 안내 메시지 출력
	        }
	    }
	}
}
