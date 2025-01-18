package Character;

public class CharacterIsLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input = "hello";

	        // 정규식으로 검증
	        if (input.matches("[a-zA-Z]+")) { // 알파벳만 포함
	            System.out.println("문자열은 알파벳만 포함합니다.");
	        } else {
	            System.out.println("문자열에 알파벳 이외의 문자가 포함되어 있습니다.");
	        }
	    	
	    }
         String input = "hello123";
         boolean isValid = true;
	            
	        for (char c : input.toCharArray()) {
	           if (!Character.isLetter(c)) { // 알파벳이 아니면
	                isValid = false;
	                break;
	            }
	        }

	        if (isValid) {
	            System.out.println("문자열은 알파벳만 포함합니다.");
	        } else {
	            System.out.println("문자열에 알파벳 이외의 문자가 포함되어 있습니다.");
	       }
	        
	        
	}

}
