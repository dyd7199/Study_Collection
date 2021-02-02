package exception;

public class UserAgeException extends Exception {
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "입력 바운더리 초과";
	}
}
