package exception;

public class CustomExceptionEx {
	public static void main(String[] args) {
		// 객체생성
		User user = new User();
		
		try {
			user.setAge(-9);	// 나이는 음수 x, 150이상 x
		} catch (UserAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
