package exception;

public class CustomExceptionEx {
	public static void main(String[] args) {
		// ��ü����
		User user = new User();
		
		try {
			user.setAge(-9);	// ���̴� ���� x, 150�̻� x
		} catch (UserAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
